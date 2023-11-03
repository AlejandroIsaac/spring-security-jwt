package com.jaax.jwt.service;

import com.jaax.jwt.controller.model.AuthResponse;
import com.jaax.jwt.controller.model.AuthenticateRequest;
import com.jaax.jwt.controller.model.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest registerRequest);
    AuthResponse authenticate(AuthenticateRequest authenticateRequest);
}
