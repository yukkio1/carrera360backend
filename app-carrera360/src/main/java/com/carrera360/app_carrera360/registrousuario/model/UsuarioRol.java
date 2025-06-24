package com.carrera360.app_carrera360.registrousuario.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios_roles")
public class UsuarioRol {
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "id_rol", nullable = false)
    private int idRol = 2;

    public UsuarioRol() {
    }

    public UsuarioRol(int idUsuario, int idRol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }
}
