package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class ZaposleniController {

    // service

    private final String ZAPOSLENI_VIEW = "zaposleniView";
    private final String ZAPOSLENI_LIST_VIEW = "zaposleniListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return ZAPOSLENI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return ZAPOSLENI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return ZAPOSLENI_LIST_VIEW;
    }
}
