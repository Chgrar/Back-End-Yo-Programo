package com.PAP.cgil.Controler;

import com.PAP.cgil.Entity.Trabajos;
import com.PAP.cgil.Service.STrabajos;
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
@RequestMapping("Trabajos")
@CrossOrigin(origins = "http://localhost:4200")

public class CTrabajos {
    @Autowired
    STrabajos trabServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Trabajos> verTrabajos(){
        return trabServ.verTrabajos();
    }
    
    @GetMapping ("/ver/(id)")
    @ResponseBody
    public Trabajos verTrabajos(@PathVariable int id){
        return trabServ.buscarTrabajos(id);
    }
    
    
    @PostMapping("/crear")
    public String agregarTrabajos (@RequestBody Trabajos trab){
        trabServ.crearTrabajos(trab);
        return "El Trabajos fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/(id")
    public String eliminarTrabajos(@PathVariable int id){
        trabServ.borraTrabajos(id);
        return "El Trabajos fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateTrabajos(@RequestBody Trabajos trab){
        trabServ.editarTrabajos(trab);
    }
}
