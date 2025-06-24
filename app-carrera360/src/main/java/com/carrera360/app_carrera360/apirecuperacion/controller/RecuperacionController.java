package com.carrera360.app_carrera360.apirecuperacion.controller;

import com.carrera360.app_carrera360.apirecuperacion.model.RecuperacionRequest;
import com.carrera360.app_carrera360.apirecuperacion.service.RecuperacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/recuperacion")
public class RecuperacionController {

    private final RecuperacionService recuperacionService;

    public RecuperacionController(RecuperacionService recuperacionService) {
        this.recuperacionService = recuperacionService;
    }

    @PostMapping("/verificar_usuario")
    public ResponseEntity<Map<String, String>> verificar(@RequestBody RecuperacionRequest request) {
        String contrasena = recuperacionService.buscarContrasena(request);

        if (contrasena != null) {
            return ResponseEntity.ok(Map.of("mensaje", contrasena));
        } else {
            return ResponseEntity.status(404).body(Map.of("mensaje", "Usuario no encontrado"));
        }
    }
}
