package com.carrera360.app_carrera360.encuesta.model;

import jakarta.persistence.*;

@Entity
@Table(name = "encuesta_inicial_alternativa")
public class EncuestaInicialAlternativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alternativa")
    private int idAlternativa;

    @Column(name = "id_pregunta", nullable = false)
    private int idPregunta;

    @Column(name = "texto_alternativa", nullable = false)
    private String textoAlternativa;

    @Column(name = "impacto_perfil", nullable = false)
    private String impactoPerfil; // ✅ Se agregó `impactoPerfil`

    // ✅ Métodos Getters
    public int getIdAlternativa() {
        return idAlternativa;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public String getTextoAlternativa() {
        return textoAlternativa;
    }

    public String getImpactoPerfil() {
        return impactoPerfil;
    } // ✅ Ahora existe `getImpactoPerfil()`
}
