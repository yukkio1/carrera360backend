package com.carrera360.app_carrera360.apimodulofaltante;

import jakarta.persistence.*;

@Entity
@Table(name = "modulos")
public class ModuloFalta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modulo")
    private int idModulo;

    @Column(name = "nombre_modulo", nullable = false)
    private String nombreModulo;

    public ModuloFalta() {
    }

    public ModuloFalta(int idModulo, String nombreModulo) {
        this.idModulo = idModulo;
        this.nombreModulo = nombreModulo;
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
}