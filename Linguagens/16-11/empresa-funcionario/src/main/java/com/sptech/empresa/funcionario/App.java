/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.empresa.funcionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class App {

    public static void main(String[]args){
        
        Vendedor v1 = new Vendedor("50867711282", "Carlos", 5850.00, 18.00);
        Horista h1 = new Horista("42655844731", "André", 120, 25.00);
        
        List <Funcionario> funcionarios = new ArrayList();
        
        funcionarios.add(v1);
        
        Empresa e1 = new Empresa("BIFROST", funcionarios);
        
        e1.adicionarFunc(h1);
        
        System.out.println("X-X".repeat(25));
        
        e1.exibeTodos();
        
        System.out.println("X-X".repeat(25));

        e1.exibeTotalSalario();
        
        System.out.println("X-X".repeat(25));
        
        System.out.println(v1.toString());;
        
        System.out.println("X-X".repeat(25));
        
        System.out.println(h1.toString());
        
    }
    
}
