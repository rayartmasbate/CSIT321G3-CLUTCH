package com.csit321g3._notfound.clutch.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.csit321g3._notfound.clutch.service.UserService;
import com.csit321g3._notfound.clutch.entity.UserEntity;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserService userv;

    public UserController() {

    }

    public UserController(UserService userv) {
        this.userv = userv;
    }

    @PostMapping("/postNewUser")
    public UserEntity postUser(@RequestBody UserEntity user) {
        return userv.postUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return userv.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userv.getUserById(id);
    }

    @PutMapping("/putUser")
    public UserEntity putUser(@RequestParam Long id, @RequestBody UserEntity newUserDetails) {
        return userv.putUser(id, newUserDetails);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userv.deleteUser(id);
    }

}
