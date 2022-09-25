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

public class TesteFilme {

    public static void main(String[]args){
        
        Filme titanic = new Filme("Titanic", 1996, "James Cameron");
        
        System.out.println(titanic);
        
        System.out.println("=".repeat(30));
        System.out.println("=".repeat(30));
        System.out.println("=".repeat(30));

        
        System.out.println("Nome: " + titanic.getNome());;
        System.out.println("Ano: " + titanic.getAno());
        System.out.println("Diretor: " + titanic.getDiretor());
        
    }
    
}
