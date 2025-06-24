package com.carrera360.app_carrera360.encuestamultiple2.service;

import com.carrera360.app_carrera360.encuesta.model.EncuestaInicialAlternativa;
import com.carrera360.app_carrera360.encuesta.model.EncuestaInicioRespuesta;
import com.carrera360.app_carrera360.encuesta.repository.EncuestaInicialAlternativaRepository;
import com.carrera360.app_carrera360.encuesta.repository.EncuestaInicialRespuestaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EncuestaMultiple2Service {

    private final EncuestaInicialAlternativaRepository alternativaRepo;
    private final EncuestaInicialRespuestaRepository respuestaRepo;

    public EncuestaMultiple2Service(EncuestaInicialAlternativaRepository alternativaRepo,
            EncuestaInicialRespuestaRepository respuestaRepo) {
        this.alternativaRepo = alternativaRepo;
        this.respuestaRepo = respuestaRepo;
    }

    @Transactional
    public String registrarRespuestasMultiples(int idUsuario, List<String> alternativasTexto) {
        List<EncuestaInicioRespuesta> anteriores = respuestaRepo.findByIdUsuarioAndIdPregunta(idUsuario, 5);

        if (!anteriores.isEmpty()) {
            respuestaRepo.deleteAll(anteriores);
        }

        int registrados = 0;
        for (String texto : alternativasTexto) {
            Optional<EncuestaInicialAlternativa> alternativaOpt = alternativaRepo.findByTextoAlternativa(texto);
            if (alternativaOpt.isPresent()) {
                EncuestaInicialAlternativa alternativa = alternativaOpt.get();
                EncuestaInicioRespuesta nueva = new EncuestaInicioRespuesta();
                nueva.setIdUsuario(idUsuario);
                nueva.setIdPregunta(5);
                nueva.setIdAlternativa(alternativa.getIdAlternativa());
                nueva.setRespuesta(alternativa.getImpactoPerfil());
                nueva.setEstado(1);
                nueva.setFechaInicioApp(LocalDateTime.now());
                respuestaRepo.save(nueva);
                registrados++;
            }
        }

        if (registrados == 0) {
            return "❌ Ninguna alternativa fue registrada.";
        } else if (!anteriores.isEmpty()) {
            return "♻️ Respuestas actualizadas y respuestas anteriores eliminadas.";
        } else {
            return "✅ Respuestas registradas correctamente.";
        }
    }
}
