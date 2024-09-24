package mvc.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.loja.dto.Cliente;
import mvc.loja.service.ClienteService;


@Controller
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    private static final String baseUrl = "cliente";   
    private static final String baseAtributo = "cliente";

    @GetMapping(baseUrl + "/getAll")
    public String getAll(Model model){
        
        model.addAttribute(baseAtributo, clienteService.getAll());

        return "listaCliente";
    }

    @GetMapping(baseUrl + "/getById")
    public String getById(Long id, Model model){
        
        model.addAttribute(baseAtributo, clienteService.getById(id));
        model.addAttribute("editando", true);

        return "cliente";
    }

    @GetMapping(baseUrl + "/add")
    public String add(Model model){
        model.addAttribute("editando", false);

        return "cliente";
    }

    @PostMapping(baseUrl + "/insert")
    public String insert(Cliente cliente, Model model){
        clienteService.insert(cliente);

        return getAll(model);
    }
    
    @PostMapping(baseUrl + "/update")
    public String update(Cliente cliente, Model model){
        clienteService.update(cliente);

        return getAll(model);
    }

    @RequestMapping(baseUrl + "/delete")
    public String delete(Long id, Model model){
        clienteService.delete(id);

        return getAll(model);
    }
    
}
