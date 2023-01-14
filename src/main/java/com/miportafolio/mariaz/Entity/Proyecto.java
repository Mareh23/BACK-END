package com.miportafolio.mariaz.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcionP;
    
    //Constructores

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcionP) {
        this.nombre = nombre;
        this.descripcionP = descripcionP;
    }
    //Getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcionP;
    }

    public void setDescripcion(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
}
