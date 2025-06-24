package com.carrera360.app_carrera360.apimodulofaltante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuloFaltanteService {

    @Autowired
    private ModuloFaltanteRepository moduloFaltanteRepository;

    public List<ModuloFalta> getModulosFaltantes(int idUsuario) {
        return moduloFaltanteRepository.findModulosFaltantesPorUsuario(idUsuario);
    }
}