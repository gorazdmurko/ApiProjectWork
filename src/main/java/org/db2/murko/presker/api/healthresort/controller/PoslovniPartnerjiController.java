package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.entity.PoslovniPartnerji;
import org.db2.murko.presker.api.healthresort.services.IPoslovniPartnerjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "poslovni-partnerji")
public class PoslovniPartnerjiController {

    @Autowired
    private IPoslovniPartnerjiService service;

    private final String POSLOVNI_PARTNERJI_VIEW = "poslovniPartnerjiView";
    private final String POSLOVNI_PARTNERJI_LIST_VIEW = "poslovniPartnerjiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return POSLOVNI_PARTNERJI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        PoslovniPartnerji partner = service.get(id);
        if (partner != null) {
            partner.toString();
            model.addAttribute("id_pos_par", partner.getId_poslovni_partnerji());
            model.addAttribute("id_pos_ste", partner.getId_postne_stevilke());
            model.addAttribute("naziv1", partner.getNaziv1());
            model.addAttribute("naziv2", partner.getNaziv2());
            model.addAttribute("dav_ste", partner.getDavcna_stevilka());
            model.addAttribute("mat_ste", partner.getMaticna_stevilka());
            model.addAttribute("naslov", partner.getNaslov());
            model.addAttribute("e-naslov", partner.getE_naslov());
            model.addAttribute("telefon", partner.getTelefon());
        } else {
            model.addAttribute("error", "Id ne obstaja");
        }
        return POSLOVNI_PARTNERJI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<PoslovniPartnerji> list = service.getAll();
        model.addAttribute("partnerji", list);
        return POSLOVNI_PARTNERJI_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return POSLOVNI_PARTNERJI_VIEW;
    }
}
