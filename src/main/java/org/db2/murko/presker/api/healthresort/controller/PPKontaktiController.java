package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class PPKontaktiController {

    // service

    private final String KONTAKTI_VIEW = "ppKontaktiView";
    private final String KONTAKTI_LIST_VIEW = "ppKontaktiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return KONTAKTI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return KONTAKTI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return KONTAKTI_LIST_VIEW;
    }
}
