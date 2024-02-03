package com.example.demo.services;

import com.example.demo.domains.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<List<User>> getAllUsers() {
        return userRepository.findAll().collectList();
    }
}
