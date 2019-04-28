package org.formacio.repositori;


public class Persona {

    /* ---- Properties ---- */
    private String clau;
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
        return clau;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getNom() {
        return nom;
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
