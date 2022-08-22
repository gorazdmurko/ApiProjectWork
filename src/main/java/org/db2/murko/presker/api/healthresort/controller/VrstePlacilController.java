package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class VrstePlacilController {

    // service

    private final String VRSTE_PLACIL_VIEW = "vrstePlacilView";
    private final String VRSTE_PLACIL_LIST_VIEW = "vrstePlacilListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return VRSTE_PLACIL_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return VRSTE_PLACIL_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return VRSTE_PLACIL_LIST_VIEW;
    }
}
