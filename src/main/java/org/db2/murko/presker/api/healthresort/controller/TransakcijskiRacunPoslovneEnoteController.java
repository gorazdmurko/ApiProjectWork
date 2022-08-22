package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class TransakcijskiRacunPoslovneEnoteController {

    // service

    private final String T_RACUNI_ENOTE_VIEW = "transakcijskiRacuniposlovneEnoteView";
    private final String T_RACUNI_ENOTE_LIST_VIEW = "transakcijskiRacuniposlovneEnoteListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return T_RACUNI_ENOTE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return T_RACUNI_ENOTE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return T_RACUNI_ENOTE_LIST_VIEW;
    }
}
