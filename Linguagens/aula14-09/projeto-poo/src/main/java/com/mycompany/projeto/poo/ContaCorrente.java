/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author Danylo Dias Gomes
 */

public class ContaCorrente {
    
    // Atributos de Instância!, também existem atributos de classes
    private Double saldo;
    private String titular;
    private String numero;
    
    // Construtor
    public ContaCorrente(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }
    
    // Construtuor 'Default'
    public ContaCorrente(){
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double saldo) {
        if(saldo > 0){
            this.saldo += saldo;
        }
    }
    
    public void sacar(Double saldo) {
        if(saldo > 0 && saldo <= this.saldo){
            this.saldo -= saldo;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
