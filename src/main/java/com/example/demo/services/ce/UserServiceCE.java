package com.example.demo.services.ce;

import com.example.demo.domains.User;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserServiceCE {
    Mono<List<User>> getAllUsers();

}
