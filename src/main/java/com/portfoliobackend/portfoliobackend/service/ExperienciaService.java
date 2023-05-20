
package com.portfoliobackend.portfoliobackend.service;

import com.portfoliobackend.portfoliobackend.model.Experiencia;
import com.portfoliobackend.portfoliobackend.repository.IExperienciaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
  @Autowired
     IExperienciaRepository rExperiencia;
     
     public List<Experiencia> list(){
         return rExperiencia.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return rExperiencia.findById(id);
     }
     
     public Optional<Experiencia> getByNombreE(String nombreE){
         return rExperiencia.findByNombreE(nombreE);
     }
     
     public void save(Experiencia expe){
         rExperiencia.save(expe);
     }
     
     public void delete(int id){
         rExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rExperiencia.existsByNombreE(nombreE);
     }
}

