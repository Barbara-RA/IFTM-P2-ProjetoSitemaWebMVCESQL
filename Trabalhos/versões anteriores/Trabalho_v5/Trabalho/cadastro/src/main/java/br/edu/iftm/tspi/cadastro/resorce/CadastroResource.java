package br.edu.iftm.tspi.cadastro.resorce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// teste
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.iftm.tspi.cadastro.dto.CadastroDTO;

@Controller

public class CadastroResource {

    private List<CadastroDTO> cadastros = new ArrayList<>();

    // public CadastroResource (){
    // CadastroDTO cadastro = new CadastroDTO();
    // cadastro.setNickName("barbs_ramos");;
    // cadastro.setLendaFavorita("Ash");
    // cadastro.setPartidasJogadas(1000);
    // cadastro.setPartidasGanhas(200);
    // cadastro.setMaximoDano(5000);
    // cadastros.add(cadastro);

    // }

    @PostMapping("cadastroPost")
    public String doPost(CadastroDTO dto, Model model) {
        cadastros.add(dto);
        return doGet(model);
        // public String doPost(String nickName, String lendaFavorita, int
        // partidasJogadas, int partidasGanhas, double maximoDano, Model model){
        // return "";
    }

    @RequestMapping("cadastroPost")
    public String doGet(Model model) {
        model.addAttribute("cadastros", cadastros);
        System.out.println(cadastros.get(0).getNickName());
        return "lista";
    }

    // @GetMapping("/cadastroDelete/{nickName}")
    // public String cadastroDelete(@PathVariable String nickName, RedirectAttributes redirectAttributes) {
    //     // Implemente o código para encontrar e remover o cadastro com base no nickName
    //     CadastroDTO cadastroParaRemover = null;
    
    //     for (CadastroDTO cadastro : cadastros) {
    //         if (cadastro.getNickName().equals(nickName)) {
    //             cadastroParaRemover = cadastro;
    //             break;
    //         }
    //     }
    
    //     if (cadastroParaRemover != null) {
    //         cadastros.remove(cadastroParaRemover);
    //         redirectAttributes.addFlashAttribute("message", "Cadastro excluído com sucesso.");
    //     } else {
    //         redirectAttributes.addFlashAttribute("error", "Cadastro não encontrado.");
    //     }
    
    //     // Redirecione para a página lista após a exclusão
    //     return "redirect:/lista";
    // }
    

    

}
