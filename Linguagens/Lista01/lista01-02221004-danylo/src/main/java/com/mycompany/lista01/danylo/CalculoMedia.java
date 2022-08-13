/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01.danylo;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class CalculoMedia {
    
    public static void main(String[]args){
        
        String nome;
        Double nota1, nota2, media;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Cálculo Média");
        System.out.println("======================================");
        System.out.println("Informe seu nome: ");
        nome = in.nextLine();
        System.out.println("======================================");
        System.out.println("Agora informe sua 1º nota: ");
        nota1 = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Para finalziar, informe sua 2º nota: ");
        nota2 = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Calculando...");
        media = (nota1 + nota2) / 2;
        System.out.println("======================================");
        System.out.printf("Olá %s. Sua média foi de %.1f", nome, media);
        
    }
    
}
