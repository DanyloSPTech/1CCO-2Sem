/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.abstrato;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class AlunoAds extends Aluno{
    
    private Double notaContinuada;
    private Double notaIntegrada;
    
    public AlunoAds(String ra, String nome, Double notaContinuada, Double notaIntegrada){
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public Double getMedia() {
        return (notaContinuada + notaIntegrada) / 2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Aluno ADS:").append("\n");
        sb.append("Nome: ").append(super.getNome()).append("\n");
        sb.append("RA: ").append(super.getRa()).append("\n");
        sb.append("Nota Continuada: ").append(notaContinuada).append("\n");
        sb.append("Nota Integrada: ").append(notaIntegrada).append("\n");
        sb.append("Média: ").append(getMedia()).append("\n");
        
        return sb.toString();
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }
    
}
