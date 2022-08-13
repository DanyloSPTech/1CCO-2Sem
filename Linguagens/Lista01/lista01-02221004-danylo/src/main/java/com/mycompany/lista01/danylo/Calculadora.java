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

public class Calculadora {
    
    public static void main(String[]args){
        
        Double n1, n2, soma, subtracao, multiplicacao, divisao;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Calculadora");
        System.out.println("======================================");
        System.out.println("Informe um número real: ");
        n1 = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Ok, agora informe outro número real: ");
        n2 = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Calculando...");
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        System.out.println("======================================");
        System.out.printf("Resultado da soma: \n%.1f\n--------------------------------------\n", soma);
        System.out.printf("Resultado da subtração: \n%.1f\n--------------------------------------\n", subtracao);
        System.out.printf("Resultado da multiplicação: \n%.1f\n--------------------------------------\n", multiplicacao);
        System.out.printf("Resultado da divisão: \n%.1f\n", divisao);
        System.out.println("======================================");
        
    }
    
}
