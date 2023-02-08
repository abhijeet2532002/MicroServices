package com.example.AbhijeetUser.repository;

import com.example.AbhijeetUser.entity.AbhijeetUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbhijeetRepository extends JpaRepository<AbhijeetUser,String> {
}
