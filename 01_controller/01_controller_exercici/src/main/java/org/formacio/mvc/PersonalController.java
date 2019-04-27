package org.formacio.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    /**
     * No toqueu la declaracio de baseDeDades ni el metode getBaseDeDades.
     * <p>
     * Els metodes que anau afegint, tracteu aquest array com si fos la base de dades: per exemple, obtenir la persona
     * amb id 1 sera fer baseDeDades.get(1), etc etc
     */

    /* ---- Properties ---- */
    private List<String> baseDeDades = new ArrayList<>(Arrays.asList("Joana", "Antonia", "Pere"));


    /* ---- Getters ---- */
    public List<String> getBaseDeDades() {
        return baseDeDades;
    }


    /* ---- Behaviours ---- */
}
