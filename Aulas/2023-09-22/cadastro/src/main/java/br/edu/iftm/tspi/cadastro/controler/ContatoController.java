package br.edu.iftm.tspi.cadastro.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.iftm.tspi.cadastro.dao.ContatoDao;
import br.edu.iftm.tspi.cadastro.domain.Contato;

@Controller
public class ContatoController {
    @Autowired
    private ContatoDao dao;

    @RequestMapping("contatos")
    public String getContatos(Model model) {
        List<Contato> contatos = dao.getContatos();
        model.addAttribute("contatos", contatos);
        return "contatoList";
    }


    @PostMapping("contatos")
    public String inserContatos(Contato contato, Model model) {
        dao.inserirContato(contato);
        model.addAttribute("contatos", dao.getContatos());
        return "contatoList";
    }

    @RequestMapping("contatosParametro")
    public String getContatos(@RequestParam(value = "nome", required = true) String nome, Model model) {
        model.addAttribute("contatos", dao.getContatos(nome));
        return "contatoList";
    }

    

}
