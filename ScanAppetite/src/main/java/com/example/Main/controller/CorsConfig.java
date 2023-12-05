package com.example.Main.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8081") // Reemplaza con la URL de tu aplicación MVC
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true) //. Asegúrate de que esta configuración coincida con la configuración de app cliente ( app MVC).
                .maxAge(3600);
    }
}