package com.carrera360.app_carrera360.encuestamultiple2.controller;

import com.carrera360.app_carrera360.encuestamultiple2.model.EncuestaMultiple2Request;
import com.carrera360.app_carrera360.encuestamultiple2.service.EncuestaMultiple2Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/encuestamultiple2")
public class EncuestaMultiple2Controller {

    private final EncuestaMultiple2Service encuestaMultiple2Service;

    public EncuestaMultiple2Controller(EncuestaMultiple2Service encuestaMultiple2Service) {
        this.encuestaMultiple2Service = encuestaMultiple2Service;
    }

    @PostMapping("/registrar_respuestas")
    public ResponseEntity<Map<String, String>> registrarMultiples(@RequestBody EncuestaMultiple2Request request) {
        String resultado = encuestaMultiple2Service.registrarRespuestasMultiples(
                request.getIdUsuario(),
                request.getTextoAlternativas());
        return ResponseEntity.ok(Map.of("mensaje", resultado));
    }
}
