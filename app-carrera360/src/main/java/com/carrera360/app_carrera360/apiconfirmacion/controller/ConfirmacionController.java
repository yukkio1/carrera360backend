package com.carrera360.app_carrera360.apiconfirmacion.controller;

import com.carrera360.app_carrera360.apiconfirmacion.model.ConfirmacionResponse;
import com.carrera360.app_carrera360.apiconfirmacion.service.ConfirmacionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/confirmacion")
public class ConfirmacionController {

    private final ConfirmacionService confirmacionService;

    public ConfirmacionController(ConfirmacionService confirmacionService) {
        this.confirmacionService = confirmacionService;
    }

    @GetMapping("/{id_usuario}")
    public ConfirmacionResponse verificarEncuesta(@PathVariable int id_usuario) {
        boolean completado = confirmacionService.verificarEncuesta(id_usuario);
        return new ConfirmacionResponse(completado);
    }
}
