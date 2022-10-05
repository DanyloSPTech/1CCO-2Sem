/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.banco;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Danylo Dias Gomes
 */

public class TesteDatabase {

    public static void main(String[]args){
        
        Database database = new Database();
        
        JdbcTemplate connection = database.getConnection();
     
//        connection.execute("DROP TABLE filme IF EXISTS;");
//
//        connection.execute(
//            "CREATE TABLE filme ("
//            + "id INT PRIMARY KEY AUTO_INCREMENT,"
//            + "nome VARCHAR(255) NOT NULL,"
//            + "ano_lancamento int NOT NULL"
//            + ");"
//         );

//        connection.update(
//                "INSERT INTO Filme VALUES (?, ?, ?)",
//                null,
//                "Avatar",
//                2009
//        );
        
        List<Filme> resultado = connection.query(
                "SELECT * FROM Filme",
                new BeanPropertyRowMapper(Filme.class));
        
        List<Filme> resultadoWhere = connection.query(
                "SELECT * FROM Filme WHERE id = ?",
                new BeanPropertyRowMapper(Filme.class), 1);
        
        System.out.println(connection.queryForList(
                "SELECT * FROM Filme;"
        ));
        
        for(Filme filme : resultado) {
            System.out.println("Nome: " + filme.getNome() + "\n");
        }
        
        for(Filme filmeWhere : resultadoWhere) {
            System.out.println("ID com Where: " + filmeWhere.getId()+ "\n");
            System.out.println("Nome com Where: " + filmeWhere.getNome() + "\n");
            System.out.println("Ano de Lançamento com Where: " + filmeWhere.getAnoLancamento()+ "\n");
        }
    }
    
}
