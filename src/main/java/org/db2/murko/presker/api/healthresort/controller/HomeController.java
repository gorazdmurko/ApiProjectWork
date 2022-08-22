package org.db2.murko.presker.api.healthresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private final String HOKE_VIEW = "homeView";
    private final String REDIRECT = "redirect:/index";

    /* ======================================= - HOME VIEW - ======================================= */
    @GetMapping(value = "/")
    public String home() {
        return REDIRECT;
    }

    @RequestMapping("/index")
    public String getHomePage() {
        return HOKE_VIEW;           // redirects to homeView.jsp
    }
    /* ======================================= - HOME VIEW - ======================================= */



}
