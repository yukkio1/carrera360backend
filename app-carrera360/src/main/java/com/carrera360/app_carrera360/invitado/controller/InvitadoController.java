package com.carrera360.app_carrera360.invitado.controller;

import com.carrera360.app_carrera360.invitado.model.Invitado;
import com.carrera360.app_carrera360.invitado.service.InvitadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crear-invitado")
public class InvitadoController {

    @Autowired
    private InvitadoService invitadoService;

    @PostMapping
    public ResponseEntity<Invitado> crearInvitado() {
        Invitado nuevoInvitado = invitadoService.generarInvitado();
        return ResponseEntity.ok(nuevoInvitado);
    }
}