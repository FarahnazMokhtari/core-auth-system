package com.Farahnaz.repository;

import com.Farahnaz.model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);
    void save(User user);
}
