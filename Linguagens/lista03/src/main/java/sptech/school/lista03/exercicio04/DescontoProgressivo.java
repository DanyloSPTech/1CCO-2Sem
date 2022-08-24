/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio04;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */
public class DescontoProgressivo {
    
    public static void main(String[]args){
        
        Double valor, valorFinal;
        Integer quantidade;
        String notaFiscal;
        
        Scanner in = new Scanner(System.in);
        Caixa caixa = new Caixa();
        
        System.out.println("Bem-Vindo ao Sistema de desconto progressivo!");
        System.out.println("Digite o valor unitário do produto: ");
        valor = in.nextDouble();
        System.out.println("Digite a quantidade: ");
        quantidade = in.nextInt();
        
        valorFinal = caixa.calcularDesconto(valor, quantidade);
        System.out.println(caixa.exibirNotaFiscal(valor, quantidade, valorFinal));
        
    }
    
}
