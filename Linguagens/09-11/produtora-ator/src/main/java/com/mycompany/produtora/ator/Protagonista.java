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

public class Protagonista extends Ator{
   
    private Integer qtdHorasTrabalhadasProtagonista;
    private Double valorHorasTrabalhadaProtagonista;
    
    public Protagonista (String nome, Integer qtdHorasTrabalhadas, Double valorHorasTrabalhadas, Integer qtdHorasTrabalhadasProtagonista, Double valorHorasTrabalhadasProtagonista){
        super(nome, qtdHorasTrabalhadas, valorHorasTrabalhadas);
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
        this.valorHorasTrabalhadaProtagonista = valorHorasTrabalhadasProtagonista;
    }
    
    public Protagonista(){
        
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + qtdHorasTrabalhadasProtagonista * valorHorasTrabalhadaProtagonista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Desenvolvedor Mobile:").append("\n");
        sb.append("\nNome: ").append(super.nome).append("\n");
        sb.append("Quantidade Horas Trabalhadas: ").append(super.qtdHorasTrabalhadas).append("\n");
        sb.append("Valor da Hora Trabalhada: ").append(super.valorHoraTrabalhada).append("\n");
        sb.append("Quantidade Horas Trabalhadas Protagonista: ").append(qtdHorasTrabalhadasProtagonista).append("\n");
        sb.append("Valor da Hora Trabalhada Protagonista: ").append(valorHorasTrabalhadaProtagonista).append("\n");
        sb.append("Salário: R$ ").append(String.format("%.2f", getSalario()));
        
        return sb.toString();
        
    }

    public Integer getQtdHorasTrabalhadasProtagonista() {
        return qtdHorasTrabalhadasProtagonista;
    }

    public void setQtdHorasTrabalhadasProtagonista(Integer qtdHorasTrabalhadasProtagonista) {
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
    }

    public Double getValorHorasTrabalhadaProtagonista() {
        return valorHorasTrabalhadaProtagonista;
    }

    public void setValorHorasTrabalhadaProtagonista(Double valorHorasTrabalhadaProtagonista) {
        this.valorHorasTrabalhadaProtagonista = valorHorasTrabalhadaProtagonista;
    }
    
}
