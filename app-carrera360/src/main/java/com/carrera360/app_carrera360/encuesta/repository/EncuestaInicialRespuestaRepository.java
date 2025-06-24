package com.carrera360.app_carrera360.encuesta.repository;

import com.carrera360.app_carrera360.encuesta.model.EncuestaInicioRespuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EncuestaInicialRespuestaRepository extends JpaRepository<EncuestaInicioRespuesta, Integer> {

    // ✅ Buscar todas las respuestas del usuario para una misma pregunta
    List<EncuestaInicioRespuesta> findByIdUsuarioAndIdPregunta(int idUsuario, int idPregunta);
}
