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

public class Loteria {

    public static void main(String[]args){
        
        Integer numeroUsuario, numeroLoteria, i = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o número desejado: ");
        numeroUsuario = in.nextInt();
        
        do{
            numeroLoteria = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.printf("Número sorteado: %d\n", numeroLoteria);
            i++;
        }while(numeroLoteria != numeroUsuario);
        
        System.out.println("Número SORTEADO!!!!!!!!");
        
        if(i <= 3){
            System.out.println("Você é muito sortudo!");
        }else if(i >=4 && i <= 10){
            System.out.println("Você é sortudo");
        }else if(i > 10){
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }else{
            System.out.println("ERRO");
        }
        
    }
    
}
