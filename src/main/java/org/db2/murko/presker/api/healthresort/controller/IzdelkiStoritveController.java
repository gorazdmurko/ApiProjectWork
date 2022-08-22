package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class IzdelkiStoritveController {

    // service

    private final String IZDELKI_STORITVE_VIEW = "izdelkiStoritveView";
    private final String IZDELKI_STORITVE_LIST_VIEW = "izdelkiStoritveListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return IZDELKI_STORITVE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return IZDELKI_STORITVE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return IZDELKI_STORITVE_LIST_VIEW;
    }
}
