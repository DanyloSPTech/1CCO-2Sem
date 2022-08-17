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

public class Acumulador {

    public static void main(String[]args){
        
        Integer numerosSomados = 0, numeroUsuario;
        
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Informe um número: ");
            numeroUsuario = in.nextInt();
            numerosSomados += numeroUsuario;
        }while(numeroUsuario != 0);
        System.out.printf("Soma dos números informados: %d", numerosSomados);
        
    }
    
}
