package com.carrera360.app_carrera360.encuesta.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "encuesta_inicial_respuesta")
public class EncuestaInicioRespuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta")
    private int idRespuesta;

    @Column(name = "id_usuario", nullable = false)
    private int idUsuario;

    @Column(name = "id_pregunta", nullable = false)
    private int idPregunta;

    @Column(name = "id_alternativa", nullable = false)
    private int idAlternativa;

    @Column(name = "estado", nullable = false)
    private int estado = 1;

    @Column(name = "fecha_inicio_app", nullable = false)
    private LocalDateTime fechaInicioApp = LocalDateTime.now();

    @Column(name = "respuesta", nullable = false)
    private String respuesta;

    // Getters
    public int getIdRespuesta() {
        return idRespuesta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public int getIdAlternativa() {
        return idAlternativa;
    }

    public int getEstado() {
        return estado;
    }

    public LocalDateTime getFechaInicioApp() {
        return fechaInicioApp;
    }

    public String getRespuesta() {
        return respuesta;
    }

    // Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public void setIdAlternativa(int idAlternativa) {
        this.idAlternativa = idAlternativa;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setFechaInicioApp(LocalDateTime fechaInicioApp) {
        this.fechaInicioApp = fechaInicioApp;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
