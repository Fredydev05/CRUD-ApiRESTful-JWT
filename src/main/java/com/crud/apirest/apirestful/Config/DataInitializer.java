package com.crud.apirest.apirestful.Config;

import com.crud.apirest.apirestful.model.Role;
import com.crud.apirest.apirestful.model.User;
import com.crud.apirest.apirestful.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Crear usuario ADMIN por defecto
        if (userRepository.findByUsername("admin").isEmpty()) {
            User admin = User.builder()
                    .username("admin")
                    .password(passwordEncoder.encode("123456"))
                    .role(Role.ADMIN)
                    .build();
            userRepository.save(admin);
            System.out.println("🛠️ Usuario ADMIN creado: admin / 123456");
        }

        // Crear usuario USER por defecto para pruebas
        if (userRepository.findByUsername("user").isEmpty()) {
            User user = User.builder()
                    .username("user")
                    .password(passwordEncoder.encode("123456"))
                    .role(Role.USER)
                    .build();
            userRepository.save(user);
            System.out.println("👤 Usuario USER creado: user / 123456");
        }
    }
}