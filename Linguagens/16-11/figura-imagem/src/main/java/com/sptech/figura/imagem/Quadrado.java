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

public class Quadrado extends Figura{
    
    private Double lado;
    
    public Quadrado(String cor, Integer espessura, Double lado){
        super(cor, espessura);
        this.lado = lado;
    }
    
    public Quadrado(){
        
    };

    @Override
    public Double calculaArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Figura:").append("\n");
        sb.append("Cor: ").append(super.getCor()).append("\n");
        sb.append("Espessura: ").append(super.getEspessura()).append("\n");
        sb.append("Area: ").append(calculaArea()).append("\n");
        
        return sb.toString();
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
}
