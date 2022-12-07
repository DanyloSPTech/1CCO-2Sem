/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constantes;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[] args) {
        
        PontosCardeais pc = new PontosCardeais();
        PontosCardeais pc2 = new PontosCardeais();

        Scanner in = new Scanner(System.in);
        
        System.out.println("Escolha uma direção:\nN - Norte\nS - Sul\nL - Leste\nO - Oeste");
        String direcao = in.nextLine();
        
        switch(direcao) {
            
            case "N":
                System.out.println("Estou indo para o " + PontosCardeais.NORTE);
                break;
            case "L":
                System.out.println("Estou indo para o " + PontosCardeais.LESTE);
                break;
            case "O":
                System.out.println("Estou indo para o " + PontosCardeais.OESTE);
                break;
            default:
                System.out.println("Não lembro do resto!");
                break;
        }
        
    }
    
}
