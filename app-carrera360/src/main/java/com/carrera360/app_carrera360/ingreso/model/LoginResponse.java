package com.carrera360.app_carrera360.ingreso.model;

import java.util.Date;

public class LoginResponse {
    private Integer idUsuario;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String correo;
    private String usuario;
    private Date fechaCreacion;
    private String mensaje;

    public LoginResponse(Integer idUsuario, String nombre, String apellido, Integer edad, String correo, String usuario,
            Date fechaCreacion, String mensaje) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.mensaje = mensaje;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getMensaje() {
        return mensaje;
    }
}
