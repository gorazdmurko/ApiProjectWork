package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.db2.murko.presker.api.healthresort.services.IService;
import org.db2.murko.presker.api.healthresort.services.impl.AService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/blagajna-test")
public class Controller {

    private IService service = getService(new AService());
    private final String BLAGAJNA_VIEW = "blagajnaView";
    private final String BLAGAJNA_LIST_VIEW = "blagajneListView";


    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void createEntity(Blagajne blagajna) {
        service.save(blagajna);
    }

    @RequestMapping(value = "/getBlagajna", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Blagajne blagajna = (Blagajne) service.get(id);
        if (blagajna != null) {
            System.out.println("Blagajna: " + blagajna);
            model.addAttribute("id", blagajna.getId_blagajne());
            model.addAttribute("oznaka", blagajna.getOznaka_blagajne());
            model.addAttribute("id_pos_en", blagajna.getId_poslovne_enote());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }
        return BLAGAJNA_VIEW;
    }

    @RequestMapping(value = "/getBlagajnaList", method = RequestMethod.GET)
    public String getAll(ModelMap model) {
        List<Blagajne> blagajne = service.getAll();
        System.out.println("List of Blagajne: " + blagajne);
        model.addAttribute("blagajne", blagajne);
        return BLAGAJNA_LIST_VIEW;
    }

    // SERVICE
    private IService getService(IService service) {
        return service;
    }
}
