package com.Farahnaz.service;


import com.Farahnaz.model.User;
import com.Farahnaz.repository.UserRepository;
import com.Farahnaz.util.PasswordUtil;

import java.util.Objects;

public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {

        this.userRepository = Objects.requireNonNull(userRepository);
    }

    //=========================normalized email and check duplication of
    // =========================email and then create new user
    public void register(String email, String password) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        String normalizedEmail = email.trim().toLowerCase();

        if (userRepository.findByEmail(normalizedEmail).isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }

        String passwordHash = PasswordUtil.hash(password);
        User user = new User(normalizedEmail, passwordHash);
        userRepository.save(user);
    }

    public User login(String email, String password) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }

        String normalizedEmail =email.trim().toLowerCase();

        User user = userRepository.findByEmail(normalizedEmail)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        if (!PasswordUtil.matches(password, user.getPasswordHash())) {
            throw new IllegalArgumentException("Invalid password");
        }

        return user;
    }
}
