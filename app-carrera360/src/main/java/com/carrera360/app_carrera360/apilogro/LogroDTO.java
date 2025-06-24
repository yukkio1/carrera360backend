package com.carrera360.app_carrera360.apilogro;

public class LogroDTO {

    private int idUsuario;
    private int idLogro;
    private String nombreLogro;
    private String estado;
    private String fechaLogro;

    public LogroDTO() {
    }

    public LogroDTO(int idUsuario, int idLogro, String nombreLogro, String estado, String fechaLogro) {
        this.idUsuario = idUsuario;
        this.idLogro = idLogro;
        this.nombreLogro = nombreLogro;
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

    public String getNombreLogro() {
        return nombreLogro;
    }

    public void setNombreLogro(String nombreLogro) {
        this.nombreLogro = nombreLogro;
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