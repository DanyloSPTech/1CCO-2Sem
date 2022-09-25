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
        setSabor(sabor);
        setValor(valor);
        quantidadeVendida = 0;
    }
    
    public Bolo(){
        
    }
    
    public void comprarBolo(Integer quantidade){
        if(valor == null || sabor == null || quantidadeVendida == null){
            System.out.println("Impossível comprar bolo, algum atributo está inválido!");
        }else{
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
        
    }
    
    public void exibirRelatorio(){
        Double valorDia = valor * quantidadeVendida;
        System.out.printf("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f.\n", sabor, quantidadeVendida, valorDia);
    }
    
    public String getSabor(){
        return sabor;
    }
    
    public void setSabor(String sabor){
        if(sabor.equals("chocolate") || sabor.equals("morango") || sabor.equals("abacaxi")){
            this.sabor = sabor;
        }else{
            System.out.println("Sabor inválido! sabores válidos: chocolate, morango e abacaxi");
        }
    }
    
    public Double getValor(){
        return valor;
    }
    
    public void setValor(Double valor) {
        if(valor >= 30.00 && valor <= 50.00){
            this.valor = valor;
        }else{
            System.out.println("Valor inválido! informe um valor entre R$ 30.00 e R$ 50.00");
        }
    }
    
}
