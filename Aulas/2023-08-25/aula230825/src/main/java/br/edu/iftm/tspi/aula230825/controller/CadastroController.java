package br.edu.iftm.tspi.aula230825.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.tspi.aula230825.dto.CadastroDTO;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class CadastroController {

    List<CadastroDTO> cadastros= new ArrayList<>();

    @PostMapping("cadastroResourcePost")
    public String doPost(CadastroDTO dto, Model model){
        cadastros.add(dto);
        return "listagem";
    }
    
    @RequestMapping("cadastroResourceGet")
    public String doGet(Model model){
        model.addAttribute("cadastros", cadastros);
        return "listagem";
    }

}
