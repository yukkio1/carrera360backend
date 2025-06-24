package com.carrera360.app_carrera360.encuesta.repository;

import com.carrera360.app_carrera360.encuesta.model.EncuestaInicialAlternativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EncuestaInicialAlternativaRepository extends JpaRepository<EncuestaInicialAlternativa, Integer> {
    Optional<EncuestaInicialAlternativa> findByTextoAlternativa(String textoAlternativa); // ✅ Busca por descripción
}
