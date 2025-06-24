package com.carrera360.app_carrera360.apimodulofaltante;

public class ModuloFaltanteDTO {

    private int idModulo;
    private String nombreModulo;
    private String lugar;

    public ModuloFaltanteDTO() {
    }

    public ModuloFaltanteDTO(int idModulo, String nombreModulo, String lugar) {
        this.idModulo = idModulo;
        this.nombreModulo = nombreModulo;
        this.lugar = lugar;
    }

    // Getters y setters

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}