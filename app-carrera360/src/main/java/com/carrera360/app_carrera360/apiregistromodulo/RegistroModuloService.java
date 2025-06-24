package com.carrera360.app_carrera360.apiregistromodulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RegistroModuloService {

    @Autowired
    private RegistroModuloRepository registroModuloRepository;

    public RegistroModuloResponse registrarModulo(int idUsuario, int idModulo) {
        ModuloLeidoId idCompuesto = new ModuloLeidoId(idUsuario, idModulo);

        if (registroModuloRepository.existsById(idCompuesto)) {
            return new RegistroModuloResponse("El registro ya estaba registrado");
        }

        ModuloLeidoRegistro nuevoRegistro = new ModuloLeidoRegistro(idUsuario, idModulo);
        nuevoRegistro.setFechaLeido(LocalDate.now().toString());
        nuevoRegistro.setMesLeido(LocalDate.now().getMonth().name());

        registroModuloRepository.save(nuevoRegistro);

        return new RegistroModuloResponse("Registro exitoso", nuevoRegistro);
    }
}