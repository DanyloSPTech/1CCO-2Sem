/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Exer05 {

    public static void main(String[]args){
        
        String login = "", senha = "";
        
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Informe o login: ");
            login = in.nextLine();
            System.out.println("Informe a senha: ");
            senha = in.nextLine();
            if(!login.equals("admin") || !senha.equals("#SPtech2022")){
                System.out.println("Login e/ou senha inválidos” e solicite novamente.");
            }
        }while(!login.equals("admin") || !senha.equals("#SPtech2022"));
        System.out.println("Login realizado com sucesso");
    }

}
