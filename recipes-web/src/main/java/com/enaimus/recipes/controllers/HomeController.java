package com.enaimus.recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = {"", "/index.html", "/index", "/" })
    public String getIndexPage(Model model){
        return "index";
    }
}
