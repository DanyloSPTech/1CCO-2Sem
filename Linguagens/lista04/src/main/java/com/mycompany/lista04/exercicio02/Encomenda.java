/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.exercicio02;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Encomenda {

    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;
    
    public Encomenda(String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda){
        setTamanho(tamanho);
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }
    
    public Double calcularFrete(){
        Double taxaTamanho = 0.0;
        Double taxaDistancia = 0.0;
        Double frete = 0.0;
        if(this.tamanho.equals("P")){
            taxaTamanho = (this.valorEncomenda * 1) / 100;
        }else if(this.tamanho.equals("M")){
            taxaTamanho = (this.valorEncomenda * 3) / 100;
        }else if(this.tamanho.equals("G")){
            taxaTamanho = (this.valorEncomenda * 5) / 100;
        }else{
            System.out.println("Tamanho da encomenda não foi informado!");
        }
        if(this.distancia <= 50){
            taxaDistancia = 3.00;
        }else if(this.distancia <= 200){
            taxaDistancia = 5.00;
        }else{
            taxaDistancia = 7.00;
        }
      
        frete = taxaDistancia + taxaTamanho;
        
        return frete;
    }
    
    public void emitirEtiquieta(){
        Double frete = calcularFrete();
        Double valorTotal = this.valorEncomenda + frete;
        String tamanho;
       
        if(this.tamanho.equals("P")){
            tamanho = "Pequeno";
        }else if(this.tamanho.equals("M")){
            tamanho = "Médio";
        }else if(this.tamanho.equals("G")){
            tamanho = "Grande";
        }else{
            tamanho = "Tamanho Inválido!";
        }
        
        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.printf("Endereço do remetente: %s\n", this.enderecoRemetente);
        System.out.printf("Endereço do destinatário: %s\n", this.enderecoDestinatario);
        System.out.printf("Tamanho: %s\n", tamanho);
        System.out.println("-".repeat(50));
        System.out.printf("Valor encomenda: R$ %.2f\n", this.valorEncomenda);
        System.out.printf("Valor frete: R$ %.2f\n", calcularFrete());
        System.out.println("-".repeat(50));
        System.out.printf("Valor total: R$ %.2f\n", this.valorEncomenda + calcularFrete());

    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        
        if(tamanho.equals("P")|| tamanho.equals("M") || tamanho.equals("G")){
            this.tamanho = tamanho;
        }else{
            System.out.println("Tamanho inválido! tamanhos válidos: P, M e G");
        }
        
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }
  
}
