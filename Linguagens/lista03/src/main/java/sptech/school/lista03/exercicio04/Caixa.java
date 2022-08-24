/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio04;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Caixa {

    Double calcularDesconto(Double valor, Integer quantidade){
        
        Double desconto;
        
        if(quantidade == 1){
            desconto = valor * 0.10;
            valor = valor - desconto;
        }else if(quantidade == 2){
            desconto = valor * 0.20;
            valor = (valor - desconto) * 2;
        }else if(quantidade >= 3){
            desconto = valor * 0.30;
            valor = (valor - desconto) * quantidade;
        }
        
        return valor;
    }
    
    String exibirNotaFiscal(Double valor, Integer quantidade, Double valorFinal){
        
       Utilitario util = new Utilitario();
       String notaFiscal = String.format("-".repeat(60) + "\nValor do Produto: R$%.2f\nQuantidade: %d\n" + "-".repeat(60) + "\nValor com desconto: %.2f", valor, quantidade, valorFinal);
       return notaFiscal;
       
    }
    
}
