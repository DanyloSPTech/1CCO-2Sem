/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.figura.imagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Imagem {

    private List <Figura> figuras;
    
    public Imagem(){
        figuras = new ArrayList();
    }
    
    public void adicionarFigura(Figura f){
        figuras.add(f);
    }
    
    public void exibeFiguras(){
        System.out.println("Figuras:\n");
        for(Figura figura : figuras){
            System.out.println(figura.toString());
            System.out.println("-".repeat(30));
        }
    }
    
    public void exibeSomaArea(){
        Double somaArea = 0.0;
        for(Figura figura : figuras){
            somaArea += figura.calculaArea();
        }
        System.out.println("Soma Área: " + somaArea);
    }
    
    public void exibeFiguraAreaMaior20(){
        for(Figura figura : figuras){
            if(figura.calculaArea() > 20){
                System.out.println(figura.toString());
                System.out.println("-".repeat(30));
            }
        }
    }
    
    public void exibeQuadrado(){
        for(Figura figura : figuras){
            if(figura instanceof Quadrado){
                System.out.println(figura.toString());
                System.out.println("-".repeat(30));
            }
        }
    }
    
}
