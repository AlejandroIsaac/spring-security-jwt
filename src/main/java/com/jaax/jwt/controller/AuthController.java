package com.jaax.jwt.controller;

import com.jaax.jwt.controller.model.AuthResponse;
import com.jaax.jwt.controller.model.AuthenticateRequest;
import com.jaax.jwt.controller.model.RegisterRequest;
import com.jaax.jwt.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/authentication")
    ResponseEntity<AuthResponse> authenticate(@RequestBody AuthenticateRequest request){
        return ResponseEntity.ok(authService.authenticate(request));
    }
}
