/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aluno.faculdade;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Aluno {

    private String ra;
    private String nome;
    private Integer semestre;
    private Boolean ativo;
    
    // Gerar RA automático?
    public Aluno(String ra, String nome, Integer semestre, Boolean ativo){
        this.ra = ra;
        this.nome = nome;
        this.semestre = semestre;
        this.ativo = ativo;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
}
