/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.empresa.funcionario;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Vendedor extends Funcionario{
    
    private Double vendas;
    private Double taxa;
    
    public Vendedor(String cpf, String nome, Double vendas, Double taxa){
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    public Vendedor(){
        
    }

    @Override
    public Double calcSalario() {
        return vendas * taxa / 100;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Funcionario:").append("\n");
        sb.append("CPF: ").append(super.getCpf()).append("\n");
        sb.append("Nome: ").append(super.getNome()).append("\n");
        sb.append("Salario: ").append(calcSalario()).append("\n");
        
        return sb.toString();
    }
    
}
