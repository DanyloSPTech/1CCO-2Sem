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

public class CalculadoraTroco {
    
    public static void main(String[]args){
        
        Double valorUni, valorPago, troco;
        Integer qtdeVendida;
        
        Scanner in = new Scanner(System.in);
 
        System.out.println("======================================");
        System.out.println("Calculadora de Troco");
        System.out.println("======================================");
        System.out.println("Informe o valor unitário do produto: ");
        valorUni = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Certo, agora informe a quantidade vendida desse produto: ");
        qtdeVendida = in.nextInt();
        System.out.println("======================================");
        System.out.println("Para finalizar, informe o valor pago pelo cliente: ");
        valorPago = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Calculando...");
        troco = valorPago - (valorUni * qtdeVendida);
        System.out.println("======================================");
        System.out.printf("Seu troco será de: R$ %.2f", troco);
        
    }
    
}
