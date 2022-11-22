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

public class Vilao extends Personagem{
    
    public Vilao(String codinome, String nome, List <SuperPoder> poderes){
        super(codinome, nome, poderes);
    }

    @Override
    public Double getForcaTotal() {
        Double forcaTotal = 0.0;
        for(SuperPoder poder : super.getPoderes()){
            forcaTotal += poder.getCategoria();
        }
        return forcaTotal;
    }
    
}
