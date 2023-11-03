package br.com.lucasalves.projectpoo.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.lucasalves.projectpoo.model.User;
import br.com.lucasalves.projectpoo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    //public UserController(UserService userService) {
        //this.userService = userService;
    //}

    @PostMapping
    User create(@RequestBody User user) { 
        return userService.create(user);
    }
 
}
