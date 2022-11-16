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

public class Teste {

    public static void main(String[]args){
        
        Desenvolvedor dev1 = new Desenvolvedor("Douglas Adão", 96, 2.60);
        DesenvolvedorMobile dev2 = new DesenvolvedorMobile("David Almeida", 40, 2.20, 120, 3.50);
        Desenvolvedor dev3 = new Desenvolvedor("Marcos Henrique", 150, 3.00);
        
        dev1.toString();
        dev2.toString();
        dev3.toString();
        
        List <Desenvolvedor> devsBifrost = new ArrayList();
        
        devsBifrost.add(dev1);
        devsBifrost.add(dev3);
        
        Consultoria consultoria = new Consultoria("BIFROST", 1, devsBifrost);
        
//        consultoria.toString();
        
        System.out.println("-x-".repeat(25));
        
        Desenvolvedor busca = consultoria.buscarDesenvolvedorPorNome("Douglas Adão");
        busca.toString();
        
        System.out.println("-x-".repeat(25));
        
        System.out.println("Desenvolvedor Marcos Henrique Existe?" + consultoria.existePorNome("Marcos Henrique"));
        
        System.out.println("-x-".repeat(25));
        
        System.out.println("Quantidade de Desenvolvedores: " + consultoria.getQuantidadeDesenvolvedores());
        
        System.out.println("-x-".repeat(25));
        
        System.out.println("Quantidae de Desenvolvedores Mobile: " + consultoria.getQuantidadeDesenvolvedoresMobile());
        
        System.out.println("-x-".repeat(25));
        
        System.out.println("Total Salários: " + consultoria.getTotalSalarios());
        
        System.out.println("-x-".repeat(25));
                
        System.out.println("Buscando dados do desenvolvedor Douglas Adão: " + consultoria.buscarDesenvolvedorPorNome("Douglas Adão").toString());
        
        System.out.println("-x-".repeat(25));
        
        System.out.println("Adicionando Novo Dev A Consultoria");
        
        consultoria.contratar(dev2);
        
        System.out.println("-x-".repeat(25));

        Desenvolvedor devSobre = new Desenvolvedor("Danylo Dias", 180, 1.50);
        
        System.out.println("Adicionando Novo Dev A Consultoria Novamente");
        
        System.out.println("-x-".repeat(25));

        consultoria.contratar(devSobre);

        System.out.println("Quantidade de Desenvolvedores: " + consultoria.getQuantidadeDesenvolvedores());
        
        System.out.println("-x-".repeat(25));
        
        System.out.println("Quantidae de Desenvolvedores Mobile: " + consultoria.getQuantidadeDesenvolvedoresMobile());
        
        System.out.println("-x-".repeat(25));
        
        System.out.println("Resultado Final:");
        
        System.out.println(consultoria.toString());
        
        System.out.println("-x-".repeat(25));
        
    }
    
}
