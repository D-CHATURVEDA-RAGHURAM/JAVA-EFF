package com.example.restapi.usecase.employee.student.project.service;

import com.example.restapi.usecase.employee.student.project.entity.User;
import com.example.restapi.usecase.employee.student.project.repo.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user) {
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        System.out.println("Hashed Password Before Save: " + hashedPassword);
        user.setPassword(hashedPassword);
        return userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
