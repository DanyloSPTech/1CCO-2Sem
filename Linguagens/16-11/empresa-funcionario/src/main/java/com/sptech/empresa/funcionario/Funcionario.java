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

public abstract class Funcionario {

    private String cpf;
    private String nome;
    
    public Funcionario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public Funcionario(){
        
    }
    
    public abstract Double calcSalario();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Funcionario:").append("\n");
        sb.append("CPF: ").append(cpf).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Salario: ").append(calcSalario()).append("\n");
        
        return sb.toString();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
