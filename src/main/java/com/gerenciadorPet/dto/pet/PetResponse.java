package com.gerenciadorPet.dto.pet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PetResponse(
        @NotNull(message = "Id não pode ser nulo")
        Long id,

        @NotBlank(message = "Nome é obrigatório")
        String name,

        @NotBlank(message = "Raça é obrigatória")
        String breed,

        @Positive(message = "Peso deve ser maior que zero")
        double weight,

        @Positive(message = "Altura deve ser maior que zero")
        double height
) {}
