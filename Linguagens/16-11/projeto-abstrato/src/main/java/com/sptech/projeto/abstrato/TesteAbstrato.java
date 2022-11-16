/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.abstrato;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class TesteAbstrato {
    
    public static void main(String[]args){
        
        AlunoAds alunoAds = new AlunoAds("01221027", "Marcos", 8.5, 7.8);
        AlunoCCO alunoCco = new AlunoCCO("02221004", "Danylo", 8.8, 7.5);
        
        Aluno teste = new AlunoAds("01231025", "Jonnas", 8.5, 6.5);
        Aluno teste2 = new AlunoCCO("01231015", "Vanessa", 7.8, 9.0);
        
        List <Aluno> alunos = new ArrayList();
        
        alunos.add(teste);
        alunos.add(teste2);
        alunos.add(alunoAds);
        alunos.add(alunoCco);

    }
    
}
