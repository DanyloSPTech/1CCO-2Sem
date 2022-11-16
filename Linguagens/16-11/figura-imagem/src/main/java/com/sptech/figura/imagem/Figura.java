/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.figura.imagem;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public abstract class Figura {

    private String cor;
    private Integer espessura;
    
    public Figura(String cor, Integer espessura){
        this.cor = cor;
        this.espessura = espessura;
    }
    
    public Figura(){
        
    };
    
    public abstract Double calculaArea();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Figura:").append("\n");
        sb.append("Cor: ").append(cor).append("\n");
        sb.append("Espessura: ").append(espessura).append("\n");
        sb.append("Area: ").append(calculaArea()).append("\n");
        
        return sb.toString();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
    
    
    
}
