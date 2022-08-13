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

public class Exer06 {

    public static void main(String[]args){
        
        Double salarioBruto, salarioLiquido;
        Double descINSS, descIR, descVT, totalDesc;
        Double gastoTransporte;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Caculadora de Salário Líquido Chicó");
        System.out.println("======================================");
        System.out.println("Informe seu salário bruto: ");
        salarioBruto = in.nextDouble();
        System.out.println("======================================");
        System.out.println("Calculando descontos...");
        descINSS = salarioBruto * 0.10;
        descIR = salarioBruto * 0.20;
        System.out.println("======================================");
        System.out.println("Ok, agora informe quanto custa a condução diária (apenas ida) para o trabalho");
        gastoTransporte = in.nextDouble();
        descVT = gastoTransporte * 2 * 22;
        System.out.println("======================================");
        System.out.println("Calculando salário líquido...");
        totalDesc = descINSS + descIR + descVT;
        salarioLiquido = salarioBruto - totalDesc;
        System.out.println("======================================");
        System.out.printf("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", salarioBruto, totalDesc, salarioLiquido);
        
    }
    
}
