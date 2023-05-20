
package com.portfoliobackend.portfoliobackend.security.repository;

import com.portfoliobackend.portfoliobackend.security.entity.Rol;
import com.portfoliobackend.portfoliobackend.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
