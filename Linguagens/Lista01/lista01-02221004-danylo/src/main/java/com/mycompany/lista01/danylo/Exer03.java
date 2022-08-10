/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01.danylo;

/**
 *
 * @author Danylo Dias Gomes
 */

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[]args){
        
        Integer minAquecendo, minAerobicos, minMusculacao, perdaCal, tempoExercicio;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("Cálculo Calorias do Chicó");
        System.out.println("======================================");
        System.out.println("Informe quantos minutos você passou se aquecendo: ");
        minAquecendo = in.nextInt();
        System.out.println("======================================");
        System.out.println("Ok, Agora informe quantos minutos você fez de exercícios aeróbicos: ");
        minAerobicos = in.nextInt();
        System.out.println("======================================");
        System.out.println("E para finalizar, informe quantos minutos você fez de exercícios de musculação: ");
        minMusculacao = in.nextInt();
        System.out.println("======================================");
        System.out.println("Calculando...");
        tempoExercicio = minAquecendo + minAerobicos + minMusculacao;
        perdaCal = (minAquecendo * 12) + (minAerobicos * 20) + (minMusculacao * 25);
        System.out.println("======================================");
        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.", tempoExercicio, perdaCal);
    }
    
}
