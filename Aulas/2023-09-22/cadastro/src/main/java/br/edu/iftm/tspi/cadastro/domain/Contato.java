package br.edu.iftm.tspi.cadastro.domain;

import lombok.Data;

@Data
public class Contato {
    private String email;
    private String nome;


    // classe que mapea o banco tem construtor sem argumento
    public Contato(){

    }

    public Contato(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }
    
}
