package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class PoslovniPartnerjiController {

    // service

    private final String POSLOVNI_PARTNERJI_VIEW = "poslovniPartnerjiView";
    private final String POSLOVNI_PARTNERJI_LIST_VIEW = "poslovniPartnerjiListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return POSLOVNI_PARTNERJI_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return POSLOVNI_PARTNERJI_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return POSLOVNI_PARTNERJI_LIST_VIEW;
    }
}
