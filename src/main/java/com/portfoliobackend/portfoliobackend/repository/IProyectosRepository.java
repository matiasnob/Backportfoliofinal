
package com.portfoliobackend.portfoliobackend.repository;

import com.portfoliobackend.portfoliobackend.model.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository extends JpaRepository<Proyectos, Integer>{
    public Optional<Proyectos> findByNombreP(String nombreP);
    public boolean existsByNombreP(String nombreP);
}