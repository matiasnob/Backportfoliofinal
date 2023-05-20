
package com.portfoliobackend.portfoliobackend.security.service;

import com.portfoliobackend.portfoliobackend.security.entity.Rol;
import com.portfoliobackend.portfoliobackend.security.enums.RolNombre;
import com.portfoliobackend.portfoliobackend.security.repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
       return iRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        iRolRepository.save(rol);
    }
}
