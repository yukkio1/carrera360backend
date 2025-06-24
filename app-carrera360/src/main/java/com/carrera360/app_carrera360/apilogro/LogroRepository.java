package com.carrera360.app_carrera360.apilogro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LogroRepository extends JpaRepository<Logro, Integer> {
    // No es necesario redefinir findAll()
}