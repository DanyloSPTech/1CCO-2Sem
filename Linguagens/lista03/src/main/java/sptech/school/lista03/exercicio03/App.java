/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio03;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[]args){
        
        Integer idade;
        
        Scanner in = new Scanner(System.in);
        Utilitario util = new Utilitario();
        FaixaEtaria faixa = new FaixaEtaria();
        
        util.pularLinha();
        System.out.println("Informe sua idade: ");
        idade = in.nextInt();
        util.pularLinha();
        faixa.classificaIdade(idade);
        util.pularLinha();
    }
    
}
