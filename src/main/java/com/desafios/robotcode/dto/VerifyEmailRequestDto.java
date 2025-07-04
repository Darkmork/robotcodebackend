package com.desafios.robotcode.dto;

import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Data
public class VerifyEmailRequestDto {
    
    @NotBlank(message = "El correo electrónico es requerido")
    @Email(message = "Formato de correo electrónico inválido")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@(mtn\\.cl|alumnos\\.mtn\\.cl)$", 
             message = "Solo se permiten correos con dominios @mtn.cl o @alumnos.mtn.cl")
    private String email;
    
    @NotBlank(message = "El código de verificación es requerido")
    @Pattern(regexp = "^\\d{6}$", message = "El código debe ser de 6 dígitos")
    private String verificationCode;
}