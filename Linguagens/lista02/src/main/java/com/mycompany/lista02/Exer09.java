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

public class Exer09 {
    
    public static void main(String[]args){
        
        Integer opcaoVoto, contadorVotos = 0;
        Integer votosMussarela = 0, votosCalabresa = 0, votosQuatroQueijos = 0;
        String saborVencedor = "";
        
        Scanner in = new Scanner(System.in);
        
        while(contadorVotos < 10){
            
            System.out.println("======================================");
            System.out.println("Vote no seu sabor favorito de pizza!");
            System.out.println("======================================");
            System.out.println("[5] - Voto Mussarela");
            System.out.println("[25] - Voto Calabresa");
            System.out.println("[50] - Voto Quatro Queijos");
            System.out.println("======================================");
            opcaoVoto = in.nextInt();
            if(opcaoVoto == 5){
                votosMussarela++;
                contadorVotos++;
            }else if(opcaoVoto == 25){
                votosCalabresa++;
                contadorVotos++;
            }else if(opcaoVoto == 50){
                votosQuatroQueijos++;
                contadorVotos++;
            }else{
                System.out.println("Informe uma opção de voto válida!");
            }
            
        }
        
        if(votosMussarela > votosCalabresa && votosMussarela > votosQuatroQueijos){
            saborVencedor = "Mussarela";
        }else if(votosCalabresa > votosMussarela && votosCalabresa > votosQuatroQueijos){
            saborVencedor = "Calabresa";
        }else if(votosQuatroQueijos > votosMussarela && votosQuatroQueijos > votosCalabresa){
            saborVencedor = "Quatro Queijos";
        }else{
            saborVencedor = "Empate!";
        }
        
        System.out.println("======================================");
        System.out.println("Resultado Final:\n");
        System.out.printf("Votos Mussarela: %d\n", votosMussarela);
        System.out.printf("Votos Calabresa: %d\n", votosCalabresa);
        System.out.printf("Votos Quatro Queijos: %d\n\n", votosQuatroQueijos);
        System.out.printf("Sabor Vencedor: %s\n", saborVencedor);
        System.out.println("======================================");

    }
    
}
