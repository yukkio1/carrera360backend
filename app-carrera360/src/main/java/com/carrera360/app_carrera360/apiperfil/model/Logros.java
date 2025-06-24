package com.carrera360.app_carrera360.apiperfil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "logros")
public class Logros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_logro")
    private int idLogro;

    public int getIdLogro() {
        return idLogro;
    }

    public void setIdLogro(int idLogro) {
        this.idLogro = idLogro;
    }
}
