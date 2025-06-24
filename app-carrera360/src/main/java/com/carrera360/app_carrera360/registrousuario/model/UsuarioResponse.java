package com.carrera360.app_carrera360.registrousuario.model;

public class UsuarioResponse {
    private String mensaje;
    private boolean exito;

    public UsuarioResponse(String mensaje, boolean exito) {
        this.mensaje = mensaje;
        this.exito = exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean isExito() {
        return exito;
    }
}
