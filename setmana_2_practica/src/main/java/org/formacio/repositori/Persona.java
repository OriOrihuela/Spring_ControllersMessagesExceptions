package org.formacio.repositori;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Persona {

    /* ---- Properties ---- */
    private String clau;

    @JsonProperty("contacte")
    private String nom;
    private String telefon;


    /* ---- Constructors ---- */
    public Persona() {
    }

    public Persona(String clau, String nom, String telefon) {
        this.clau = clau;
        this.nom = nom;
        this.telefon = telefon;
    }


    /* ---- Getters ---- */
    public String getClau() {
        return this.clau;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public String getNom() {
        return this.nom;
    }


    /* ---- Setters ---- */
    public void setClau(String clau) {
        this.clau = clau;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
