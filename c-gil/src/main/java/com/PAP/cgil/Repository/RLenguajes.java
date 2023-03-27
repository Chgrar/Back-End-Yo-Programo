package com.PAP.cgil.Repository;

import com.PAP.cgil.Entity.Lenguajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RLenguajes extends JpaRepository <Lenguajes, Integer>{
    
}
