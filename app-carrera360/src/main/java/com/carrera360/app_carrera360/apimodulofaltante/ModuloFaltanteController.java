package com.carrera360.app_carrera360.apimodulofaltante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moduloFaltante")
public class ModuloFaltanteController {

    @Autowired
    private ModuloFaltanteService moduloFaltanteService;

    @GetMapping("/{idUsuario}")
    public List<ModuloFalta> getModulosFaltantes(@PathVariable int idUsuario) {
        return moduloFaltanteService.getModulosFaltantes(idUsuario);
    }
}