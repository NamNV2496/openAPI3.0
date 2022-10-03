package com.openapi3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(servers = {@Server(url = "http://localhost:8080"), @Server(url = "https://localhost:8080")})
@SecurityScheme(name = "BearerJWT", bearerFormat = "JWT", scheme = "bearer", type = SecuritySchemeType.HTTP, description = "bearer token for this project")
public class Openapi3Application {

    public static void main(String[] args) {
        SpringApplication.run(Openapi3Application.class, args);
    }

}
