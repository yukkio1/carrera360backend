package com.carrera360.app_carrera360.apiconfirmacion.model;

public class ConfirmacionResponse {
    private boolean completado;

    public ConfirmacionResponse(boolean completado) {
        this.completado = completado;
    }

    public boolean isCompletado() {
        return completado;
    }
}
