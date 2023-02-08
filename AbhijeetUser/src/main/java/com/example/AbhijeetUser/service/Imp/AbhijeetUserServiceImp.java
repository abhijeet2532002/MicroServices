package com.example.AbhijeetUser.service.Imp;

import com.example.AbhijeetUser.entity.AbhijeetUser;
import com.example.AbhijeetUser.exception.ResourceNotFoundException;
import com.example.AbhijeetUser.repository.AbhijeetRepository;
import com.example.AbhijeetUser.service.AbhijeetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AbhijeetUserServiceImp implements AbhijeetUserService {
    @Autowired
    private AbhijeetRepository repository;

    @Override
    public List<AbhijeetUser> getAllAbhijeetUser() {
        return repository.findAll();
    }

    @Override
    public AbhijeetUser getAbhijeetUser(String id) {
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Resource not Available ...."));
    }

    @Override
    public AbhijeetUser addAbhijeetUser(AbhijeetUser abhijeetUser) {
        abhijeetUser.setId(UUID.randomUUID().toString());
        return repository.save(abhijeetUser);
    }
}
