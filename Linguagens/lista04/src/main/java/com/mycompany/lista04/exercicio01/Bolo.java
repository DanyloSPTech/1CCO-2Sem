/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.exercicio01;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Bolo {

    private String sabor;
    private Double valor;
    private Integer quantidadeVendida;
    
    public Bolo(String sabor, Double valor){
        this.sabor = sabor;
        this.valor = valor;
        quantidadeVendida = 0;
    }
    
    public void comprarBolo(Integer quantidade){
        if(quantidade > 0 && quantidade <= 100){
            quantidadeVendida += quantidade;
        }else{
            if(quantidade > 100){
                System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            }else{
                System.out.println("Valor Inválido! Por favor informe um número válido.");
            }
        }
    }
    
    public void exibirRelatorio(){
        Double valorDia = valor * quantidadeVendida;
        System.out.printf("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f.", sabor, quantidadeVendida, valorDia);
    }
    
    public String getSabor(){
        return sabor;
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    
    public Double getValor(){
        return valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
