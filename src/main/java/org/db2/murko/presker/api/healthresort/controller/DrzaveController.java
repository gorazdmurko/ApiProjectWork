package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Drzave;
import org.db2.murko.presker.api.healthresort.services.IDrzaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Controller
@RequestMapping(value = "/drzava")
public class DrzaveController {

    @Autowired
    private IDrzaveService service;

    private final String DRZAVA_VIEW = "drzavaView";
    private final String DRZAVA_LIST_VIEW = "drzavaListView";
    private final String DRZAVA_ADD_VIEW = "drzavaCreateView";
    private final String RETURN_VIEW = "/returnView";
    private final String ERROR_VIEW = "error";

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return DRZAVA_VIEW;
    }

    @GetMapping(value = "/returnView")
    public String returnView() {
        return DRZAVA_VIEW;
    }

    @RequestMapping(value = "/getDrzava", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Drzave drzava = service.get(id);

        if (drzava != null) {
            drzava.toString();
            model.addAttribute("id", drzava.getId_drzave());
            model.addAttribute("drzava", drzava.getDrzava());
            model.addAttribute("oznaka", drzava.getOznaka_drzave());
        } else {
            model.addAttribute("error", "Id does not exist!");
        }

        return DRZAVA_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getDrzavaList(ModelMap model) {
        List<Drzave> list = service.getAll();
        model.addAttribute("drzave", list);

        return DRZAVA_LIST_VIEW;
    }


    // 1 .way
    @RequestMapping(value = "/getForm1", method = RequestMethod.GET)
    public ModelAndView showForm() {
        System.out.println("1. method called");
        return new ModelAndView(DRZAVA_ADD_VIEW, "drzave", new Drzave());
    }
    // 2. way
    @RequestMapping(value = "/getForm2", method = RequestMethod.GET)
    public String getDrzaveForm(@ModelAttribute("drzave") Drzave drzave, Model model) {
        System.out.println("2. method called");
        return DRZAVA_ADD_VIEW;
    }

    @RequestMapping(value = "/createDrzave", method = RequestMethod.POST)
    public String createDrzave(@ModelAttribute("drzave") Drzave drzave, BindingResult bindingResult, ModelMap model, RedirectAttributes redirectAttributes) {

        System.out.println("Saving posted state ...");
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", bindingResult);
            return ERROR_VIEW;
        }

        System.out.println("DRZAVA: " + drzave);
        System.out.println("ID: " + drzave.getId_drzave());
        System.out.println("IME: " + drzave.getDrzava());
        System.out.println("OZNAKA: " + drzave.getOznaka_drzave());

        service.save(drzave);

        redirectAttributes.addFlashAttribute("drzave", drzave);
        return "redirect:" + "/drzava" + RETURN_VIEW;
    }

    @RequestMapping(value = "/validateIdDrzave")
    public @ResponseBody String validateId(@RequestParam("id") Integer id) {

        System.out.println("Id validator invoked");

        Drzave drzava = service.get(id);
        String msg = "";

        if (drzava != null) {
            msg = id + " already exists";
        }

        drzava.toString();

        return msg;
    }

    @RequestMapping(value = "/deleteDrzava")
    public @ResponseBody String deleteById(@RequestParam("id") Integer id) {

        System.out.println("Delete by ID invoked! Id = " + id);

        service.deleteById(id);

        return "deleted";
    }


    @RequestMapping(value = "/back")
    public String back() {
        return DRZAVA_VIEW;
    }

}
