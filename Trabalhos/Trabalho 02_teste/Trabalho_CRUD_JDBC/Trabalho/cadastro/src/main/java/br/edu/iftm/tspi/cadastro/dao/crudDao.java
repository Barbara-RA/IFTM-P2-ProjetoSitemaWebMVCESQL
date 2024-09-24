package br.edu.iftm.tspi.cadastro.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import br.edu.iftm.tspi.cadastro.dto.CadastroDTO;

@Component
public class crudDao {
    @Autowired
    JdbcTemplate db;
    
    public List<CadastroDTO> getTodos(){
        String sql = "select  email,nome from tb_dados";
    
        return db.query(sql, (rs, rowNum) -> {
        return new CadastroDTO(
            res.getString(nickName),
            res.getString(lendaFavorita),
            res.getString(partidasJogadas),
            res.getString(partidasGanhas),
            res.getString(maximoDano)
        );

     });
    }
 


}
