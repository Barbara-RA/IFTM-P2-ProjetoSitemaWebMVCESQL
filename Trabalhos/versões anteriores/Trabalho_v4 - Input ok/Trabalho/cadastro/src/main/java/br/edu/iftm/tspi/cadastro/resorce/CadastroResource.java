package br.edu.iftm.tspi.cadastro.resorce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.tspi.cadastro.dto.CadastroDTO;

@Controller

public class CadastroResource {

    private List<CadastroDTO> cadastros = new ArrayList<>();

    // public CadastroResource (){
    //     CadastroDTO cadastro   = new CadastroDTO();
    //     cadastro.setNickName("barbs_ramos");;
    //     cadastro.setLendaFavorita("Ash");
    //     cadastro.setPartidasJogadas(1000);
    //     cadastro.setPartidasGanhas(200);
    //     cadastro.setMaximoDano(5000);
    //     cadastros.add(cadastro);

    // }

    @PostMapping("cadastroPost")
    public String doPost(CadastroDTO dto, Model model){
        cadastros.add(dto);
        return doGet(model);
    // public String doPost(String nickName, String lendaFavorita, int partidasJogadas, int partidasGanhas, double maximoDano, Model model){
    //     return "";
    }
    
    @RequestMapping("cadastroPost")
    public String doGet(Model model){
        model.addAttribute("cadastros", cadastros);
        System.out.println(cadastros.get(0).getNickName());
        return "lista";
    }

    

}
