package com.carrera360.app_carrera360.apilogro;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "logros_perfil")
@IdClass(LogrosPerfilId.class)
public class LogrosPerfil implements Serializable {

    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    @Id
    @Column(name = "id_logro")
    private int idLogro;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_logro")
    private String fechaLogro;

    public LogrosPerfil() {
    }

    public LogrosPerfil(int idUsuario, int idLogro, String estado, String fechaLogro) {
        this.idUsuario = idUsuario;
        this.idLogro = idLogro;
        this.estado = estado;
        this.fechaLogro = fechaLogro;
    }

    // Getters y setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLogro() {
        return idLogro;
    }

    public void setIdLogro(int idLogro) {
        this.idLogro = idLogro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaLogro() {
        return fechaLogro;
    }

    public void setFechaLogro(String fechaLogro) {
        this.fechaLogro = fechaLogro;
    }
}