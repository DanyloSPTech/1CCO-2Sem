/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class NovoLaco {

    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        
        List<String> filmes = new ArrayList<>();
        
        System.out.println("Digite um filme (01): ");
        filmes.add(in.nextLine());
        System.out.println("Digite um filme (02): ");
        filmes.add(in.nextLine());
        System.out.println("Digite um filme (03): ");
        filmes.add(in.nextLine());
        
        //For Aprimorado || Enhanced For
        for (String filme : filmes) {
            System.out.println("Filme: " + filme);
        }
        
        filmes.forEach(filmeAtual -> {
            System.out.println("Nome do Filme: " + filmeAtual);
            System.out.println("=".repeat(20));
        });
        
    }
    
}
