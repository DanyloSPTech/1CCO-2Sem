/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.exercicio04;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Termometro {

    private Integer temperaturaAtual;
    private Integer temperaturaMax;
    private Integer temperaturaMin;
    
    public Termometro(Integer temperaturaAtual, Integer temperaturaMax, Integer temperaturaMin){
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }
    
    public void aumentaTemperatura(Integer variacao){
        if(temperaturaAtual + variacao > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        }else{
            temperaturaAtual += variacao;
        }
    }
    
    public void diminuiTemperatura(Integer variacao){
        if(temperaturaAtual - variacao < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        }else{
            temperaturaAtual -= variacao;
        }
    }
    
    public void exibeFahreinheit(){
        Double temperaturaF = this.temperaturaAtual * 1.8 + 32;
        System.out.printf("Temperatura atual em Fahrenheit: %.1f ºF", temperaturaF);
    }

    public Integer getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Integer temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Integer getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Integer temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Integer getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Integer temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }
    
}
