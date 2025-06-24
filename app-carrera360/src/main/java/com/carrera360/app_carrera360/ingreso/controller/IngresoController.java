package com.carrera360.app_carrera360.ingreso.controller;

import com.carrera360.app_carrera360.ingreso.model.LoginRequest;
import com.carrera360.app_carrera360.ingreso.model.LoginResponse;
import com.carrera360.app_carrera360.ingreso.service.IngresoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {
    private final IngresoService ingresoService;

    public IngresoController(IngresoService ingresoService) {
        this.ingresoService = ingresoService;
    }

    @PostMapping
    public ResponseEntity<LoginResponse> loginUsuario(@RequestBody LoginRequest request) {
        LoginResponse response = ingresoService.loginUsuario(request);
        return ResponseEntity.ok(response);
    }
}
