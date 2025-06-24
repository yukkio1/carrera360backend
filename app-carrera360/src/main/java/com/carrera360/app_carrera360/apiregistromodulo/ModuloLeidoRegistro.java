package com.carrera360.app_carrera360.apiregistromodulo;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "modulos_leidos")
@IdClass(ModuloLeidoId.class)
public class ModuloLeidoRegistro implements Serializable {

    @Id
    @Column(name = "id_usuario", nullable = false)
    private int idUsuario;

    @Id
    @Column(name = "id_modulo", nullable = false)
    private int idModulo;

    @Column(name = "fecha_leido", insertable = false, updatable = false)
    private String fechaLeido;

    @Column(name = "mes_leido", insertable = false, updatable = false)
    private String mesLeido;

    public ModuloLeidoRegistro() {
    }

    public ModuloLeidoRegistro(int idUsuario, int idModulo) {
        this.idUsuario = idUsuario;
        this.idModulo = idModulo;
    }

    // Getters y setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getFechaLeido() {
        return fechaLeido;
    }

    public void setFechaLeido(String fechaLeido) {
        this.fechaLeido = fechaLeido;
    }

    public String getMesLeido() {
        return mesLeido;
    }

    public void setMesLeido(String mesLeido) {
        this.mesLeido = mesLeido;
    }
}