package com.carrera360.app_carrera360.encuesta.service;

import com.carrera360.app_carrera360.encuesta.model.EncuestaInicioRespuesta;
import com.carrera360.app_carrera360.encuesta.model.EncuestaInicialAlternativa;
import com.carrera360.app_carrera360.encuesta.repository.EncuestaInicialRespuestaRepository;
import com.carrera360.app_carrera360.encuesta.repository.EncuestaInicialAlternativaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EncuestaService {

    private final EncuestaInicialRespuestaRepository respuestaRepository;
    private final EncuestaInicialAlternativaRepository alternativaRepository;

    public EncuestaService(EncuestaInicialRespuestaRepository respuestaRepository,
            EncuestaInicialAlternativaRepository alternativaRepository) {
        this.respuestaRepository = respuestaRepository;
        this.alternativaRepository = alternativaRepository;
    }

    @Transactional
    public String guardarRespuesta(int idUsuario, String textoAlternativa) {
        Optional<EncuestaInicialAlternativa> alternativaOpt = alternativaRepository
                .findByTextoAlternativa(textoAlternativa);

        if (alternativaOpt.isPresent()) {
            EncuestaInicialAlternativa alternativa = alternativaOpt.get();
            int idPregunta = alternativa.getIdPregunta();

            List<EncuestaInicioRespuesta> respuestasExistentes = respuestaRepository
                    .findByIdUsuarioAndIdPregunta(idUsuario, idPregunta);

            if (!respuestasExistentes.isEmpty()) {
                EncuestaInicioRespuesta respuesta = respuestasExistentes.get(0);
                respuesta.setIdAlternativa(alternativa.getIdAlternativa());
                respuesta.setRespuesta(alternativa.getImpactoPerfil());
                respuesta.setFechaInicioApp(LocalDateTime.now());
                respuestaRepository.save(respuesta);

                for (int i = 1; i < respuestasExistentes.size(); i++) {
                    respuestaRepository.delete(respuestasExistentes.get(i));
                }

                return "♻️ Respuesta actualizada y duplicados eliminados.";
            } else {
                EncuestaInicioRespuesta nuevaRespuesta = new EncuestaInicioRespuesta();
                nuevaRespuesta.setIdUsuario(idUsuario);
                nuevaRespuesta.setIdPregunta(idPregunta);
                nuevaRespuesta.setIdAlternativa(alternativa.getIdAlternativa());
                nuevaRespuesta.setEstado(1);
                nuevaRespuesta.setFechaInicioApp(LocalDateTime.now());
                nuevaRespuesta.setRespuesta(alternativa.getImpactoPerfil());
                respuestaRepository.save(nuevaRespuesta);
                return "✅ Respuesta registrada correctamente.";
            }
        }
        return "❌ Alternativa no encontrada.";
    }
}
