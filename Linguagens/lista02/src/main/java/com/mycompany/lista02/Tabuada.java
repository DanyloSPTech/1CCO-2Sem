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

public class Tabuada {
    
    public static void main(String[]args){
        
        Integer numeroUsuario;
        
        Scanner in = new Scanner(System.in);
               
        System.out.println("Digite um número:");
        numeroUsuario = in.nextInt();
        System.out.printf("Tabuada do %d:\n\n", numeroUsuario);
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", numeroUsuario, i, numeroUsuario*i);
        }
    }
    
}
