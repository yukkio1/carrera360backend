package com.carrera360.app_carrera360.apiregistromodulo;

public class RegistroModuloDTO {
    private int idUsuario;
    private int idModulo;

    public RegistroModuloDTO() {
    }

    public RegistroModuloDTO(int idUsuario, int idModulo) {
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
}