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

public class DesenvolvedorMobile extends Desenvolvedor{
    
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhadasMobile;
    
    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas, Double valorHorasTrabalhadas, Integer qtdHorasTrabalhadasMobile, Double valorHorasTrabalhadasMobile){
        super(nome, qtdHorasTrabalhadas, valorHorasTrabalhadas);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }
    
    public DesenvolvedorMobile(){
        
    }
    
    @Override
    public Double getSalario(){
        return super.getSalario() + valorHorasTrabalhadasMobile * qtdHorasTrabalhadasMobile;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Desenvolvedor Mobile:").append("\n");
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Quantidade Horas Trabalhadas: ").append(getQtdHorasTrabalhadas()).append("\n");
        sb.append("Valor da Hora Trabalhada: ").append(getValorHoraTrabalhada()).append("\n");
        sb.append("Quantidade Horas Trabalhadas Mobile: ").append(qtdHorasTrabalhadasMobile).append("\n");
        sb.append("Valor da Hora Trabalhada Mobile: ").append(valorHorasTrabalhadasMobile).append("\n");
        sb.append("Salário: R$ ").append(String.format("%.2f", getSalario()));
        
        return sb.toString();
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHorasTrabalhadasMobile() {
        return valorHorasTrabalhadasMobile;
    }

    public void setValorHorasTrabalhadasMobile(Double valorHorasTrabalhadasMobile) {
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }
    
}
