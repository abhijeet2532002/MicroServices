package com.example.AbhijeetUser.controller;

import com.example.AbhijeetUser.entity.AbhijeetUser;
import com.example.AbhijeetUser.service.AbhijeetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AbhijeetUserController {
    @Autowired
    private AbhijeetUserService service;
    @GetMapping
    public List<AbhijeetUser> getAllAbhijeetUser() {
        return service.getAllAbhijeetUser();
    }
    @GetMapping("/{id}")
    public AbhijeetUser getAbhijeetUser(@PathVariable("id") String id) {
        return service.getAbhijeetUser(id);
    }

    @PostMapping
    public AbhijeetUser addAbhijeetUser(@RequestBody AbhijeetUser user) {
        return service.addAbhijeetUser(user);
    }
}
