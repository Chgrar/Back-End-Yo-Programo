package com.PAP.cgil.Controler;

import com.PAP.cgil.Entity.Proyectos;
import com.PAP.cgil.Service.SProyectos;
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
@RequestMapping("Proyectos")
@CrossOrigin(origins = "http://localhost:4200")

public class CProyectos {
    @Autowired
    SProyectos proyServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Proyectos> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @GetMapping ("/ver/(id)")
    @ResponseBody
    public Proyectos verProyectos(@PathVariable int id){
        return proyServ.buscarProyectos(id);
    }
    
    
    @PostMapping("/crear")
    public String agregarProyectos (@RequestBody Proyectos proy){
        proyServ.crearProyectos(proy);
        return "El Proyectos fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/(id")
    public String eliminarProyectos(@PathVariable int id){
        proyServ.borraProyectos(id);
        return "El Proyectos fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateProyectos(@RequestBody Proyectos proy){
        proyServ.editarProyectos(proy);
    }
}
