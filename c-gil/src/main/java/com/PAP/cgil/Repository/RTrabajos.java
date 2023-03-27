package com.PAP.cgil.Repository;

import com.PAP.cgil.Entity.Trabajos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RTrabajos extends JpaRepository <Trabajos, Integer>{
    
}
