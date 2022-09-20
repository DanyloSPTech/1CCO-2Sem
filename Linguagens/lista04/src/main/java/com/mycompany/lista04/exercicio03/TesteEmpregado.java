/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.exercicio03;

/**
 *
 * @author Danylo Dias Gomes
 */

public class TesteEmpregado {

    public static void main(String[]args){
        
        Empregado joao = new Empregado("João", "Analista de Sistemas", 5400.00);
        joao.reajustarSalario(15);
        System.out.println("=".repeat(50));
        System.out.printf("Nome: %s\n", joao.getNome());
        System.out.printf("Cargo: %s\n", joao.getCargo());
        System.out.printf("Salário: %.2f\n", joao.getSalario());
        System.out.println("=".repeat(50));
        Empregado douglas = new Empregado("Douglas", "Desenvolvedor Web", 2800.00);
        douglas.reajustarSalario(10);
        System.out.println("=".repeat(50));
        System.out.printf("Nome: %s\n", douglas.getNome());
        System.out.printf("Cargo: %s\n", douglas.getCargo());
        System.out.printf("Salário: %.2f\n", douglas.getSalario());
        System.out.println("=".repeat(50));
        
    }
    
}
