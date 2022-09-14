/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class ExemploConstrutor {

    public static void main(String[]args){
        
        ContaCorrente conta = new ContaCorrente("Danylo", "#222");
        ContaCorrente contaDefault = new ContaCorrente();
    
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
        System.out.println("=".repeat(50));
        System.out.println(contaDefault.getNumero());
        System.out.println(contaDefault.getTitular());
        System.out.println(contaDefault.getSaldo());
        
    }
    
}
