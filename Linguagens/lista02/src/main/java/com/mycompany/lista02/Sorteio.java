/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Sorteio {

    public static void main(String[]args){
        
        Integer numeroUsuario, numeroSorteio;
        Integer primeiroSorteio = 201, pares = 0, impares = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe um número de 1 a 100: ");
        numeroUsuario = in.nextInt();
        for(int i = 0; i < 200; i++){
            numeroSorteio = ThreadLocalRandom.current().nextInt(1, 101);
            if(numeroSorteio == numeroUsuario && i < primeiroSorteio){
                primeiroSorteio = i;
            }
            if(numeroSorteio % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        if(primeiroSorteio == 201){
            System.out.println("Número não foi sorteado!");
        }else{
            System.out.printf("Número sorteado pela primeira vez no sorteio: %d\n", primeiroSorteio);
        }
        System.out.printf("Quantidade números pares: %d\n", pares);
        System.out.printf("Quantidade números pares: %d\n", impares);
        
    }
    
}
