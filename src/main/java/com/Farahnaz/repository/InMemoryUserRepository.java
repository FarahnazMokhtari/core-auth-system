package com.Farahnaz.repository;

import com.Farahnaz.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> storage = new HashMap<>();

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(storage.get(email));
    }

    @Override
    public void save(User user) {
        storage.put(user.getEmail(), user);
    }
}
