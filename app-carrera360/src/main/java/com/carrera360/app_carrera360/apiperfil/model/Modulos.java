package com.carrera360.app_carrera360.apiperfil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "modulos")
public class Modulos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modulo")
    private int idModulo;

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }
}
