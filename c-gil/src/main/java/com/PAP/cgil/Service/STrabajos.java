package com.PAP.cgil.Service;

import com.PAP.cgil.Entity.Trabajos;
import com.PAP.cgil.Repository.RTrabajos;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class STrabajos {
  
    @Autowired
    private RTrabajos trabRepo;
    
 public List<Trabajos> verTrabajos(){
     List<Trabajos> listaTrabajos= trabRepo.findAll();
     return listaTrabajos;
 }

  public Trabajos buscarTrabajos(int id) {
  Trabajos trab = trabRepo.findById(id).orElse(null);
  return trab;
  }
 
 public void crearTrabajos(Trabajos trab){
     trabRepo.save(trab);
 }
 
 public void borraTrabajos(int id){
     trabRepo.deleteById(id);
 }
 
 public void editarTrabajos(Trabajos trab){
     trabRepo.save(trab);
 }
   
}
