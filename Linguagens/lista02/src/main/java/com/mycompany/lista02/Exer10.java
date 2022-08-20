/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Exer10 {

    public static void main(String[]args){
        
        Integer base, expoente, resultado;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Calculando Potências");
        System.out.println("======================================");
        System.out.println("Informe o valor da base: ");
        base = in.nextInt();
        System.out.println("======================================");
        System.out.println("Agora informe o valor do expoente: ");
        expoente = in.nextInt();
        
        if(expoente == 0){
            resultado = 1;
        }else{
            resultado = base;
        }
        
        for(int i = 1; i < expoente; i++){
            resultado = resultado * base;
        }
        
        System.out.println("======================================");
        System.out.printf("Resultado da potência: %d\n", resultado);
        System.out.println("======================================");

    }
    
}
