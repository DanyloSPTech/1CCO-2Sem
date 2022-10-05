/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.banco;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Database {

  // ATRIBUTO
  private JdbcTemplate connection;
  
  // CONSTRUTOR
  public Database() {

    BasicDataSource dataSource = new BasicDataSource();

    dataSource​.setDriverClassName("org.h2.Driver");
    dataSource​.setUrl("jdbc:h2:file:./banco_teste");
    dataSource​.setUsername("sa");
    dataSource​.setPassword("");

    this.connection = new JdbcTemplate(dataSource);

  }

  // GETTER
  public JdbcTemplate getConnection() {

    return connection;

  }
    
}
