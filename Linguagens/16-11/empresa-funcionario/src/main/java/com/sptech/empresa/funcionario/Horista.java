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

public class Horista extends Funcionario{
    
    private Integer qtdHora;
    private Double valorHora;
    
    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora){
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }
    
    public Horista(){
        
    }

    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
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
