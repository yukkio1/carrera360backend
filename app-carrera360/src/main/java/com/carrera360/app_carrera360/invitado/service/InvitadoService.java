package com.carrera360.app_carrera360.invitado.service;

import com.carrera360.app_carrera360.invitado.model.Invitado;
import com.carrera360.app_carrera360.invitado.model.InvitadoRol;
import com.carrera360.app_carrera360.invitado.repository.InvitadoRepository;
import com.carrera360.app_carrera360.invitado.repository.InvitadoRolRepository;
import org.springframework.stereotype.Service;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class InvitadoService {

    private final InvitadoRepository invitadoRepository;
    private final InvitadoRolRepository invitadoRolRepository;

    public InvitadoService(InvitadoRepository invitadoRepository,
            InvitadoRolRepository invitadoRolRepository) {
        this.invitadoRepository = invitadoRepository;
        this.invitadoRolRepository = invitadoRolRepository;
    }

    public Invitado generarInvitado() {
        Random random = new Random();
        Invitado invitado = new Invitado();

        invitado.setUsuario("Invitado" + random.nextInt(10000));
        invitado.setNombre("Usuario");
        invitado.setApellido("Invitado");
        invitado.setEdad(30);
        invitado.setContrasena("invitado123");

        // Generar fecha actual en UTC
        LocalDateTime ahora = LocalDateTime.now(ZoneId.of("UTC"));
        invitado.setFechaCreacion(ahora);

        Invitado guardado = invitadoRepository.save(invitado);

        InvitadoRol rol = new InvitadoRol();
        rol.setIdUsuario(guardado.getIdUsuario());
        rol.setIdRol(1);
        invitadoRolRepository.save(rol);

        return guardado;
    }
}