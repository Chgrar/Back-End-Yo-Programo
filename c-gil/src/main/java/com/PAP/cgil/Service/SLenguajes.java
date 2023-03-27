package com.PAP.cgil.Service;

import com.PAP.cgil.Entity.Lenguajes;
import com.PAP.cgil.Repository.RLenguajes;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SLenguajes {
  
    @Autowired
    private RLenguajes lenguaRepo;
    
 public List<Lenguajes> verLenguajes(){
     List<Lenguajes> listaLenguajes= lenguaRepo.findAll();
     return listaLenguajes;
 }

  public Lenguajes buscarLenguajes(int id) {
  Lenguajes lengua = lenguaRepo.findById(id).orElse(null);
  return lengua;
  }
 
 public void crearLenguajes(Lenguajes lengua){
     lenguaRepo.save(lengua);
 }
 
 public void borraLenguajes(int id){
     lenguaRepo.deleteById(id);
 }
 
 public void editarLenguajes(Lenguajes lengua){
     lenguaRepo.save(lengua);
 }
   
}