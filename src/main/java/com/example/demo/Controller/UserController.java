package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @GetMapping("/me")
    public ResponseEntity<?> getCurrentUser() {
        // This returns the currently authenticated user's name
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return ResponseEntity.ok("Current user: " + username);
    }
}