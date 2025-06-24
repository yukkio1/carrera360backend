package com.carrera360.app_carrera360.apiexamenregistro;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluacionCompletadaId implements Serializable {
    private Integer idUsuario;
    private Integer idEvaluacion;
}
