package com.juandmv.backend.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePhysicalLocationDto {

    @NotNull(message = "El nombre es obligatorio")
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    @NotNull(message = "La dirección es obligatoria")
    @NotBlank(message = "La dirección no puede estar vacía")
    private String address;
}
