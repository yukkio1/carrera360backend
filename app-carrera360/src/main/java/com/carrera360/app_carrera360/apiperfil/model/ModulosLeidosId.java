package com.carrera360.app_carrera360.apiperfil.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ModulosLeidosId implements Serializable {

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "id_modulo")
    private int idModulo;

    // Constructors, equals(), hashCode()

    public ModulosLeidosId() {
    }

    public ModulosLeidosId(int idUsuario, int idModulo) {
        this.idUsuario = idUsuario;
        this.idModulo = idModulo;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ModulosLeidosId))
            return false;

        ModulosLeidosId that = (ModulosLeidosId) o;

        if (idUsuario != that.idUsuario)
            return false;
        return idModulo == that.idModulo;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + idModulo;
        return result;
    }
}