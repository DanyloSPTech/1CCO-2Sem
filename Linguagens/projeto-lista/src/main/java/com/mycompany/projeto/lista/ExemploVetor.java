/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.lista;

/**
 *
 * @author Danylo Dias Gomes
 */

public class ExemploVetor {

    public static void main(String[]args){
        
        String[] nomes = new String[3];
        Double[] notas = new Double[100];
        
        nomes[0] = "Danylo";
        nomes[1] = "Douglas";
        nomes[2] = "Marcos";
        
        for(int i = 0; i < nomes.length; i++){
            System.out.println(String.format("Indice: %d", i));
            System.out.println(String.format("Posição: %d", i + 1));
            System.out.println(String.format("Nome: %s", nomes[i]));
        }
        
    }
    
}
