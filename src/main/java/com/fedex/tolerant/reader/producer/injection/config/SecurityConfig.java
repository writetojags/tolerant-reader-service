package com.fedex.tolerant.reader.producer.injection.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())           // Disable CSRF protection
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()           // Allow all requests (customize as needed)
            );

        return http.build();
    }
}


