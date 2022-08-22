package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class OsebeController {

    // service

    private final String OSEBE_VIEW = "osebeView";
    private final String OSEBE_LIST_VIEW = "osebeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return OSEBE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return OSEBE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return OSEBE_VIEW;
    }
}
