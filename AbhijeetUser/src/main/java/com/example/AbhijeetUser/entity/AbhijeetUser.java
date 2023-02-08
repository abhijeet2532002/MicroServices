package com.example.AbhijeetUser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AbhijeetUser {
    @Id
    private String id;
    private String name;
    private String email;
    private String mobile;
    @Transient
    private ArrayList<AbhijeetRating> ratings = new ArrayList<>();
}