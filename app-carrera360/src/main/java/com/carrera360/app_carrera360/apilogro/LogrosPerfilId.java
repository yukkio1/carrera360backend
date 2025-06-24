package com.carrera360.app_carrera360.apilogro;

import java.io.Serializable;

public class LogrosPerfilId implements Serializable {

    private int idUsuario;
    private int idLogro;

    public LogrosPerfilId() {
    }

    public LogrosPerfilId(int idUsuario, int idLogro) {
        this.idUsuario = idUsuario;
        this.idLogro = idLogro;
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

    // equals() y hashCode()

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof LogrosPerfilId))
            return false;

        LogrosPerfilId that = (LogrosPerfilId) obj;

        return idUsuario == that.idUsuario && idLogro == that.idLogro;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + idLogro;
        return result;
    }
}