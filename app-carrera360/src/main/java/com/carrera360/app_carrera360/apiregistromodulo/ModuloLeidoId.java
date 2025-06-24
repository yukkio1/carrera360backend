package com.carrera360.app_carrera360.apiregistromodulo;

import java.io.Serializable;

public class ModuloLeidoId implements Serializable {

    private int idUsuario;
    private int idModulo;

    public ModuloLeidoId() {
    }

    public ModuloLeidoId(int idUsuario, int idModulo) {
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

    // equals() y hashCode()

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ModuloLeidoId))
            return false;

        ModuloLeidoId that = (ModuloLeidoId) obj;

        return idUsuario == that.idUsuario && idModulo == that.idModulo;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + idModulo;
        return result;
    }
}