package br.com.lucasalves.projectpoo.controller;

import org.springframework.web.bind.annotation.*;

import br.com.lucasalves.projectpoo.model.User;
import br.com.lucasalves.projectpoo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    User create(@RequestBody User user) { 
        return userService.create(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        List<User> user = UserService.getAllUsers();
        return (List<User>) UserService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
 
}
