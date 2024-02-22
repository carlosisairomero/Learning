package com.cromero.rest.ws.restfulwebservices.resource;

import com.cromero.rest.ws.restfulwebservices.service.UserService;
import com.cromero.rest.ws.restfulwebservices.dto.User;
import com.cromero.rest.ws.restfulwebservices.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private UserService userDao;

    public UserResource(UserService userDao) {
        this.userDao = userDao;
    }

    @GetMapping(path = "/users")
    public List<User> findAll() {
        return userDao.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public EntityModel<User> findOne(@PathVariable int id) {
        User user = userDao.findOne(id);
        if (user == null) {
            throw new UserNotFoundException("id:" + id);
        }
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).findAll());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<User> save(@Valid @RequestBody User user) {
        User savedUser = userDao.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteOne(@PathVariable int id) {
        userDao.deleteOne(id);
    }

}
