package com.example.demo.entity; // Ensure this matches your project package structure

import jakarta.persistence.*;
import lombok.Data; // Optional: If you use Lombok

@Entity
@Table(name = "users")
@Data // This generates getters, setters, and constructors automatically
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    // Manually add Getters and Setters if you are NOT using Lombok:
    // Right-click -> Source -> Generate Getters and Setters
}