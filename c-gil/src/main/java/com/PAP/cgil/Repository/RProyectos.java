package com.PAP.cgil.Repository;

import com.PAP.cgil.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository <Proyectos, Integer>{
    
}
