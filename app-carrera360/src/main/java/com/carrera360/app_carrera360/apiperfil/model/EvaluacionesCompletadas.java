package com.carrera360.app_carrera360.apiperfil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "evaluaciones_completadas")
public class EvaluacionesCompletadas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluacion")
    private int idEvaluacion;

    @Column(name = "id_usuario")
    private int idUsuario;

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
