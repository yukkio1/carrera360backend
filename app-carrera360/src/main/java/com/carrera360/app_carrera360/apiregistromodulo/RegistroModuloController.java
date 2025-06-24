package com.carrera360.app_carrera360.apiregistromodulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registroModulo")
public class RegistroModuloController {

    @Autowired
    private RegistroModuloService registroModuloService;

    @PostMapping
    public RegistroModuloResponse registrar(@RequestParam int idUsuario, @RequestParam int idModulo) {
        return registroModuloService.registrarModulo(idUsuario, idModulo);
    }
}