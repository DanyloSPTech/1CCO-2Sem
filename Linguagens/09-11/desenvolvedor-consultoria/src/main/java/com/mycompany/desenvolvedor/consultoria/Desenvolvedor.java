/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desenvolvedor.consultoria;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Desenvolvedor {
    
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;
    
    public Desenvolvedor (String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada){
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Desenvolvedor(){
        
    }
    
    public Double getSalario(){
        Double salario = valorHoraTrabalhada * qtdHorasTrabalhadas;
        return salario;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Desenvolvedor:").append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Quantidade de Horas Trabalhadas: ").append(qtdHorasTrabalhadas).append("\n");
        sb.append("Valor da Hora Trabalhada: ").append(valorHoraTrabalhada).append("\n");
        sb.append("Salário: R$ ").append(String.format("%.2f", getSalario()));
        
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
}
