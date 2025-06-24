package com.carrera360.app_carrera360.apilogro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logro")
public class LogroController {

    @Autowired
    private LogroService logroService;

    @GetMapping("/{idUsuario}")
    public List<LogrosPerfil> getLogrosPorUsuario(@PathVariable int idUsuario) {
        return logroService.getLogrosByUsuario(idUsuario);
    }
}