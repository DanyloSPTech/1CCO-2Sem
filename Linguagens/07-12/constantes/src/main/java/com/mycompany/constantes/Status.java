/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constantes;

/**
 *
 * @author Danylo Dias Gomes
 */

public enum Status {
    ONLINE("Online", 120.00), OFFLINE("Offline", 60.00), AUSENTE("Ausente", 30.00);
    
    private final String nome;
    private final Double tempoMaximo;

    private Status(String nome, Double tempoMaximo) {
        this.nome = nome;
        this.tempoMaximo = tempoMaximo;
    }
    
    public static Status buscarPorTempoMaximo(Double tempoMax){
        for(Status status : Status.values()){
            if(status.getTempoMaximo().equals(tempoMax)){
                return status;
            }
        }
        throw new IllegalArgumentException("O tempo máximo " + tempoMax + " não existe em nenhum status!");
    }

    public String getNome() {
        return nome;
    }

    public Double getTempoMaximo() {
        return tempoMaximo;
    }
    
}
