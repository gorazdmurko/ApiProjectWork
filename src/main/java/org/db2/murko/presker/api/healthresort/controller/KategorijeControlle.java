package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class KategorijeControlle {

    // service

    private final String KATEGORIJE_VIEW = "kategorijeView";
    private final String KATEGORIJE_LIST_VIEW = "kategorijeListView";

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public String getView() {
        return KATEGORIJE_VIEW;
    }

    @RequestMapping(value = "getEntity", method = RequestMethod.POST)
    public String getEntity() {
        return KATEGORIJE_VIEW;
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public String getList() {
        return KATEGORIJE_LIST_VIEW;
    }
}
