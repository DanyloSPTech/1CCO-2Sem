/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01.danylo;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 */

public class CadastroUsuario {

    public static void main(String[]args){
        
        String login, senha;
        Integer tentativas;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Bem-Vindo ao Cadastro de novos usuários");
        System.out.println("======================================");
        System.out.println("Informe o login que você deseja cadastrar para sua conta: ");
        login = in.nextLine();
        System.out.println("======================================");
        System.out.println("Ok!, agora informe a senha que você deseja cadastrar para sua conta: ");
        senha = in.nextLine();
        System.out.println("======================================");
        System.out.println("Para finalizar, informe quantas tentativas você terá antes de sua conta ser bloqueada: ");
        tentativas = in.nextInt();
        System.out.println("======================================");
        System.out.printf("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado.", login, senha, tentativas);
        
    }
    
}