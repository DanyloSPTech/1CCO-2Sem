/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exercicio.personagem;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Confronto {

    public static void lutar(Heroi heroi, Vilao vilao){
        Double forcaHeroi = heroi.getForcaTotal();
        Double forcaVilao = vilao.getForcaTotal();
        
        if(forcaHeroi > forcaVilao){
            System.out.println("Vencedor Herói!\n" + heroi.toString());
        }else if(forcaVilao > forcaHeroi){
            System.out.println("Vencedor Vilão!\n" + vilao.toString());
        }else if(forcaHeroi == forcaVilao){
            System.out.println("Empate!");
        }else{
            System.out.println("Erro!");
        }
        
    }
    
}
