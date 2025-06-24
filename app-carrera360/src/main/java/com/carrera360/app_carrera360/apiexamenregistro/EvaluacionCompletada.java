package com.carrera360.app_carrera360.apiexamenregistro;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "evaluaciones_completadas")
@IdClass(EvaluacionCompletadaId.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluacionCompletada {

    @Id
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Id
    @Column(name = "id_evaluacion")
    private Integer idEvaluacion;

    @Column(name = "fecha_completada", insertable = false, updatable = false)
    private java.time.LocalDateTime fechaCompletada;
}
