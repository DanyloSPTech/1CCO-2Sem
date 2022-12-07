/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constantes;

/**
 *
 * @author Danylo Dias Gomes
 */

public class AppEnum {

    public static void main(String[] args) {
        System.out.println(Status.ONLINE.getNome() + " | " + Status.ONLINE.getTempoMaximo());        
        System.out.println(Status.OFFLINE.getNome() + " | " + Status.OFFLINE.getTempoMaximo());
        System.out.println(Status.AUSENTE.getNome() + " | " + Status.AUSENTE.getTempoMaximo());

        System.out.println(Status.valueOf("ONLINE"));
        
        for(Status status : Status.values()){
            System.out.println(status);
        }
        
        System.out.println(Status.buscarPorTempoMaximo(120.00));
        
    }
    
}
