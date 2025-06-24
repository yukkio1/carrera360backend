package com.carrera360.app_carrera360.apiconfirmacion.service;

import com.carrera360.app_carrera360.apiconfirmacion.repository.EncuestaInicialRepository;
import org.springframework.stereotype.Service;

@Service
public class ConfirmacionService {

    private final EncuestaInicialRepository encuestaInicialRepository;

    public ConfirmacionService(EncuestaInicialRepository encuestaInicialRepository) {
        this.encuestaInicialRepository = encuestaInicialRepository;
    }

    public boolean verificarEncuesta(int idUsuario) {
        return encuestaInicialRepository.existsByIdUsuario(idUsuario);
    }
}
