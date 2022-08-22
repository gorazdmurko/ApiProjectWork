package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class TransakcijskiRacuniController {

    // service

    private final String x_VIEW = "";
    private final String x_LIST_VIEW = "";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return x_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return x_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return x_LIST_VIEW;
    }
}
