package com.carrera360.app_carrera360.invitado.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "usuarios")
public class Invitado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;

    private String usuario;
    private String nombre;
    private String apellido;
    private int edad;
    private String contrasena;
    private String correo;

    // Campo de fecha como LocalDateTime (para guardar en BD)
    private LocalDateTime fechaCreacion;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
        this.correo = usuario + "@gmail.com";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // Método para devolver la fecha en formato ISO 8601 con milisegundos y zona
    // horaria
    public String getFechaCreacionISO() {
        if (this.fechaCreacion == null)
            return null;

        // Formatear con milisegundos y zona horaria UTC
        return this.fechaCreacion.atZone(ZoneId.of("UTC"))
                .format(DateTimeFormatter.ISO_DATE_TIME);
    }
}