package com.carrera360.app_carrera360.encuestamultiple.controller;

import com.carrera360.app_carrera360.encuestamultiple.model.EncuestaMultipleRequest;
import com.carrera360.app_carrera360.encuestamultiple.service.EncuestaMultipleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/encuestamultiple")
public class EncuestaMultipleController {

    private final EncuestaMultipleService encuestaMultipleService;

    public EncuestaMultipleController(EncuestaMultipleService encuestaMultipleService) {
        this.encuestaMultipleService = encuestaMultipleService;
    }

    @PostMapping("/registrar_respuestas")
    public ResponseEntity<Map<String, String>> registrarMultiples(@RequestBody EncuestaMultipleRequest request) {
        String resultado = encuestaMultipleService.registrarRespuestasMultiples(
                request.getIdUsuario(),
                request.getTextoAlternativas());
        return ResponseEntity.ok(Map.of("mensaje", resultado));
    }
}
