/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio05;

/**
 *
 * @author Danylo Dias Gomes
 */

public class PesoIdeal {

    void calculaPesoIdeal(String sexo, Double altura){
        
        Double pesoIdeal;
        
        if(sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
        }else if(sexo.equals("F")){
            pesoIdeal = (62.1 * altura) - 44.7;
        }else{
            System.out.println("Erro!");
            pesoIdeal = 0.0;
        }
        
        System.out.printf("Peso ideal: %.2fKG\n", pesoIdeal);
        
    }
    
}
