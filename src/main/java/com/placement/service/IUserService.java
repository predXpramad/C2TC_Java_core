package com.placement.service;

import com.placement.entity.User;

import java.util.Optional;

public interface IUserService {
    User register(User user);
    Optional<User> findByUsername(String username);
    boolean checkCredentials(String username, String rawPassword);
}
