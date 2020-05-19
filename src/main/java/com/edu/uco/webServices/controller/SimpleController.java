package com.edu.uco.webServices.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    /**Variable declarada en el applicaction properties
     * en el cual se asigna a ese String appName*/
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "home";
    }
}
