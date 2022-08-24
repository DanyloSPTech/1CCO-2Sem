/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.projeto04;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class App {

    public static void main(String[]args){
        
        Integer numero1, numero2, numero3;
        Double numeroDouble1, numeroDouble2;
        String nome, sobrenome;
        
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Infome o seu nome: ");
        nome = in.nextLine();
        util.exibirLinha();
        System.out.println("Agora informe o sobrenome: ");
        sobrenome = in.nextLine();
        
        /*
        util.exibirLinha();
        util.exibirNome(nome);
        util.exibirLinha();
        util.exibirNome(sobrenome);
        util.exibirLinha();
        */
        
        util.exibirNomeComLinha(nome);
        util.exibirNomeComLinha(sobrenome);
        
        util.exibirLinha();
        System.out.println("Digite um número: ");
        numero1 = in.nextInt();
        util.exibirLinha();
        System.out.println("Digite outro número: ");
        numero2 = in.nextInt();
        util.exibirLinha();
        System.out.println("Para finalizar, digite outro número: ");
        numero3 = in.nextInt();
        System.out.println("Agora digite um decimal: ");
        numeroDouble1 = in.nextDouble();
        util.exibirLinha();
        System.out.println("Digite outro decimal: ");
        numeroDouble2 = in.nextDouble();
        util.exibirLinha();
        
        /*
        util.exibirLinha();
        calc.somar(numero1, numero2);
        util.exibirLinha();
        */
        
        Integer resultado = calc.somar(numero1, numero2);
        Double resultadoDouble = calc.somar(numeroDouble1, numeroDouble2);
        Integer resultado3 = calc.somar(numero1, numero2, numero3);
        
        util.exibirLinha();
        System.out.printf("%d + %d = %d\n", numero1, numero2, resultado);
        util.exibirLinha();
        System.out.printf("%.2f + %.2f = %.2f\n", numeroDouble1, numeroDouble2, resultadoDouble);
        util.exibirLinha();
        System.out.printf("%d + %d + %d = %d\n", numero1, numero2, numero3, resultado3);
        util.exibirLinha();
        
    }
    
}
