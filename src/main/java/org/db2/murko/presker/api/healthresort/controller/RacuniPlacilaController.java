package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class RacuniPlacilaController {

    // service

    private final String RACUNI_PLACILA_VIEW = "racuniPlacilaView";
    private final String RACUNI_PLACILA_LIST_VIEW = "racuniPlacilaListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return RACUNI_PLACILA_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return RACUNI_PLACILA_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return RACUNI_PLACILA_LIST_VIEW;
    }
}
