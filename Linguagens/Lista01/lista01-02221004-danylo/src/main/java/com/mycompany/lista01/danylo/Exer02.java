/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01.danylo;

/**
 *
 * @author Danylo Dias Gomes
 */

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[]args){
        
        Integer filhosAte3, filhosAte16, filhosAte18, somaFilhos;
        Double valor;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Cálculo Valor Bolsa Filhos");
        System.out.println("======================================");
        System.out.println("Informe a quantidade de filhos de 0 a 3 anos: ");
        filhosAte3 = in.nextInt();
        System.out.println("======================================");
        System.out.println("Informe a quantidade de filhos de 4 a 16 anos: ");
        filhosAte16 = in.nextInt();
        System.out.println("======================================");
        System.out.println("Informe a quantidade de fihlos de 17 a 18 anos: ");
        filhosAte18 = in.nextInt();
        System.out.println("======================================");
        System.out.println("Calculando...");
        somaFilhos = filhosAte3 + filhosAte16 + filhosAte18;
        valor = (filhosAte3 * 25.12) + (filhosAte16 * 15.88) + (filhosAte18 * 12.44);
        System.out.println("======================================");
        System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa ", somaFilhos, valor);
    }
    
}
