/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Aluno {

    /*
        Modificadores de Acesso (visibilidade):
            - default
            - private
            - public
            - protected
    */
    
    private String ra;
    private String nome;
    private Double notaAc1 = 0.0;
    private Double notaAc2 = 0.0;
    
    public String getRa(){
        return ra;
    }
    
    public void setRa(String ra){
        this.ra = ra;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getNotaAc1() {
        return notaAc1;
    }

    public void setNotaAc1(Double notaAc1) {
        if(isNotaValida(notaAc1)){
            this.notaAc1 = notaAc1;
        }
    }

    public Double getNotaAc2() {
        return notaAc2;
    }

    public void setNotaAc2(Double notaAc2) {
        if(isNotaValida(notaAc2)){
            this.notaAc2 = notaAc2;
        }
    }
    
    private Boolean isNotaValida(Double nota){
        return nota >= 0.0 && nota <= 10.0;
    }
    
    Double obterMedia(){
        return (notaAc1 + notaAc2) / 2;
    }
        
}
