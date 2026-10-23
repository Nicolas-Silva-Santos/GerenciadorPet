package com.gerenciadorPet.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRequest(
        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Email inválido")
        String email,

        @NotNull(message = "Id não pode ser nulo")
        Long id,

        @NotBlank(message = "Username é obrigatório")
        String username,

        @NotNull(message = "Admin não pode ser nulo")
        Boolean admin,

        @NotNull(message = "active não pode ser nulo")
        Boolean active
) {

}
