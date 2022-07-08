package br.com.acrtech.planningpoker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planningpoker")
public class HomeController {
    @GetMapping
    public String home(){
        return "index";
    }
}
