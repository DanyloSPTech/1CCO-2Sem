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

public class Circulo extends Figura{

    private Double raio;
    
    public Circulo(String cor, Integer espessura, Double raio){
        super(cor, espessura);
        this.raio = raio;
    }
    
    public Circulo(){
        
    }

    @Override
    public Double calculaArea() {
        return Math.PI * (raio * raio);
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

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
}
