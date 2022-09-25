/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.exercicio02;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[]args){
        
        Encomenda mouse = new Encomenda("P", "Rua Santos da Glória, 18", "Av Dr. Pedro, 255", 70.0, 270.0);
        mouse.emitirEtiquieta();
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        Encomenda televisao = new Encomenda("G", "Rua Paulo Souza, 240", "Estrada dos Anjos, 122", 52.00, 1850.80);
        televisao.emitirEtiquieta();
        
    }
    
}
