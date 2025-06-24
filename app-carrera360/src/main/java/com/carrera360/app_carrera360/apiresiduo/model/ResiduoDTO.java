package com.carrera360.app_carrera360.apiresiduo.model;

import java.util.List;

public class ResiduoDTO {
    private long cantidadHecho;
    private List<String> nombreLogro;

    public ResiduoDTO(long cantidadHecho, List<String> nombreLogro) {
        this.cantidadHecho = cantidadHecho;
        this.nombreLogro = nombreLogro;
    }

    public long getCantidadHecho() {
        return cantidadHecho;
    }

    public void setCantidadHecho(long cantidadHecho) {
        this.cantidadHecho = cantidadHecho;
    }

    public List<String> getNombreLogro() {
        return nombreLogro;
    }

    public void setNombreLogro(List<String> nombreLogro) {
        this.nombreLogro = nombreLogro;
    }
}