package com.placement.service;

import com.placement.entity.User;
import com.placement.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public UserService(UserRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @Override
    public User register(User user) {
        if (repo.existsByUsername(user.getUsername())) {
            throw new IllegalArgumentException("username already exists");
        }
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }

    @Override
    public boolean checkCredentials(String username, String rawPassword) {
        Optional<User> opt = repo.findByUsername(username);
        return opt.filter(user -> encoder.matches(rawPassword, user.getPassword())).isPresent();
    }
}
