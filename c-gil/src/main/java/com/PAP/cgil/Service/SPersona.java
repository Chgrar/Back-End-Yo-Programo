package com.PAP.cgil.Service;

import com.PAP.cgil.Entity.Persona;
import com.PAP.cgil.Repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
  
    @Autowired
    private RPersona persoRepo;
    
 public List<Persona> verPersonas(){
     List<Persona> listaPersonas= persoRepo.findAll();
     return listaPersonas;
 }

  public Persona buscarPersona(int id) {
  Persona perso = persoRepo.findById(id).orElse(null);
  return perso;
  }
 
 public void crearPersona(Persona perso){
     persoRepo.save(perso);
 }
 
 public void borraPersona(int id){
     persoRepo.deleteById(id);
 }
 
 public void editarPersona(Persona perso){
     persoRepo.save(perso);
 }
   
}

   
