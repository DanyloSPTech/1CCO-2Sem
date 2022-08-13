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

public class Idade {
    
    public static void main(String[]args){
        
        String nome;
        Integer anoNasc, idade;
        
        Scanner inString = new Scanner(System.in);
        Scanner inInteger = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Idade em 2030");
        System.out.println("======================================");
        System.out.println("Qual é o seu nome?");
        nome = inString.nextLine();
        System.out.println("======================================");
        System.out.println(String.format("Olá, %s. Qual o ano de seu nascimento?", nome));
        anoNasc = inInteger.nextInt();
        System.out.println("======================================");
        idade = 2030 - anoNasc;
        System.out.printf("Em 2030 você terá %d anos.", idade);
        
    }
    
}
