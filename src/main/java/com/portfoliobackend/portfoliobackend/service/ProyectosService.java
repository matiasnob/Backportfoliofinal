package com.portfoliobackend.portfoliobackend.service;

import com.portfoliobackend.portfoliobackend.model.Proyectos;
import com.portfoliobackend.portfoliobackend.repository.IProyectosRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    @Autowired
    IProyectosRepository rProyectos;
    
    public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne(int id){
        return rProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNmbreP(String nombreP){
        return rProyectos.findByNombreP(nombreP);
    }
    
    public void save(Proyectos proyectos){
        rProyectos.save(proyectos);
    }
    
    public void delete(int id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id);
    }
    
    public boolean existsByNombreP(String nombreP){
        return rProyectos.existsByNombreP(nombreP);
    }
}