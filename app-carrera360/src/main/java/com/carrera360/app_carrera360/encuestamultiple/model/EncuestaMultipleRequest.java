package com.carrera360.app_carrera360.encuestamultiple.model;

import java.util.List;

public class EncuestaMultipleRequest {
    private int idUsuario;
    private List<String> textoAlternativas;

    public int getIdUsuario() {
        return idUsuario;
    }

    public List<String> getTextoAlternativas() {
        return textoAlternativas;
    }
}
