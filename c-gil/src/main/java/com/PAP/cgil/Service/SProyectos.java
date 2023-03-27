package com.PAP.cgil.Service;

import com.PAP.cgil.Entity.Proyectos;
import com.PAP.cgil.Repository.RProyectos;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
  
    @Autowired
    private RProyectos proyRepo;
    
 public List<Proyectos> verProyectos(){
     List<Proyectos> listaProyectos= proyRepo.findAll();
     return listaProyectos;
 }

  public Proyectos buscarProyectos(int id) {
  Proyectos proy = proyRepo.findById(id).orElse(null);
  return proy;
  }
 
 public void crearProyectos(Proyectos proy){
     proyRepo.save(proy);
 }
 
 public void borraProyectos(int id){
     proyRepo.deleteById(id);
 }
 
 public void editarProyectos(Proyectos proy){
     proyRepo.save(proy);
 }
   
}