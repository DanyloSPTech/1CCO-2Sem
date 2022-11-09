/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desenvolvedor.consultoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Consultoria {

    private String nome;
    private Integer vagas;
    private List <Desenvolvedor> desenvolvedores;
    
    public Consultoria(String nome, Integer vagas, List <Desenvolvedor> desenvolvedores){
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = desenvolvedores;
    }
    
    public Consultoria(){
        desenvolvedores = new ArrayList();
    }
    
    public Boolean existePorNome(String nome){
        Boolean existe = false;
        for(Desenvolvedor dev : desenvolvedores){
            if(dev.getNome().equalsIgnoreCase(nome)){
                existe = true;
            }
        }
        return existe;
    }
    
    public void contratar(Desenvolvedor d){
        if(vagas > 0){
            desenvolvedores.add(d);
            vagas--;
        }else{
            System.out.println("Sem vagas disponíveis!");
        }
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        Integer qtdeDevs = 0;
        for(Desenvolvedor dev : desenvolvedores){
            if(dev instanceof DesenvolvedorMobile){
                qtdeDevs++;
            }
        }
        return qtdeDevs;
    }
    
    public Double getTotalSalarios(){
        Double totalSalario = 0.0;
        for(Desenvolvedor dev : desenvolvedores){
            totalSalario += dev.getSalario();
        }
        return totalSalario;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        Desenvolvedor busca = new Desenvolvedor();
        for(Desenvolvedor dev: desenvolvedores){
            if(dev.getNome().equalsIgnoreCase(nome)){
                busca = dev;
            }
        }
        return busca;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Consultoria:").append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Vagas: ").append(vagas).append("\n");
//        sb.append("Desenvolvedores:").append("\n");
//        for(Desenvolvedor dev : desenvolvedores){
//            dev.toString();
//            sb.append("-----------------------").append("\n");
//        }
        
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
    
    
    
}
