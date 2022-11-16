/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtora.ator;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Ator {

    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;
    
    public Ator(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada){
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Ator(){
        
    }
    
    public Double getSalario(){
        return qtdHorasTrabalhadas * valorHoraTrabalhada;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nDados Ator:\n");
        sb.append("\nNome: ").append(this.nome).append("\n");
        sb.append("Valor da Hora Trabalhada: R$ ").append("%.2f").append(valorHoraTrabalhada).append("\n");
        sb.append("Quantidade de Horas Trabalhadas: ").append(qtdHorasTrabalhadas).append(" Horas\n");
        sb.append("Salário: R$ ").append("%.2f").append(getSalario());
        
        return sb.toString();
    }
    
}
