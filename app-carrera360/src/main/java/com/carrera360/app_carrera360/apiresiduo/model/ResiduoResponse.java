package com.carrera360.app_carrera360.apiresiduo.model;

import java.util.List;

public class ResiduoResponse {
    private long cantidadHecho;
    private List<String> nombreLogro;

    public ResiduoResponse(long cantidadHecho, List<String> nombreLogro) {
        this.cantidadHecho = cantidadHecho;
        this.nombreLogro = nombreLogro;
    }

    public long getCantidadHecho() {
        return cantidadHecho;
    }

    public List<String> getNombreLogro() {
        return nombreLogro;
    }
}