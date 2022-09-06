package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.Drzave;
import org.db2.murko.presker.api.healthresort.entity.Osebe;
import org.db2.murko.presker.api.healthresort.entity.PostneStevilke;
import org.db2.murko.presker.api.healthresort.services.IOsebeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "osebe")
public class OsebeController {

    @Autowired
    private IOsebeService service;

    private final String OSEBE_VIEW = "osebeView";
    private final String OSEBE_LIST_VIEW = "osebeListView";
    private final String OSEBE_ADD_VIEW = "osebeCreateView";
    private final String RETURN_VIEW = "/returnView";
    private final String ERROR_VIEW = "error";

    @InitBinder
    private void dateBinder(WebDataBinder binder) {
        //The date format to parse or output your dates
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Create a new CustomDateEditor
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        //Register it as custom editor for the Date type
        binder.registerCustomEditor(Date.class, editor);
    }

    // https://stackoverflow.com/questions/3705282/spring-mvc-binding-a-date-field
    // https://stackoverflow.com/questions/41261069/bindingresult-requires-dates-input-even-without-not-null-or-validation

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return OSEBE_VIEW;
    }

    @GetMapping(value = "/returnView")
    public String returnView() {
        return OSEBE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        Osebe oseba = service.get(id);
        if (oseba != null) {
            oseba.toString();
            model.addAttribute("id_osebe", oseba.getId_osebe());
            model.addAttribute("ime", oseba.getIme());
            model.addAttribute("priimek", oseba.getPriimek());
            model.addAttribute("emso", oseba.getEmso());
            model.addAttribute("spol", oseba.getSpol());
            model.addAttribute("dat_roj", oseba.getDatum_rojstva());
            model.addAttribute("naslov", oseba.getNaslov());
            model.addAttribute("davcna", oseba.getDavcna_stevilka());
            model.addAttribute("id_pos_ste", oseba.getId_postne_stevilke());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return OSEBE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<Osebe> osebe = service.getAll();
        model.addAttribute("osebe", osebe);
        return OSEBE_LIST_VIEW;
    }


    // 1 .way
    @RequestMapping(value = "/getForm1", method = RequestMethod.GET)
    public ModelAndView showForm() {
        System.out.println("1. method called");
        return new ModelAndView(OSEBE_ADD_VIEW, "osebe", new Osebe());
    }
    // 2. way
    @RequestMapping(value = "/getForm2", method = RequestMethod.GET)
    public String getDrzaveForm(@ModelAttribute("osebe") Osebe osebe, Model model) {
        System.out.println("2. method called");
        return OSEBE_ADD_VIEW;
    }

    @RequestMapping(value = "/createOsebe", method = RequestMethod.POST)
    public String createDrzave(@ModelAttribute("osebe") Osebe osebe, BindingResult bindingResult,
                               ModelMap model, RedirectAttributes redirectAttributes) {

        System.out.println("Saving posted user ...");
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("msg", bindingResult);
//            return ERROR_VIEW;
//        }

        String spol = osebe.getSpol();
        byte[] bytes = spol.getBytes(StandardCharsets.UTF_8);
        String utf8 = new String(bytes, StandardCharsets.UTF_8);


        System.out.println("Oseba: " + osebe);
        System.out.println("ID: " + osebe.getId_osebe());
        System.out.println("Ime: " + osebe.getIme());
        System.out.println("Priimek: " + osebe.getPriimek());
        System.out.println("EMSO: " + osebe.getEmso());
        System.out.println("Spol: " + new String(osebe.getSpol().getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
        System.out.println("Datum rojstva: " + osebe.getDatum_rojstva());
        System.out.println("Naslov: " + osebe.getNaslov());
        System.out.println("Davcna stevilka: " + osebe.getDavcna_stevilka());
        System.out.println("Id postne stevilke: " + osebe.getId_postne_stevilke());

        service.save(osebe);

        redirectAttributes.addFlashAttribute("osebe", osebe);
        return "redirect:" + "/osebe" + RETURN_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return OSEBE_VIEW;
    }
}
