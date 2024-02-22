package com.cromero.rest.ws.restfulwebservices.resource;

import com.cromero.rest.ws.restfulwebservices.dto.Post;
import com.cromero.rest.ws.restfulwebservices.dto.User;
import com.cromero.rest.ws.restfulwebservices.exception.UserNotFoundException;
import com.cromero.rest.ws.restfulwebservices.repository.PostRepository;
import com.cromero.rest.ws.restfulwebservices.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserWithJPAResource {

    private UserRepository userRepository;
    private PostRepository postRepository;

    public UserWithJPAResource(UserRepository repository, PostRepository postRepository) {
        this.userRepository = repository;
        this.postRepository = postRepository;
    }

    @GetMapping(path = "/jpa/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/jpa/users/{id}")
    public EntityModel<User> findOne(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        if (user == null) {
            throw new UserNotFoundException("id:" + id);
        }
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).findAll());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

    @PostMapping(path = "/jpa/users")
    public ResponseEntity<User> save(@Valid @RequestBody User user) {
        User savedUser = userRepository.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/jpa/users/{id}")
    public void deleteOne(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @GetMapping(path = "/jpa/users/{id}/posts")
    public List<Post> findAllPostsByUser(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("id:" + id);
        }
        return user.get().getPosts();
    }

    @PostMapping(path = "/jpa/users/{id}/posts")
    public ResponseEntity<Post> createPostForUser(@PathVariable Long id, @Valid @RequestBody Post post) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("id:" + id);
        }

        post.setUser(user.get());
        Post savedPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedPost.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
