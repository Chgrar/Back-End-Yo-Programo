package com.PAP.cgil.Controler;

import com.PAP.cgil.Entity.Lenguajes;
import com.PAP.cgil.Service.SLenguajes;
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
@RequestMapping("Lenguajes")
@CrossOrigin(origins = "http://localhost:4200")

public class CLenguajes {
    @Autowired
    SLenguajes lenguaServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Lenguajes> verLenguajes(){
        return lenguaServ.verLenguajes();
    }
    
    @GetMapping ("/ver/(id)")
    @ResponseBody
    public Lenguajes verLenguajes(@PathVariable int id){
        return lenguaServ.buscarLenguajes(id);
    }
    
    
    @PostMapping("/crear")
    public String agregarLenguajes (@RequestBody Lenguajes lengua){
        lenguaServ.crearLenguajes(lengua);
        return "El lenguaje fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/(id")
    public String eliminarLenguajes(@PathVariable int id){
        lenguaServ.borraLenguajes(id);
        return "El lenguaje fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateLenguajes(@RequestBody Lenguajes lengua){
        lenguaServ.editarLenguajes(lengua);
    }
}