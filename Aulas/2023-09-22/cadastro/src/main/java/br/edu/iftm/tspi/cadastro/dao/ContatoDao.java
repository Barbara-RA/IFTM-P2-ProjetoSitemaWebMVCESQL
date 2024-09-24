package br.edu.iftm.tspi.cadastro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import br.edu.iftm.tspi.cadastro.domain.Contato;

@Component
public class ContatoDao {
    @Autowired
    private JdbcTemplate db;

    public List<Contato> getContatos() {
        String sql = "select email,nome from tb_contato";

        return db.query(sql, (rowData, rowNum) -> {
            return new Contato(
                    rowData.getString("nome"),
                    rowData.getString("email"));

        });
    }

    public List<Contato> getContatos(String nome) {
        // ? é parâmetro
        String sql = "select email, nome from tb_contato where lower(nome) like ?";
        return db.query(sql,
                new BeanPropertyRowMapper<>(Contato.class), //faz a mesma coisa do que o método de cima mas de forma resumida
                new Object[] { "%" + nome + "%" });
    }


    public void inserirContato(Contato contato){
        String sql = "Insert into tb_contato(email,nome) values(?,?)";

        db.update(sql,new Object[]{contato.getEmail(), contato.getNome()});
    }

    public void updateContato(Contato contato){
        String sql = "update tb_contato set nome = ? where email = ?";

        db.update(sql,new Object[]{contato.getNome(), contato.getEmail()});
    }

    public void deleteContato(String email){
        String sql = "delete from tb_contato where email = ?";

        db.update(sql,new Object[]{email});
    }




}
