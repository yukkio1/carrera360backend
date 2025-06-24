package com.carrera360.app_carrera360.apiexamenregistro;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/evaluaciones")
@RequiredArgsConstructor
public class EvaluacionCompletadaController {

    private final EvaluacionCompletadaRepository repository;

    @PostMapping
    public ResponseEntity<Map<String, String>> registrar(@RequestBody EvaluacionRequest request) {
        Map<String, String> respuesta = new HashMap<>();

        boolean yaExiste = repository.existsByIdUsuarioAndIdEvaluacion(
                request.getIdUsuario(), request.getIdEvaluacion());

        if (yaExiste) {
            respuesta.put("mensaje", "Registro ya estaba registrado");
            return ResponseEntity.ok(respuesta);
        }

        EvaluacionCompletada nuevo = new EvaluacionCompletada(
                request.getIdUsuario(),
                request.getIdEvaluacion(),
                null // MySQL autogenera `fecha_completada`
        );

        repository.save(nuevo);
        respuesta.put("mensaje", "Registro exitoso");
        return ResponseEntity.ok(respuesta);
    }
}
