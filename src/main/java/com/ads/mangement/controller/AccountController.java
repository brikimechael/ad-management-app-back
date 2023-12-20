package com.ads.mangement.controller;

import com.ads.mangement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    UserRepository userRepository;
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")

    ResponseEntity<?> addRole(){
        return ResponseEntity.ok(userRepository.findAll());
    }

}
