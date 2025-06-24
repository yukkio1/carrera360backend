package com.carrera360.app_carrera360.encuestamultiple2.model;

import java.util.List;

public class EncuestaMultiple2Request {
    private int idUsuario;
    private List<String> textoAlternativas;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<String> getTextoAlternativas() {
        return textoAlternativas;
    }

    public void setTextoAlternativas(List<String> textoAlternativas) {
        this.textoAlternativas = textoAlternativas;
    }
}
