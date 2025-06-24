package com.carrera360.app_carrera360.encuesta.controller;

import com.carrera360.app_carrera360.encuesta.service.EncuestaService;
import com.carrera360.app_carrera360.encuesta.model.EncuestaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map; // ✅ Importación para el Map

@RestController
@RequestMapping("/encuesta")
public class EncuestaController {

    private final EncuestaService encuestaService;

    public EncuestaController(EncuestaService encuestaService) {
        this.encuestaService = encuestaService;
    }

    @PostMapping("/registrar_respuesta")
    public ResponseEntity<Map<String, String>> registrarRespuesta(@RequestBody EncuestaRequest request) {
        String resultado = encuestaService.guardarRespuesta(request.getIdUsuario(), request.getTextoAlternativa());
        return ResponseEntity.ok(Map.of("mensaje", resultado)); // ✅ Devuelve JSON: {"mensaje": "..."}
    }
}
