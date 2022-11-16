/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtora.ator;

import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Produtora {

    private String nome;
    private Integer vagas;  
    private List <Ator> atores;
    
    public Produtora(String nome, Integer vagas, List <Ator> atores){
        this.nome = nome;
        this.vagas = vagas;
        this.atores = atores;
    }
    
    public Produtora(){
        
    }
    
    public Boolean existePorNome(String nome){
        for (Ator ator : atores){
            if(ator.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }
    
    public void contratar (Ator a){
        if(vagas > 0){
            atores.add(a);
            vagas--;
        }else{
            System.out.println("Sem vagas disponíveis!");
        }
    }
    
    public Integer getQuantidadeAtores(){
        Integer qtdAtores = 0;
        for(Ator ator : atores){
            qtdAtores++;
        }
        return qtdAtores;
    }
    
    public Integer getQuantidadeProtagonistas(){
        Integer qtdProtagonista = 0;
        for(Ator ator : atores){
            if(ator instanceof  Protagonista){
                qtdProtagonista++;
            }
        }
        return qtdProtagonista;
    }
    
    public Double getTotalSalarios(){
        Double salarioTotal = 0.0;
        for(Ator ator : atores){
            salarioTotal += ator.getSalario();
        }
        return salarioTotal;
    }
    
    public Ator buscarAtorPorNome(String nome){
        Ator busca = new Ator();
        for(Ator ator : atores){
            if(ator.getNome().equalsIgnoreCase(nome)){
                busca = ator;
            }
        }
        return busca;
    }
    
}
