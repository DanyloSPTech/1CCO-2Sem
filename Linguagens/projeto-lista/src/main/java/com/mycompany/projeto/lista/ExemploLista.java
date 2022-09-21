/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 */

public class ExemploLista {

    public static void main(String[]args){
        
        List lista = new ArrayList();
        
        lista.add("Danylo");
        lista.add(19);
        lista.add(1.74);
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
            System.out.println("-".repeat(20));
        }
        
        // Tipo Genérico || Generic Type
        List <String> nomes = new ArrayList();
        
        nomes.add("Danylo");
        nomes.add("Rodrigues");
        nomes.add("Salazar");
        
        for(int i = 0; i < nomes.size(); i ++){
            System.out.println(String.format("Nome: %s", nomes.get(i)));
        }
        
        System.out.println("-".repeat(30));
        
        nomes.add(0, "Marise");
        
        for(int i = 0; i < nomes.size(); i ++){
            System.out.println(String.format("Nome: %s", nomes.get(i)));
        }
        
        System.out.println("-".repeat(30));

        
        nomes.set(0, "Oswaldo");
        
        for(int i = 0; i < nomes.size(); i ++){
            System.out.println(String.format("Nome: %s", nomes.get(i)));
        }
        
        nomes.clear();
        
        for(int i = 0; i < nomes.size(); i++){
            System.out.println("Apocalipse: " + i);
        }
        
        if(nomes.isEmpty()){
            System.out.println("Vazia");
        }else{
            System.out.println("Não Vazia");
        }
     
        
    }
    
}
