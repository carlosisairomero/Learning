package com.cromero.rest.ws.restfulwebservices.service;

import com.cromero.rest.ws.restfulwebservices.dto.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private static List<User> users = new ArrayList<>();
    private static int count = 0;

    static {
        users.add(new User(++count, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++count, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++count, "Jim", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User save(User user) {
        user.setId(++count);
        users.add(user);
        return user;
    }

    public void deleteOne(int id) {
        users.removeIf(user -> user.getId().equals(id));
    }

}
