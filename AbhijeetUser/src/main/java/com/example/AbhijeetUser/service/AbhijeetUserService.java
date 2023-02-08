package com.example.AbhijeetUser.service;

import com.example.AbhijeetUser.entity.AbhijeetUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AbhijeetUserService {
    List<AbhijeetUser> getAllAbhijeetUser();
    AbhijeetUser getAbhijeetUser(String id);
    AbhijeetUser addAbhijeetUser(AbhijeetUser abhijeetUser);
}