package com.bankease.config;

import com.bankease.entity.Role;
import com.bankease.entity.User;
import com.bankease.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SeedDataConfig {
    @Bean
    CommandLineRunner seedDemoUser(UserRepository users, PasswordEncoder encoder) {
        return args -> {
            String email = "ad1028919@gmail.com";
            if (!users.existsByEmail(email)) {
                users.save(User.builder()
                        .email(email)
                        .password(encoder.encode("BankEase@123"))
                        .role(Role.USER)
                        .enabled(true)
                        .build());
            }
        };
    }
}
