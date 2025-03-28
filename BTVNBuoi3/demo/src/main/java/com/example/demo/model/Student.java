package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "full_name", length = 100, nullable = false)
    String name;
    @Column(name = "email", length = 150, unique = true)
    String email;
    @Column(name = "phone_number", length = 15)
    String phone;
    @Column(name = "home_address", columnDefinition = "TEXT")
    String address;
}
