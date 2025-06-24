package com.carrera360.app_carrera360.apiperfil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "encuesta_inicial_respuesta")
public class EncuestaTotalRespuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta")
    private int idRespuesta;

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "respuesta")
    private String respuesta;

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
