package com.picpaysimplificado.picpaysimplificado.repositores;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositore extends JpaRepository<User, Long> {
    Optional<User>findUserByDocument(String document);
    Optional<User>findUserById(Long id);
}
