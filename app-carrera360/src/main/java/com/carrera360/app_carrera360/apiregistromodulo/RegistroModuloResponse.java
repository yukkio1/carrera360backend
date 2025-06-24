package com.carrera360.app_carrera360.apiregistromodulo;

public class RegistroModuloResponse {

    private String mensaje;
    private ModuloLeidoRegistro moduloLeido;

    public RegistroModuloResponse(String mensaje) {
        this.mensaje = mensaje;
    }

    public RegistroModuloResponse(String mensaje, ModuloLeidoRegistro moduloLeido) {
        this.mensaje = mensaje;
        this.moduloLeido = moduloLeido;
    }

    // Getters y setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ModuloLeidoRegistro getModuloLeido() {
        return moduloLeido;
    }

    public void setModuloLeido(ModuloLeidoRegistro moduloLeido) {
        this.moduloLeido = moduloLeido;
    }
}