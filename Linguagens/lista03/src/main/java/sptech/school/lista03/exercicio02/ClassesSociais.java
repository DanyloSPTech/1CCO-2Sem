/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio02;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class ClassesSociais {

    public static void main(String[]args){
        
        Double renda, salarios;
        
        Scanner in = new Scanner(System.in);
        Utilitario util = new Utilitario();
        CalculoClasses calc = new CalculoClasses();
        
        util.pularLinha();
        System.out.println("Informe a sua renda: \nR$ ");
        renda = in.nextDouble();
        util.pularLinha();
        salarios = calc.calcularSalariosMin(renda);
        System.out.printf("Você recebe aproximadamente %.1f salários mínimo\n", salarios);
        util.pularLinha();
        System.out.printf("Você pertence a classe social: %s", calc.descobrirClasse(salarios));
        util.pularLinha();
        
    }
    
}
