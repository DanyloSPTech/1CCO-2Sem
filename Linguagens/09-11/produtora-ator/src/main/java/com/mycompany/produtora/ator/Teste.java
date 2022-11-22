/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtora.ator;

import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Teste {

    public static void main(String[]args){
        
        Ator a1 = new Ator("Dwayne Johnson", 180, 120.00);
        Ator a2 = new Ator("Nicolas Cage", 145, 130.00);
        Protagonista p1 = new Protagonista("Leonardo DiCaprio", 130, 110.00, 50, 180.00);
        
        List <Ator> atores = new ArrayList();
        
        atores.add(a1);
        atores.add(p1);
        
        Produtora p = new Produtora("Bifrost", 3, atores);
        
        System.out.println("Quantidade de atores: " + p.getQuantidadeAtores());
        System.out.println("Quantidade de protagonistas: " + p.getQuantidadeProtagonistas());
        System.out.println("Contratando ator...");
        p.contratar(a2);
        System.out.println("Quantidade de atores: " + p.getQuantidadeAtores());
        System.out.println("Quantidade de protagonistas: " + p.getQuantidadeProtagonistas());
        System.out.println("Ator Nicolas Cage Existe? -> " + p.existePorNome("Nicolas Cage"));
        System.out.println("Total dos salários: " + p.getTotalSalarios());
        System.out.println("Buscando ator pelo nome... (Dwayne Johnson)");
        Ator busca = p.buscarAtorPorNome("Dwayne Johnson");
        if(busca != null){
            System.out.println("Nome: " + busca.getNome());
            System.out.println("Quantidade de Horas Trabalhadas: " + busca.getQtdHorasTrabalhadas());
            System.out.println("Valor da hora Trabalhada: " + busca.getValorHoraTrabalhada());
        }
        
    }
    
}
