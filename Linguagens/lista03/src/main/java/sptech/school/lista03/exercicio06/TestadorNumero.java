/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio06;

/**
 *
 * @author Danylo Dias Gomes
 */

public class TestadorNumero {

    void verificarPrimo(Integer numero){
        
        Integer divisores = 0;
        
        for(int i = numero; i > 0; i--){
            if(numero % i == 0){
                divisores++;
            }
        }
        
        if(divisores > 2){
            System.out.printf("O Número %d não é um número primo!\n", numero);
        }else{
            System.out.printf("O Número %d é um número primo!\n", numero);
        }
        
    }
    
}
