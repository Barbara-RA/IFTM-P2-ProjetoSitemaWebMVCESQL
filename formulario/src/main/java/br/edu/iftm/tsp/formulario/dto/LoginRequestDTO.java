package br.edu.iftm.tsp.formulario.dto;


import lombok.Data;

@Data

public class LoginRequestDTO {
    private String name;
private String email;
//o Lombok elimina verbosidade, isto é, não necessita de se criar getters and setters
}
