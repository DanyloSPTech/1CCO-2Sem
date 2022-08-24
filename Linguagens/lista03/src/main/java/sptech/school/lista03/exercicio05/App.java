/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio05;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[]args){
        
        String sexo;
        Double altura;
        
        Scanner in = new Scanner(System.in);
        Utilitario util = new Utilitario();
        PesoIdeal calc = new PesoIdeal();
        
        util.pularLinha();
        System.out.println("Informe o seu sexo:\n| M | -> Masculino\n| F | -> Feminino\n");
        sexo = in.nextLine();
        util.pularLinha();
        System.out.println("Agora informe sua altura: ");
        altura = in.nextDouble();
        util.pularLinha();
        calc.calculaPesoIdeal(sexo, altura);
        util.pularLinha();
        
    }
    
}
