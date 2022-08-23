package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.dao.IIzdelkiStoritveDao;
import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "izdelki-storitve")
public class IzdelkiStoritveController {

    @Autowired
    private IIzdelkiStoritveDao service;

    private final String IZDELKI_STORITVE_VIEW = "izdelkiStoritveView";
    private final String IZDELKI_STORITVE_LIST_VIEW = "izdelkiStoritveListView";


    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return IZDELKI_STORITVE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        IzdelkiStoritve storitev = service.get(id);
        if (storitev != null) {
            storitev.toString();
            model.addAttribute("id_izd_sto", storitev.getId_izdelki_storitve());
            model.addAttribute("izd_storitev", storitev.getIzdelek_storitev());
            model.addAttribute("izd_sto_k", storitev.getIzdelek_storitev_k());
            model.addAttribute("pro_cena", storitev.getProdajna_cena());
            model.addAttribute("id_kategorije", storitev.getId_kategorije());
            model.addAttribute("id_dav_sto", storitev.getId_davcne_stopnje());
            model.addAttribute("id_pp_pro", storitev.getId_pp_zunanji_izvajalec());
            model.addAttribute("paket", storitev.getPaket());
            model.addAttribute("opis", storitev.getOpis());
            model.addAttribute("id_zun_izv", storitev.getId_pp_zunanji_izvajalec());
            model.addAttribute("zun_storitev", storitev.getZunanje_storitve());
        } else {
            model.addAttribute("error", "Id ne obstaja!");
        }
        return IZDELKI_STORITVE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<IzdelkiStoritve> list = service.getAll();
        System.out.println("List of IzdelkiStoritve: " + list);
        model.addAttribute("storitve", list);
        return IZDELKI_STORITVE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return IZDELKI_STORITVE_VIEW;
    }
}
