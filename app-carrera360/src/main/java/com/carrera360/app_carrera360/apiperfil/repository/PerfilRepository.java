package com.carrera360.app_carrera360.apiperfil.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface PerfilRepository {
    @Query("SELECT r.respuesta FROM EncuestaInicialRespuesta r WHERE r.idUsuario = :idUsuario")
    List<String> obtenerRespuestasIniciales(int idUsuario);

    @Query("SELECT COUNT(e) FROM EvaluacionesCompletadas e WHERE e.idUsuario = :idUsuario")
    long contarEvaluacionesCompletadas(int idUsuario);

    @Query("SELECT COUNT(m) FROM Modulos m")
    long contarTotalModulos();

    @Query("SELECT COUNT(e) FROM Evaluacion e")
    long contarTotalEvaluaciones();

    @Query("SELECT COUNT(m) FROM ModulosLeidos m WHERE m.idUsuario = :idUsuario")
    long contarModulosLeidosPorUsuario(int idUsuario);

    @Query("SELECT COUNT(l) FROM Logros l")
    long contarTotalLogros();
}
