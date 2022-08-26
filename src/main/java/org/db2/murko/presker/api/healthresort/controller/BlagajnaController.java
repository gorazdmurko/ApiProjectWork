package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.db2.murko.presker.api.healthresort.services.IBlagajneService;
import org.db2.murko.presker.api.healthresort.services.IService;
import org.db2.murko.presker.api.healthresort.services.impl.BlagajneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/blagajna")
public class BlagajnaController {

//    @Autowired
//    IBlagajneService service;

    private IService getService(IService service) {
        return service;
    }

    private IService service = getService(new BlagajneServiceImpl());

    private final String BLAGAJNA_VIEW = "blagajnaView";
    private final String BLAGAJNA_LIST_VIEW = "blagajneListView";


    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return BLAGAJNA_VIEW;
    }


    @RequestMapping(value = "/getBlagajna", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Blagajne blagajna = (Blagajne) service.get(id);
        // Blagajne blagajna = service.getBlagajne(id);

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

    @RequestMapping(value = "/getBlagajneList")
    public String getBlagajneList(ModelMap model) {
        List<Blagajne> blagajne = service.getAll();
        // List<Blagajne> blagajne = service.getBlagajneAll();
        System.out.println("List of Blagajne: " + blagajne);
        model.addAttribute("blagajne", blagajne);
        return BLAGAJNA_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return BLAGAJNA_VIEW;
    }
}
