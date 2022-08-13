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

public class Elevador {
    
    public static void main(String[]args){
        
        Double limitePeso, peso1, peso2, peso3, pesoTotal;
        Integer limitePessoas;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Caculadora peso elavador");
        System.out.println("======================================");
        System.out.println("Informe o limite de peso do elevador: ");
        limitePeso = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Informe o limite de pessoas do elevador: ");
        limitePessoas = in.nextInt();
        System.out.println("======================================");
        System.out.println("Ok, agora informe o peso da 1º pessoa que entrou no elevador: ");
        peso1 = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Agora informe o peso da 2º pessoa que entrou no elevador: ");
        peso2 = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Por fim, informe o peso da 3º pessoa que entrou no elevador: ");
        peso3 = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Calculando...");
        pesoTotal = peso1 + peso2 + peso3;
        System.out.println("======================================");
        System.out.printf("Entraram 3 pessoas no elevador, no qual cabem %d pessoas\n", limitePessoas);
        System.out.printf("O peso total no elevador é de %.1f sendo que ele suporta %.1f", pesoTotal, limitePeso);
        
    }
    
}
