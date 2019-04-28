package org.formacio.mvc;

import org.formacio.repositori.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    /* ---- Properties ---- */
    @Autowired
    private AgendaService agendaService = null;


    /* ---- Behaviours ---- */
    @RequestMapping("/nombre")
    public int returnNumberOfContacts() {
        return agendaService.nombreContactes();
    }
}
