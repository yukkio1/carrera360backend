package com.carrera360.app_carrera360.apiconfirmacion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "encuesta_inicial_respuesta") // ✅ Nombre correcto de la tabla en la BD
public class EncuestaInicialRespuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta") // ✅ Ajustado según la estructura de la tabla
    private int idRespuesta;

    @Column(name = "id_usuario") // ✅ Ahora usamos la columna correcta para la búsqueda
    private int idUsuario;

    @Column(name = "id_pregunta")
    private int idPregunta;

    @Column(name = "id_alternativa")
    private int idAlternativa;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_inicio_app")
    private String fechaInicioApp;

    // ✅ Getters y Setters
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

    public String getEstado() {
        return estado;
    }

    public String getFechaInicioApp() {
        return fechaInicioApp;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public void setIdAlternativa(int idAlternativa) {
        this.idAlternativa = idAlternativa;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaInicioApp(String fechaInicioApp) {
        this.fechaInicioApp = fechaInicioApp;
    }
}
