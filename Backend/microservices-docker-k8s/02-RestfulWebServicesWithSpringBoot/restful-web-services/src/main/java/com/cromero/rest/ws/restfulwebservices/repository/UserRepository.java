package com.cromero.rest.ws.restfulwebservices.repository;

import com.cromero.rest.ws.restfulwebservices.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
