
package com.portfoliobackend.portfoliobackend.repository;

import com.portfoliobackend.portfoliobackend.model.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHySRepository extends JpaRepository<hys, Integer>{
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}