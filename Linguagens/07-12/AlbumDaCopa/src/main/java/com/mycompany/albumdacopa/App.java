package com.mycompany.albumdacopa;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class App {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Album album = new Album();
        
        Boolean execucao = true;
        
        while(execucao){
            StringBuilder sb = new StringBuilder();
            String espaco = "-".repeat(15);
            sb.append("X").append(espaco).append("X").append(" Album Copa ").append("X").append(espaco).append("X").append("\n");
            sb.append("\n");
            sb.append("Total de Figurinhas: ").append(album.getFigurinhas().size()).append("\n");        
            sb.append("Total de Lendárias: ").append(album.contagemDeFigurinhasPorTipo(TipoRaridadeEnum.LENDARIA)).append("\n");
            sb.append("Total de Míticas: ").append(album.contagemDeFigurinhasPorTipo(TipoRaridadeEnum.MITICA)).append("\n");
            sb.append("Total de Raras: ").append(album.contagemDeFigurinhasPorTipo(TipoRaridadeEnum.RARA)).append("\n");
            sb.append("Total de Comuns: ").append(album.contagemDeFigurinhasPorTipo(TipoRaridadeEnum.COMUM)).append("\n");
            sb.append("\n");
            sb.append("\n").append("X").append(espaco).append("X").append(" Menu ").append("X").append(espaco).append("X").append("\n");
            sb.append("\n");
            sb.append("Selecione uma opção:").append("\n");
            sb.append("1 - Exibir figurinhas atuais").append("\n");
            sb.append("2 - Adicionar uma figurinha").append("\n");
            sb.append("3 - Abrir pacote").append("\n");
            sb.append("4 - Exbir valor de revenda do album").append("\n");
            sb.append("5 - Exibir valor de revenda do album por tipo").append("\n");
            sb.append("0 - Sair").append("\n").append("\n");

            System.out.println(sb.toString());

            Integer opcaoUsuario = in.nextInt();
            
            switch(opcaoUsuario){
                case 0:
                    System.out.println("Saindo...");
                    execucao = false;
                    break;
                case 1:
                    StringBuilder opcao1 = new StringBuilder();
                
                    opcao1.append("X").append(espaco).append(" Figurinhas do Album: ").append(espaco).append("X").append("\n");
                    for(Figurinha figurinha : album.getFigurinhas()){
                        opcao1.append("\n");
                        opcao1.append("Nome: ").append(figurinha.getNomeJogador()).append("\n");
                        opcao1.append("Raridade: ").append(figurinha.getRaridadeEnum()).append("\n");
                        opcao1.append("\n");
                        System.out.println(opcao1.toString());
                    }
                    
                    break;
                case 2:
                    Figurinha figurinha = new Figurinha();
                    album.adicionarFigurinhas(figurinha);
                    break;
                case 3:
                    PacoteFigurinha pacote = new PacoteFigurinha(4);
                    album.adicionarFigurinhas(pacote.abrirPacote());
                    break;
                case 4:
                    StringBuilder opcao4 = new StringBuilder();
                    opcao4.append("\n");
                    opcao4.append("X").append(espaco).append("X").append(" Valor de Revenda do Album: ").append("X").append(espaco).append("X").append("\n");
                    opcao4.append("X").append(espaco).append("X").append(" R$ ").append(String.format("%.2f ", album.valorTotalFigurinhas())).append("X").append(espaco).append("X").append("\n");
                    opcao4.append("\n");
                    System.out.println(opcao4.toString());
                    break;
                case 5:
                    StringBuilder opcao5 = new StringBuilder();
                    opcao5.append("\n");
                    opcao5.append("X").append(espaco).append("X").append(" Busca ").append("X").append(espaco).append("X");
                    opcao5.append("\n");
                    opcao5.append("Escolha uma raridade:").append("\n");
                    opcao5.append("1 - Lendária").append("\n");
                    opcao5.append("2 - Mítica").append("\n");
                    opcao5.append("3 - Rara").append("\n");
                    opcao5.append("4 - Comum").append("\n");
                    opcao5.append("\n");
                    System.out.println(opcao5.toString());
                    Integer opcaoUser2 = in.nextInt();
                    switch(opcaoUser2){
                        case 1:
                            StringBuilder opcao5caso1 = new StringBuilder();
                            opcao5caso1.append("X").append(espaco).append("X").append(" Valor de revenda do album do tipo Lendária ").append("X").append(espaco).append("X").append("\n");
                            opcao5caso1.append("X").append(espaco).append("X").append(" R$ ").append(String.format("%.2f ", album.valorTotalFigurinhas(TipoRaridadeEnum.LENDARIA))).append("X").append(espaco).append("X");
                            opcao5caso1.append("\n");
                            opcao5caso1.append("\n");
                            System.out.println(opcao5caso1.toString());
                            break;
                        case 2:
                            StringBuilder opcao5caso2 = new StringBuilder();
                            opcao5caso2.append("X").append(espaco).append("X").append(" Valor de revenda do album do tipo Mítica ").append("X").append(espaco).append("X").append("\n");
                            opcao5caso2.append("X").append(espaco).append("X").append(" R$ ").append(String.format("%.2f ", album.valorTotalFigurinhas(TipoRaridadeEnum.MITICA))).append("X").append(espaco).append("X");
                            opcao5caso2.append("\n");
                            opcao5caso2.append("\n");
                            System.out.println(opcao5caso2.toString());
                            break;
                        case 3:
                            StringBuilder opcao5caso3 = new StringBuilder();
                            opcao5caso3.append("X").append(espaco).append("X").append(" Valor de revenda do album do tipo Rara ").append("X").append(espaco).append("X").append("\n");
                            opcao5caso3.append("X").append(espaco).append("X").append(" R$ ").append(String.format("%.2f ", album.valorTotalFigurinhas(TipoRaridadeEnum.RARA))).append("X").append(espaco).append("X");
                            opcao5caso3.append("\n");
                            opcao5caso3.append("\n");
                            System.out.println(opcao5caso3.toString());
                            break;
                        case 4:
                            StringBuilder opcao5caso4 = new StringBuilder();
                            opcao5caso4.append("X").append(espaco).append("X").append(" Valor de revenda do album do tipo Comum ").append("X").append(espaco).append("X").append("\n");
                            opcao5caso4.append("X").append(espaco).append("X").append(" R$ ").append(String.format("%.2f ", album.valorTotalFigurinhas(TipoRaridadeEnum.COMUM))).append("X").append(espaco).append("X");
                            opcao5caso4.append("\n");
                            opcao5caso4.append("\n");
                            System.out.println(opcao5caso4.toString());
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                        break;
                    }
            }
        }
    }
    
}
