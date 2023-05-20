package com.portfoliobackend.portfoliobackend.dto;

import jakarta.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fotoE;
    @NotBlank
    private String periodoE;

    //Constructores
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String fotoE, String periodoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fotoE = fotoE;
        this.periodoE = periodoE;
    }
    //Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFotoE() {
        return fotoE;
    }

    public void setFotoE(String fotoE) {
        this.fotoE = fotoE;
    }
    
        public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }

}
