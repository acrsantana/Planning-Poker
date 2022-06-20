package br.com.acrtech.planningpoker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planningpoker/login")
public class LoginController {

    @GetMapping
    public String login() {
        return "login/login";
    }
}
