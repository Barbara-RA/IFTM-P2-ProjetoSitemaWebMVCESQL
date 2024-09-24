package br.edu.iftm.tspi.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "home")
    public String metodo1(){
        return "home";
    }
    
}
