package com.carrera360.app_carrera360.apiperfil.service;

import com.carrera360.app_carrera360.apiperfil.dto.PerfilDTO; // Importar PerfilDTO
import com.carrera360.app_carrera360.apiperfil.repository.*;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    private final EncuestaTotalRepository encuestaRepo;
    private final EvaluacionesCompletadasRepository completadasRepo;
    private final EvaluacionRepository evaluacionRepo;
    private final ModulosRepository modulosRepo;
    private final ModulosLeidosRepository leidosRepo;
    private final LogrosRepository logrosRepo;

    public PerfilService(
            EncuestaTotalRepository encuestaRepo,
            EvaluacionesCompletadasRepository completadasRepo,
            EvaluacionRepository evaluacionRepo,
            ModulosRepository modulosRepo,
            ModulosLeidosRepository leidosRepo,
            LogrosRepository logrosRepo) {
        this.encuestaRepo = encuestaRepo;
        this.completadasRepo = completadasRepo;
        this.evaluacionRepo = evaluacionRepo;
        this.modulosRepo = modulosRepo;
        this.leidosRepo = leidosRepo;
        this.logrosRepo = logrosRepo;
    }

    public PerfilDTO obtenerPerfil(int idUsuario) {
        PerfilDTO dto = new PerfilDTO();

        dto.setRespuestasIniciales(encuestaRepo.obtenerRespuestasPorUsuario(idUsuario));
        dto.setCantidadEvaluacionesCompletadas(completadasRepo.contarPorUsuario(idUsuario));
        dto.setCantidadEvaluaciones(evaluacionRepo.contarTotal());
        dto.setCantidadModulos(modulosRepo.contarTotal());
        dto.setCantidadModulosLeidos(leidosRepo.contarPorUsuario(idUsuario));
        dto.setCantidadLogros(logrosRepo.contarTotal());

        return dto;
    }
}