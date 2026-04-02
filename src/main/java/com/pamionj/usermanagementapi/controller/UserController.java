package com.pamionj.usermanagementapi.controller;
import com.pamionj.usermanagementapi.dto.UserRequest;
import com.pamionj.usermanagementapi.entity.User;
import com.pamionj.usermanagementapi.service.UserService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public User createUser(@Valid @RequestBody UserRequest request) {

        User user = new User(); // 👈 creamos entidad nueva

        user.setName(request.getName());   // 👈 copiamos datos
        user.setEmail(request.getEmail()); // 👈 copiamos datos

        return service.createUser(user); // 👈 guardamos igual que antes
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,
                           @Valid @RequestBody UserRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());

        return service.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
}