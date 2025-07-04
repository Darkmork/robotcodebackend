package com.desafios.robotcode.dto;

import com.desafios.robotcode.model.EstadoProgreso;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgresoUsuarioDto {
    private Long id;
    private Long usuarioId;
    private Long problemaId;
    private EstadoProgreso estado;
    private int intentos;
    private LocalDateTime ultimaModificacion;

    // Getters y setters
}
