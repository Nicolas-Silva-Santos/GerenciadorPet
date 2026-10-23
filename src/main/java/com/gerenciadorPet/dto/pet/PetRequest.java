package com.gerenciadorPet.dto.pet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PetRequest(
        @NotBlank(message = "Nome é obrigatório")
        String name,

        @NotBlank(message = "Raça é obrigatória")
        String breed,

        @Positive(message = "Peso deve ser maior que zero")
        double weight,

        @Positive(message = "Altura deve ser maior que zero")
        double height,

        @NotNull(message = "Id do usuário é obrigatório")
        Long userId
) {}
