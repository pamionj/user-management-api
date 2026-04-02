package com.pamionj.usermanagementapi.service;
import org.springframework.stereotype.Service;
import java.util.List;
import com.pamionj.usermanagementapi.entity.User;
import com.pamionj.usermanagementapi.repository.UserRepository;


import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public User getUserById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public User updateUser(Long id, User updatedUser) {
        User existing = getUserById(id);

        existing.setName(updatedUser.getName());
        existing.setEmail(updatedUser.getEmail());

        return repository.save(existing);
    }

    public void deleteUser(Long id) {
        User user = getUserById(id);
        repository.delete(user);
    }
}