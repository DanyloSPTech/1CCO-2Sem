/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio01;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[]args){
        
        Double nota1, nota2;
        
        Scanner in = new Scanner(System.in);
        Nota nota = new Nota();
        Utilitario util = new Utilitario();
        
        util.pularLinha();
        System.out.println("Informe a primeira nota: ");
        nota1 = in.nextDouble();
        util.pularLinha();
        System.out.println("Informe a segunda nota: ");
        nota2 = in.nextDouble();
        util.pularLinha();
        System.out.printf("Nota média: %.2f", nota.calcularMedia(nota1, nota2));
        
    }
    
}
