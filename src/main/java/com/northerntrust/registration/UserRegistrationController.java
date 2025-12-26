package com.northerntrust.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/register")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> registerUser(@Valid @RequestBody UserRegistrationRequest request) {
        userService.registerUser(request);
        return ResponseEntity.ok("User registered successfully.");
    }
}