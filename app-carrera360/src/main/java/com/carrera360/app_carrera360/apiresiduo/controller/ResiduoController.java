package com.carrera360.app_carrera360.apiresiduo.controller;

import com.carrera360.app_carrera360.apiresiduo.model.ResiduoResponse;
import com.carrera360.app_carrera360.apiresiduo.service.ResiduoService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/residuo")
public class ResiduoController {

    private final ResiduoService residuoService;

    public ResiduoController(ResiduoService residuoService) {
        this.residuoService = residuoService;
    }

    @GetMapping("/{id_usuario}")
    public ResiduoResponse getResiduo(@PathVariable("id_usuario") int id_usuario) {
        return residuoService.getResiduosByUserId(id_usuario);
    }
}