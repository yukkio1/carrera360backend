package com.carrera360.app_carrera360.apiregistromodulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroModuloRepository extends JpaRepository<ModuloLeidoRegistro, ModuloLeidoId> {
}