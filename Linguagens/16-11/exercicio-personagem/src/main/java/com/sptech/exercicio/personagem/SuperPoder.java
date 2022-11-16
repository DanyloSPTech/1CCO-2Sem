/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exercicio.personagem;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class SuperPoder {

    private String nome;
    private Integer categoria;
    
    public SuperPoder(String nome, Integer categoria){
        this.nome = nome;
        this.categoria = categoria;
    }
    
    public SuperPoder(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Super Poder:").append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Categoria: ").append(categoria).append("\n");
        
        return sb.toString();
    }
    
}
