package com.pamionj.usermanagementapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserRequest {

    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    @Email(message = "Debe ser un email válido")
    @NotBlank(message = "El email no puede estar vacío")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}