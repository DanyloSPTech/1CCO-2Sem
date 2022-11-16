/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.figura.imagem;

import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class App {

    public static void main(String[]args){
        
        Quadrado q = new Quadrado("Azul", 3, 5.10);
        Retangulo r = new Retangulo("Vermelho", 2, 2.10, 12.50);
        Triangulo t = new Triangulo("Verde", 4, 8.50, 2.80);
        Circulo c = new Circulo("Amarelo", 1, 15.00);
        
        List <Figura> figuras;
        
        Imagem i = new Imagem();
        
        i.adicionarFigura(q);
        i.adicionarFigura(r);
        i.adicionarFigura(t);
        i.adicionarFigura(c);
        
        System.out.println("Exibindo Figuras...\n");

        i.exibeFiguras();
        
        System.out.println("Exibindo Soma das áreas...\n");
        
        i.exibeSomaArea();
        
        System.out.println("Exibindo Apenas Quadrados...\n");
        
        i.exibeQuadrado();
        
        System.out.println("Exibindo Figuras com área maior que 20...\n");
        
        i.exibeFiguraAreaMaior20();
        
    }
    
}
