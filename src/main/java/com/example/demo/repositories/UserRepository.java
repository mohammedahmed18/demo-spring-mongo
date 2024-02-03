package com.example.demo.repositories;

import com.example.demo.domains.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, String> {
}
