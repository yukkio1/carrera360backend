package com.carrera360.app_carrera360.encuesta.model;

import jakarta.persistence.*;

@Entity
@Table(name = "encuesta_inicial_pregunta")
public class EncuestaInicialPregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private int idPregunta;

    @Column(name = "texto_pregunta", nullable = false)
    private String textoPregunta;
}
