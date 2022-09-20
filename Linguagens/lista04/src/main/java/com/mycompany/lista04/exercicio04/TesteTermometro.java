/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.exercicio04;

/**
 *
 * @author Danylo Dias Gomes
 */

public class TesteTermometro {

    public static void main(String[]args){
        
        Termometro termometro = new Termometro(19, 26, 9);
        System.out.printf("Temperatura atual: %d ºC\n", termometro.getTemperaturaAtual());
        System.out.println("=".repeat(50));
        termometro.aumentaTemperatura(5);
        System.out.printf("Temperatura atual: %d ºC\n", termometro.getTemperaturaAtual());
        System.out.println("=".repeat(50));
        termometro.aumentaTemperatura(6);
        System.out.printf("Temperatura atual: %d ºC\n", termometro.getTemperaturaAtual());
        System.out.println("=".repeat(50));
        termometro.diminuiTemperatura(12);
        System.out.printf("Temperatura atual: %d ºC\n", termometro.getTemperaturaAtual());
        System.out.println("=".repeat(50));
        termometro.diminuiTemperatura(10);
        System.out.printf("Temperatura atual: %d ºC\n", termometro.getTemperaturaAtual());
        System.out.println("=".repeat(50));
        termometro.exibeFahreinheit();

    }
    
}
