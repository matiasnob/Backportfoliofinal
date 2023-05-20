
package com.portfoliobackend.portfoliobackend.dto;

import jakarta.validation.constraints.NotBlank;


public class dtoProyectos {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String fotoP;
    @NotBlank
    private String periodoP;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String fotoP, String periodoP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fotoP = fotoP;
        this.periodoP = periodoP;
    }

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

    public String getFotoP() {
        return fotoP;
    }

    public void setFotoP(String fotoP) {
        this.fotoP = fotoP;
    }

    public String getPeriodoP() {
        return periodoP;
    }

    public void setPeriodoP(String periodoP) {
        this.periodoP = periodoP;
    }

}
