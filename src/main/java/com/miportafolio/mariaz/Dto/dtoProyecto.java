
package com.miportafolio.mariaz.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    
    //Constructores

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }
    //getters y setters

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
}
