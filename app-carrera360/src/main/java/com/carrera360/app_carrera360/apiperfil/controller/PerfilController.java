package com.carrera360.app_carrera360.apiperfil.controller;

import com.carrera360.app_carrera360.apiperfil.dto.PerfilDTO; // Importar PerfilDTO
import com.carrera360.app_carrera360.apiperfil.service.PerfilService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping("/{idUsuario}")
    public PerfilDTO obtenerPerfil(@PathVariable int idUsuario) {
        return perfilService.obtenerPerfil(idUsuario);
    }
}