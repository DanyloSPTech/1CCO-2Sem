/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exercicio.personagem;

import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Heroi extends Personagem{
    
    public Heroi(String codinome, String nome, List <SuperPoder> poderes){
        super(codinome, nome, poderes);
    }
    
    public Heroi(){
        super();
    }

    @Override
    public Double getForcaTotal() {
        Double forca = 0.0;
        for(SuperPoder poder : super.getPoderes()){
            forca += poder.getCategoria();
        }
        forca += forca * 0.15;
        return forca;
    }
    
}
