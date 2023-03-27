package com.PAP.cgil.Service;

import com.PAP.cgil.Entity.Educacion;
import com.PAP.cgil.Repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
  
    @Autowired
    private REducacion eduRepo;
    
 public List<Educacion> verEducacion(){
     List<Educacion> listaEducacion= eduRepo.findAll();
     return listaEducacion;
 }

  public Educacion buscarEducacion(int id) {
  Educacion edu = eduRepo.findById(id).orElse(null);
  return edu;
  }
 
 public void crearEducacion(Educacion edu){
     eduRepo.save(edu);
 }
 
 public void borraEducacion(int id){
     eduRepo.deleteById(id);
 }
 
 public void editarEducacion(Educacion edu){
     eduRepo.save(edu);
 }
   
}

