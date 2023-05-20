
package com.portfoliobackend.portfoliobackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String fotoP;
    private String periodoP;

    public Proyectos() {
    }

    public Proyectos(String nombreP, String descripcionP, String fotoP, String periodoP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fotoP = fotoP;
        this.periodoP = periodoP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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