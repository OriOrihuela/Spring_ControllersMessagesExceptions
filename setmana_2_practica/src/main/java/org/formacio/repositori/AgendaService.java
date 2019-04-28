package org.formacio.repositori;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class AgendaService {

    /* ---- Properties ---- */
    private Map<String, Persona> bbdd = new LinkedHashMap<>();


    /* ---- Getters ---- */
    public Map<String, Persona> getBbdd() {
        return this.bbdd;
    }

    /* ---- Behaviours ---- */
    @PostConstruct
    public void init() {
        getBbdd().put("ant", new Persona("ant", "Antoni", "971-555123"));
        getBbdd().put("joa", new Persona("joa", "Joana", "971-555555"));
        getBbdd().put("lin", new Persona("lin", "Lina", "971-555888"));
    }

    public void inserta(String id, String nom, String telefon) {
        getBbdd().put(id, new Persona(id, nom, telefon));
    }

    public Persona recupera(String id) {
        return getBbdd().get(id);
    }

    public int nombreContactes() {
        return getBbdd().size();
    }
}
