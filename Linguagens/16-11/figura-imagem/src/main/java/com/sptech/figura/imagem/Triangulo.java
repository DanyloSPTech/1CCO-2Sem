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

public class Triangulo extends Figura{
    
    private Double base;
    private Double altura;
    
    public Triangulo(String cor, Integer espessura, Double base, Double altura){
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }
    
    public Triangulo(){
        
    }

    @Override
    public Double calculaArea() {
        return (base * altura) / 2;
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

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
}
