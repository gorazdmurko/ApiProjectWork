package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Drzave;
import org.db2.murko.presker.api.healthresort.entity.PostneStevilke;
import org.db2.murko.presker.api.healthresort.services.IDrzaveService;
import org.db2.murko.presker.api.healthresort.services.IPostneStevilkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/postne_stevilke")
public class PostneStevilkeController {

    @Autowired
    private IPostneStevilkeService service;
    @Autowired
    private IDrzaveService serviceDrzave;

    private final String POSTNE_VIEW = "postneStevilkeView";
    private final String POSTNE_LIST_VIEW = "postneStevilkeListView";
    private final String POSTA_ADD_VIEW = "postneStevilkeCreateView";
    private final String RETURN_VIEW = "/returnView";
    private final String ERROR_VIEW = "error";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return POSTNE_VIEW;
    }

    @GetMapping(value = "/returnView")
    public String returnView() {
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


    // 1. way
    @RequestMapping(value = "/getForm1", method = RequestMethod.GET)
    public ModelAndView showForm() {
        System.out.println("1. method called");
        return new ModelAndView(POSTA_ADD_VIEW, "postnestevilke", new PostneStevilke());
    }
    // 2. way
    @RequestMapping(value = "/getForm2", method = RequestMethod.GET)
    public String getDrzaveForm(@ModelAttribute("postnestevilke") PostneStevilke postneStevilke, Model model) {
        System.out.println("1. method called");
        return POSTA_ADD_VIEW;
    }

    @RequestMapping(value = "/createPostneStevilke", method = RequestMethod.POST)
    public String createDrzave(@ModelAttribute("postnestevilke") PostneStevilke postneStevilke, BindingResult bindingResult,
                               ModelMap model, RedirectAttributes redirectAttributes) {

        System.out.println("Saving posted number ...");
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", bindingResult);
            model.addAttribute("url", "postne_stevilke");
            return ERROR_VIEW;
        }

        System.out.println("Postna stevilka: " + postneStevilke);
        System.out.println("ID: " + postneStevilke.getId_postne_stevilke());
        System.out.println("Stevilka: " + postneStevilke.getPostna_stevilka());
        System.out.println("Mesto: " + postneStevilke.getKraj_mesto());
        System.out.println("Id drzave: " + postneStevilke.getId_drzave());

        service.save(postneStevilke);

        redirectAttributes.addFlashAttribute("postneStevilke", postneStevilke);
        return "redirect:" + "/postne_stevilke" + RETURN_VIEW;
    }

    @RequestMapping(value = "/validateIdPostneStevilke")
    public @ResponseBody String validateIdPoste(@RequestParam("id") Integer id) {

        System.out.println("Id validator invoked");

        PostneStevilke stevilka = service.get(id);
        String msg = "";

        if (stevilka != null) {
            msg = id + " already exists";
        }

        stevilka.toString();

        return msg;
    }

    @RequestMapping(value = "/validateIdDrzave")
    public @ResponseBody String validateIdDrzave(@RequestParam("id") Integer id) {

        System.out.println("Id validator invoked");

        Drzave drzava = serviceDrzave.get(id);
        String msg = "";

        if (drzava != null) {
            msg = id + " already exists";
        }

        drzava.toString();

        return msg;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return POSTNE_VIEW;
    }

}
