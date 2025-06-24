package com.carrera360.app_carrera360.apilogro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "logros")
public class Logro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_logro")
    private int idLogro;

    @Column(name = "nombre_logro", nullable = false)
    private String nombreLogro;

    public Logro() {
    }

    public Logro(int idLogro, String nombreLogro) {
        this.idLogro = idLogro;
        this.nombreLogro = nombreLogro;
    }

    // Getters y setters

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
}