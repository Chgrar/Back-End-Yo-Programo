package com.PAP.cgil.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    
   private String institucion;
   private String titulo;
   private String fin;

    public Educacion() {
    }

    public Educacion(String institucion, String titulo, String fin) {
        this.institucion = institucion;
        this.titulo = titulo;
        this.fin = fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
    
   
   
   
   
}
