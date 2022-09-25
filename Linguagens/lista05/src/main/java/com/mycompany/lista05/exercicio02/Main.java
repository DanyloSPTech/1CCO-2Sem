/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Main {
    
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        List <Integer> listaNumeros = new ArrayList();
        
        Integer numeroUsuario = 0;
        Integer soma = 0;
        
        System.out.println("=X=".repeat(10));
        System.out.println("Bem vindo ao leitor de números!");
        System.out.println("Lembre-se, caso deseje sair do programa, INFORME O NÚMERO 0");
        
        do{
            
            System.out.println("Informe um número inteiro para ser inserido em nossa lista: ");
            numeroUsuario = in.nextInt();
            if(numeroUsuario != 0){
                listaNumeros.add(numeroUsuario);
            }
            System.out.println("=X=".repeat(10));

        }while(numeroUsuario != 0);
        
        System.out.println("=X=".repeat(10));
        System.out.println("Números Pares: ");
        for(int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) % 2 == 0){
                System.out.println(listaNumeros.get(i));
            }
        }
        System.out.println("=X=".repeat(10));
        System.out.println("Números Ímpares: ");
        for(int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) % 2 != 0){
                System.out.println(listaNumeros.get(i));
            }
        }
        System.out.println("=X=".repeat(10));
        System.out.println("Soma dos números: ");
        for(int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) % 2 != 0){
                soma += listaNumeros.get(i);
            }
        }
        System.out.println(soma);
        System.out.println("=X=".repeat(10));
        System.out.println("Menor número da lista: ");
        Integer menorNumero = listaNumeros.get(0);
        for(int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) < menorNumero){
                menorNumero = listaNumeros.get(i);
            }
        }
        System.out.println(menorNumero);
        System.out.println("=X=".repeat(10));
        System.out.println("Maior número da lista: ");
        Integer maiorNumero = listaNumeros.get(0);
        for(int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) > maiorNumero){
                maiorNumero = listaNumeros.get(i);
            }
        }
        System.out.println(maiorNumero);
        System.out.println("=X=".repeat(10));
        
    }
    
}
