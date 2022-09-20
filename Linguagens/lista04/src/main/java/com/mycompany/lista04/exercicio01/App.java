/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.exercicio01;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[]args){
        
        Bolo bolo1 = new Bolo("morango", 35.00);        
        Bolo bolo2 = new Bolo("abacaxi", 30.00);
        Bolo bolo3 = new Bolo("chocolate", 45.00);
        
        bolo1.comprarBolo(25);
        bolo2.comprarBolo(10);
        bolo3.comprarBolo(35);
        
        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();

    }
    
}
