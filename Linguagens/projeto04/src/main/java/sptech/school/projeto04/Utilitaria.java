/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sptech.school.projeto04;

/**
 *
 * @author Danylo Dias Gomes
 */

public class Utilitaria {
    
    /*
        Assinatura do Método é composta por:
            - Tipo de retorno
            - Nome do método
            - Parametros (Parametros em Java = Argumentos)
    
            Método com void = método SEM retorno
    */
    void exibirLinha(){
        System.out.println("-".repeat(20));
    }
    
    void exibirNome(String nomeEnfeitado){
        System.out.printf("Xx===== %s =====xX\n", nomeEnfeitado);
    }
    
    void exibirNomeComLinha(String nomeEnfeitado){
        exibirLinha();
        exibirNome(nomeEnfeitado);
        exibirLinha();
    }
    
}
