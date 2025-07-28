package com.crud.apirest.apirestful.Controller;

import com.crud.apirest.apirestful.dto.AuthRequest;
import com.crud.apirest.apirestful.dto.AuthResponse;
import com.crud.apirest.apirestful.model.User;
import com.crud.apirest.apirestful.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
            System.out.println("Intentando login...");

        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(authService.register(user));
    }
}
