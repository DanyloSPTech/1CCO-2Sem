/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.empresa.funcionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Empresa {
    
    private String nome;
    private List <Funcionario> funcionarios;
    
    public Empresa(String nome, List<Funcionario> funcionarios){
        this.nome = nome;
        this.funcionarios = funcionarios;
    }
    
    public void adicionarFunc(Funcionario f){
        funcionarios.add(f);
    }
    
    public void exibeTodos(){
        System.out.println("Funcionários:");
        for(Funcionario funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.getNome());
        }
    }
    
    public void exibeTotalSalario(){
        Double totalSalario = 0.0;
        for(Funcionario funcionario : funcionarios){
            totalSalario += funcionario.calcSalario();
        }
        System.out.println("Total Salário: " + totalSalario);
    }
    
}
