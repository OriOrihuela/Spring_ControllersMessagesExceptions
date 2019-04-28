package org.formacio.mvc;

import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    /* ---- Properties ---- */
    @Autowired
    private AgendaService agendaService = null;


    /* ---- Getters ---- */
    public AgendaService getAgendaService() {
        return this.agendaService;
    }

    /* ---- Behaviours ---- */
    @RequestMapping("/nombre")
    public int returnNumberOfContacts() {
        return getAgendaService().nombreContactes();
    }

    @RequestMapping("/telefon")
    public String returnPersonPhone(String id) {
        return getAgendaService().recupera(id).getTelefon();
    }

    @RequestMapping("/contacte/{id}")
    public Persona returnPerson(@PathVariable String id) {
        return getAgendaService().recupera(id);
    }

}
