/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.abstrato;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public abstract class Aluno {
    
    private String ra;
    private String nome;
    
    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }
    
    public abstract Double getMedia();

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Dados do Aluno:").append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Ra: ").append(ra).append("\n");
        sb.append("Media: ").append(getMedia());
        
        return sb.toString();
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
