/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aluno.faculdade;

import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Faculdade {

    private String nome;
    private List <Aluno> alunos;
    
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void cancelarMatricular(String ra){
        for(Aluno aluno : alunos){
            if(aluno.getRa().equals(ra)){
                aluno.setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos(){
        for(Aluno aluno : alunos){
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("RA: " + aluno.getRa());
            System.out.println("Semestre: " + aluno.getSemestre());
            System.out.println("Status Matricula: " + aluno.getAtivo());
            System.out.println("=".repeat(20));
        }
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        for(Aluno aluno : alunos){
            if(aluno.getSemestre() == semestre){
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("RA: " + aluno.getRa());
                System.out.println("Semestre: " + aluno.getSemestre());
                System.out.println("Status Matricula: " + aluno.getAtivo());
                System.out.println("=".repeat(20));    
            }
        }
    }
    
    public void exibirCancelador(){
        for(Aluno aluno : alunos){
            if(!aluno.getAtivo()){
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("RA: " + aluno.getRa());
                System.out.println("Semestre: " + aluno.getSemestre());
                System.out.println("Status Matricula: " + aluno.getAtivo());
                System.out.println("=".repeat(20));    
            }
        }
    }
    
}
