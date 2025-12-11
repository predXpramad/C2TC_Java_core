package com.tnsif.user.service;

import com.tnsif.user.entity.User;
import com.tnsif.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserService {
    User addNewUser(User user);
    User updateUser(User user);
    User login(String name, String password);
    boolean logout(Integer userId);
    Optional<User> findById(Integer id);
}

@Service
@Transactional
class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User addNewUser(User user) {
        repo.findByName(user.getName()).ifPresent(u -> {
            throw new IllegalArgumentException("User already exists");
        });
        return repo.save(user);
    }

    @Override
    public User updateUser(User user) {
        if (user.getId() == null || !repo.existsById(user.getId())) {
            throw new IllegalArgumentException("User not found");
        }
        return repo.save(user);
    }

    @Override
    public User login(String name, String password) {
        return repo.findByName(name)
                .filter(u -> u.getPassword().equals(password))
                .orElseThrow(() -> new IllegalArgumentException("Invalid credentials"));
    }

    @Override
    public boolean logout(Integer userId) {
        return repo.existsById(userId);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return repo.findById(id);
    }
}
