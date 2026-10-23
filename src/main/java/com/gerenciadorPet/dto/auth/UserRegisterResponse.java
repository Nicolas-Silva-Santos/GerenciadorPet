package com.gerenciadorPet.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRegisterResponse(
        @NotNull(message = "Id não pode ser nulo")
        Long id,

        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Email inválido")
        String email,

        @NotBlank(message = "Username é obrigatório")
        String username
) {}