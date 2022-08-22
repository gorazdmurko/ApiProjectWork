package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class ObjektiController {

    // service

    private final String OBJEKTI_VIEW = "objektiView";
    private final String OBJEKTI_LIST_VIEW = "objektiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return OBJEKTI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return OBJEKTI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return OBJEKTI_LIST_VIEW;
    }
}
