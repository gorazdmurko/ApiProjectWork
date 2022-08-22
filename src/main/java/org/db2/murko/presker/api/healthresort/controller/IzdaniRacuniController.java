package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/izdani-racuni")
public class IzdaniRacuniController {

    // service

    private final String IZDANI_RACUNI_VIEW = "izdaniRacuniView";
    private final String IZDANI_RACUNI_LIST_VIEW = "izdaniRacuniListViev";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return IZDANI_RACUNI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return IZDANI_RACUNI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return IZDANI_RACUNI_LIST_VIEW;
    }
}
