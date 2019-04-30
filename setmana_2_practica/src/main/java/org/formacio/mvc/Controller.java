package org.formacio.mvc;


import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller extends RuntimeException {

    /* ---- Properties ---- */
    @Autowired
    private AgendaService agendaService = null;


    /* ---- Behaviours ---- */
    @RequestMapping(path = "/nombre")
    public int returnNumberOfContacts() {
        return agendaService.nombreContactes();
    }

    @RequestMapping(path = "/telefon")
    public String returnPersonPhone(@RequestParam String id) {
        return agendaService.recupera(id).getTelefon();
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "ID not in database")
    @ExceptionHandler(Exception.class)
    public void error() {
    }

    @RequestMapping(path = "/contacte/{id}")
    public Persona returnPerson(@PathVariable String id) throws Exception {
        if (!agendaService.getBbdd().containsKey(id)) {
            Exception idNotInBBDD = new Exception();
            throw idNotInBBDD;
        }
        return agendaService.recupera(id);
    }

    @RequestMapping(path = "/afegir", method = RequestMethod.POST)
    public void addNewContact(@RequestParam String id, String nom, String telèfon) {
        agendaService.inserta(id, nom, telèfon);
    }
}
