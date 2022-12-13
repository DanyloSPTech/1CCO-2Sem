package com.mycompany.exerciciopedido;

import java.util.Scanner;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class App {

    public static void main(String[]args) throws InterruptedException{
        
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        sb.append("X").append("-".repeat(15)).append("X").append(" Montando 5 Lanches ").append("X").append("-".repeat(15)).append("X").append("\n").append("\n");
        
        for(Integer i = 1; i <= 5; i++){
            sb.append("\n").append("-".repeat(10)).append(String.format(" Fazendo o pedido de número: %d ", i)).append("-".repeat(10));
            sb.append("-".repeat(35)).append("\n");
            sb.append(" Selecione um Lanche: ").append("\n");
            System.out.println(sb.toString());
            Lanche.mostrarOpcoes();
            Integer opcaoLanche = in.nextInt();
            Lanche lanche = Lanche.buscarPorId(opcaoLanche);
            sb.setLength(0);
            sb.append("-".repeat(35)).append("\n");
            sb.append(" Selecione uma Bebida: ").append("\n");
            System.out.println(sb.toString());
            Bebida.mostrarOpcoes();
            Integer opcaoBebida = in.nextInt();
            Bebida bebida = Bebida.buscarPorId(opcaoBebida);
            sb.setLength(0);
            sb.append("-".repeat(35)).append("\n");
            sb.append(" Selecione um Acompanhamento: ").append("\n");
            System.out.println(sb.toString());
            Acompanhamento.mostrarOpcoes();
            Integer opcaoAcompanhamento = in.nextInt();
            sb.setLength(0);
            Acompanhamento acompanhamento = Acompanhamento.buscarPorId(opcaoAcompanhamento);
            Pedido pedido = new Pedido(lanche, bebida, acompanhamento);
            System.out.println(String.format("\nValor total do lanche: R$ %.2f", pedido.getTotal()));
            Thread.sleep(5000);
            sb.setLength(0);
        }
        
    }
    
}
