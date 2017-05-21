package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RequestMapping("/")
@RestController
@EnableAutoConfiguration
public class RootController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public RedirectView getSwaggerUi(){
        return  new RedirectView("/swagger-ui.html");
    }

}