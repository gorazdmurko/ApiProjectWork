package org.db2.murko.presker.api.healthresort.controller;

import org.db2.murko.presker.api.healthresort.dao.IIzdaniRacuniPostavkeDao;
import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuniPostavke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/izdani-racuni-postavke")
public class IzdaniRacuniPostavkeController {

    @Autowired
    private IIzdaniRacuniPostavkeDao service;

    private final String RACUNI_POSTAVKE_VIEW = "izdaniRacuniPostavkeView";
    private final String RACUNI_POSTAVKE_LIST_VIEW = "izdaniRacuniPostavkeListView";


    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getView() {
        return RACUNI_POSTAVKE_VIEW;
    }

    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public String getEntity(@RequestParam("id") int id, ModelMap model) {
        IzdaniRacuniPostavke postavka = service.get(id);

        if (postavka != null) {
            postavka.toString();
            model.addAttribute("id_izd_rac_pos", postavka.getId_izdani_racuni_postavke());
            model.addAttribute("id_izd_rac", postavka.getId_izdani_racuni());
            model.addAttribute("id_izd_sto", postavka.getId_izdelki_storitve());
            model.addAttribute("kolicina", postavka.getKolicina());
            model.addAttribute("popust", postavka.getPopust());
            model.addAttribute("ods_ddv", postavka.getOdstotek_ddv());
            model.addAttribute("id_dav_sto", postavka.getId_davcne_stopnje());
            model.addAttribute("placa_zzzs", postavka.getPlaca_zzzs());
        } else {
            model.addAttribute("error", "Id ne obstaja!");
        }

        return RACUNI_POSTAVKE_VIEW;
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        List<IzdaniRacuniPostavke> list = service.getAll();
        System.out.println("List of IzdaniRacuniPostavke: " + list);
        model.addAttribute("postavke", list);
        return RACUNI_POSTAVKE_LIST_VIEW;
    }

    @RequestMapping(value = "/back")
    public String back() {
        return RACUNI_POSTAVKE_VIEW;
    }
}
