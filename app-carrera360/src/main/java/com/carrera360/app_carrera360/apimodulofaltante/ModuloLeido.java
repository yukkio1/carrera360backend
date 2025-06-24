package com.carrera360.app_carrera360.apimodulofaltante;

import jakarta.persistence.*;

@Entity
@Table(name = "modulos_leidos")
public class ModuloLeido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modulo") // Asegúrate de que esta columna exista en tu BD
    private int idModulo;

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "fecha_leido")
    private String fechaLeido;

    // Constructor vacío (necesario para JPA)
    public ModuloLeido() {
    }

    // Constructor con parámetros (opcional pero útil)
    public ModuloLeido(int idModulo, int idUsuario, String fechaLeido) {
        this.idModulo = idModulo;
        this.idUsuario = idUsuario;
        this.fechaLeido = fechaLeido;
    }

    // Getters y setters

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaLeido() {
        return fechaLeido;
    }

    public void setFechaLeido(String fechaLeido) {
        this.fechaLeido = fechaLeido;
    }
}