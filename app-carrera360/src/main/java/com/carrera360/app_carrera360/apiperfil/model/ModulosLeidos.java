package com.carrera360.app_carrera360.apiperfil.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "modulos_leidos")
public class ModulosLeidos {

    @EmbeddedId
    private ModulosLeidosId id;

    @Column(name = "fecha_leido")
    private Timestamp fechaLeido;

    @Column(name = "mes_leido")
    private String mesLeido;

    // Getters y setters

    public ModulosLeidosId getId() {
        return id;
    }

    public void setId(ModulosLeidosId id) {
        this.id = id;
    }

    public Timestamp getFechaLeido() {
        return fechaLeido;
    }

    public void setFechaLeido(Timestamp fechaLeido) {
        this.fechaLeido = fechaLeido;
    }

    public String getMesLeido() {
        return mesLeido;
    }

    public void setMesLeido(String mesLeido) {
        this.mesLeido = mesLeido;
    }
}