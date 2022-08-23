package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.PostneStevilke;
import org.db2.murko.presker.api.healthresort.services.IPostneStevilkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/postne_stevilke")
public class PostneStevilkeController {

    @Autowired
    private IPostneStevilkeService service;

    private final String POSTNE_VIEW = "postneStevilkeView";
    private final String POSTNE_LIST_VIEW = "postneStevilkeListView";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return POSTNE_VIEW;
    }

    @RequestMapping(value = "/getPostnaStevilka", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        PostneStevilke stevilka = service.get(id);

        if (stevilka != null) {
            stevilka.toString();
            model.addAttribute("id", stevilka.getId_postne_stevilke());
            model.addAttribute("postna_st", stevilka.getPostna_stevilka());
            model.addAttribute("kraj", stevilka.getKraj_mesto());
            model.addAttribute("id_drzave", stevilka.getId_drzave());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }

        return POSTNE_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<PostneStevilke> list = service.getAll();
        System.out.println("List of PostneStevilke: " + list);
        model.addAttribute("stevilke", list);
        return POSTNE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return POSTNE_VIEW;
    }

}
