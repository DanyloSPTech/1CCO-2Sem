/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.lista03.exercicio03;

/**
 *
 * @author Danylo Dias Gomes
 */

public class FaixaEtaria {
    
    void classificaIdade(Integer idade){
        
        String faixa;
        
        if(idade >= 0 && idade <= 2){
            faixa = "Bebê";
        }else if(idade >= 3 && idade <= 11){
            faixa = "Criança";
        }else if(idade >= 12 && idade <= 19){
            faixa = "Adolescente";
        }else if(idade >= 20 && idade <= 30){
            faixa = "Jovem";
        }else if(idade >= 31 && idade <= 60){
            faixa = "Adulto";
        }else if(idade > 60){
            faixa = "Idoso";
        }else{
            faixa = "IDADE INVÁLIDA!";
        }
        
        System.out.println(faixa);
    }
    
}
