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

public class AlunoCCO extends Aluno{

    private Double notaIntegrada;
    private Double notaMonografia;
    
    public AlunoCCO(String ra, String nome, Double notaIntegrada, Double notaMonografia){
        super(ra, nome);
        this.notaIntegrada = notaIntegrada;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double getMedia() {
        return (notaIntegrada * 0.4) + (notaMonografia * 0.6);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Aluno ADS:").append("\n");
        sb.append("Nome: ").append(super.getNome()).append("\n");
        sb.append("RA: ").append(super.getRa()).append("\n");
        sb.append("Nota Monografia: ").append(notaMonografia).append("\n");
        sb.append("Nota Integrada: ").append(notaIntegrada).append("\n");
        sb.append("Média: ").append(getMedia()).append("\n");
        
        return sb.toString();
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }
    
}
