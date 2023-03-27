package com.PAP.cgil.Controler;

import com.PAP.cgil.Entity.Educacion;
import com.PAP.cgil.Service.SEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Educacion")
@CrossOrigin(origins = "http://localhost:4200")

public class CEducacion {
    @Autowired
    SEducacion eduServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    @GetMapping ("/ver/(id)")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id){
        return eduServ.buscarEducacion(id);
    }
    
    
    @PostMapping("/crear")
    public String agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
        return "La Educacion fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/(id")
    public String eliminarEducacion(@PathVariable int id){
        eduServ.borraEducacion(id);
        return "La Educacion fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public void updateEducacion(@RequestBody Educacion edu){
       eduServ.editarEducacion(edu);
    }
}
