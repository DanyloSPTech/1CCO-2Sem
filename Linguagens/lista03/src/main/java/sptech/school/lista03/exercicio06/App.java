/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio06;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[]args){
        
        Integer numeroUser = 0;
        
        Scanner in = new Scanner(System.in);
        Utilitario util = new Utilitario();
        TestadorNumero tester = new TestadorNumero();
        
        while(numeroUser >= 0){
            util.pularLinha();
            System.out.println("Informe um número: ");
            numeroUser = in.nextInt();
            util.pularLinha();
            tester.verificarPrimo(numeroUser);
            util.pularLinha();
        }
        
    }
    
}
