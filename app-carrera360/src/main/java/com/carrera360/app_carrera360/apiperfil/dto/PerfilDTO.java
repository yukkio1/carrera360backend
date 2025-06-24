package com.carrera360.app_carrera360.apiperfil.dto;

import java.util.List;

public class PerfilDTO {
    private List<String> respuestasIniciales;
    private long cantidadEvaluacionesCompletadas;
    private long cantidadModulos;
    private long cantidadEvaluaciones;
    private long cantidadModulosLeidos;
    private long cantidadLogros;

    public List<String> getRespuestasIniciales() {
        return respuestasIniciales;
    }

    public void setRespuestasIniciales(List<String> respuestasIniciales) {
        this.respuestasIniciales = respuestasIniciales;
    }

    public long getCantidadEvaluacionesCompletadas() {
        return cantidadEvaluacionesCompletadas;
    }

    public void setCantidadEvaluacionesCompletadas(long cantidadEvaluacionesCompletadas) {
        this.cantidadEvaluacionesCompletadas = cantidadEvaluacionesCompletadas;
    }

    public long getCantidadModulos() {
        return cantidadModulos;
    }

    public void setCantidadModulos(long cantidadModulos) {
        this.cantidadModulos = cantidadModulos;
    }

    public long getCantidadEvaluaciones() {
        return cantidadEvaluaciones;
    }

    public void setCantidadEvaluaciones(long cantidadEvaluaciones) {
        this.cantidadEvaluaciones = cantidadEvaluaciones;
    }

    public long getCantidadModulosLeidos() {
        return cantidadModulosLeidos;
    }

    public void setCantidadModulosLeidos(long cantidadModulosLeidos) {
        this.cantidadModulosLeidos = cantidadModulosLeidos;
    }

    public long getCantidadLogros() {
        return cantidadLogros;
    }

    public void setCantidadLogros(long cantidadLogros) {
        this.cantidadLogros = cantidadLogros;
    }
}