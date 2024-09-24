package br.edu.iftm.tspi.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import
org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class home{
@RequestMapping("/alo")
public String alo(Model modelo) {
modelo.addAttribute("nro", 1);
return "home";
}
}