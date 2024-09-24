package br.edu.iftm.tsp.formulario.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.iftm.tsp.formulario.dto.LoginRequestDTO;

@Controller

public class LoginResource {
    @PostMapping("/loginResource")
    public String postNewsletter(LoginRequestDTO loginRequestDTO, Model model){
    model.addAttribute(loginRequestDTO);
    return "output";
    }
}
