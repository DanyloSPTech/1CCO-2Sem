/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exercicio.personagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public abstract class Personagem {

    private String codinome;
    private String nome;
    private List <SuperPoder> poderes;
    
    public Personagem(String codinome, String nome, List <SuperPoder> poderes){
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = poderes;
    }
    
    public Personagem(){
        poderes = new ArrayList();
    }
    
    public void adicionaPoder(String nome, Integer categoria){
        SuperPoder poder = new SuperPoder(nome, categoria);
        poderes.add(poder);
    }
    
    public abstract Double getForcaTotal();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Personagem:").append("\n");
        sb.append("Codinome: ").append(codinome).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("X-X".repeat(15)).append("\n");
        sb.append("Poderes:").append("\n");
        for(SuperPoder poder : poderes){
            sb.append("Poder: ").append(poder.getNome()).append("\n");
            sb.append("Categoria: ").append(poder.getCategoria()).append("\n");
            sb.append("-".repeat(30));
        }
        sb.append("X-X".repeat(15)).append("\n");
        
        return sb.toString();
    }
    
    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<SuperPoder> poderes) {
        this.poderes = poderes;
    }
    
}
