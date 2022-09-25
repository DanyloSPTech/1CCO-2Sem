/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.lista;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Filme {

    private String nome;
    private Integer ano;
    private String diretor;

    public Filme(String nome, Integer ano, String diretor) {
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getAno(){
        return this.ano;
    }
    
    public void setAno(Integer ano){
        this.ano = ano;
    }
    
    public String getDiretor(){
        return this.diretor;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" + "\nnome: " + nome + ", \nano: " + ano + ", \ndiretor: " + diretor + "\n}";
    }
    
    
    
    
    
}
