package com.Farahnaz.service;


import com.Farahnaz.model.User;
import com.Farahnaz.repository.UserRepository;

public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(String email, String password) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public User login(String email, String password) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}

