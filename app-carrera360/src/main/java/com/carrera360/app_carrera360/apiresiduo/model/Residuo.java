package com.carrera360.app_carrera360.apiresiduo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "logros_perfil")
public class Residuo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int id_usuario;
    private int id_logro;
    private LocalDateTime fecha_logro;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_logro() {
        return id_logro;
    }

    public void setId_logro(int id_logro) {
        this.id_logro = id_logro;
    }

    public LocalDateTime getFecha_logro() {
        return fecha_logro;
    }

    public void setFecha_logro(LocalDateTime fecha_logro) {
        this.fecha_logro = fecha_logro;
    }
}