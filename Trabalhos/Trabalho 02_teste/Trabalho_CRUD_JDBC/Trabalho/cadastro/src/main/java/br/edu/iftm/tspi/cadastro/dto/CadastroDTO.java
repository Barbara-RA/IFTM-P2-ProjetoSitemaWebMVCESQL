package br.edu.iftm.tspi.cadastro.dto;

import lombok.Data;

@Data
public class CadastroDTO {
    private String nickName;
    private String lendaFavorita;
    private String partidasJogadas;
    private String partidasGanhas;
    private String maximoDano;

    public CadastroDTO(String nickName, String lendaFavorita, String partidasJogadas, String partidasGanhas, String maximoDano) {
        this.nickName = nickName;
        this.lendaFavorita = lendaFavorita;
        this.partidasJogadas = partidasJogadas;
        this.partidasGanhas = partidasGanhas;
        this.maximoDano = maximoDano;
    }
}
