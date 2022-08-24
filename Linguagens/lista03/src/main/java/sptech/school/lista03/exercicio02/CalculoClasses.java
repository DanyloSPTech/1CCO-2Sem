/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio02;

/**
 *
 * @author Danylo Dias Gomes
 */

public class CalculoClasses {

    Double calcularSalariosMin(Double renda){
        
        Double salarios = renda / 1045;
        return salarios;
        
    }
    
    String descobrirClasse(Double salarios){
        
        String classe;
        
        if(salarios < 2){
            classe = "E";
        }else if(salarios >= 2 && salarios < 4){
            classe = "D";
        }else if(salarios >= 4 && salarios < 10){
            classe = "C";
        }else if(salarios >= 10 && salarios < 20){
            classe = "B";
        }else{
            classe = "A";
        }
        
        return classe;
    }
    
}
