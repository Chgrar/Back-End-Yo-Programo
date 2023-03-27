package com.PAP.cgil.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;

@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String nombreyapellido;
   private String direccion;
   private String amail;
   private String telefono;
   private String titulo1;
   @Lob
   private String descripcion1;
   private String titulo2;
   @Lob
   private String descripcion2;
   private String imgbanner;
   private String foto;
   private String linkedln;

    public Persona() {
    }

    public Persona(String nombreyapellido, String direccion, String amail, String telefono, String titulo1, String descripcion1, String titulo2, String descripcion2, String imgbanner, String foto, String linkedln) {
        this.nombreyapellido = nombreyapellido;
        this.direccion = direccion;
        this.amail = amail;
        this.telefono = telefono;
        this.titulo1 = titulo1;
        this.descripcion1 = descripcion1;
        this.titulo2 = titulo2;
        this.descripcion2 = descripcion2;
        this.imgbanner = imgbanner;
        this.foto = foto;
        this.linkedln = linkedln;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAmail() {
        return amail;
    }

    public void setAmail(String amail) {
        this.amail = amail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getImgbanner() {
        return imgbanner;
    }

    public void setImgbanner(String imgbanner) {
        this.imgbanner = imgbanner;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLinkedln() {
        return linkedln;
    }

    public void setLinkedln(String linkedln) {
        this.linkedln = linkedln;
    }
    
    
}
