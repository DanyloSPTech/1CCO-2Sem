package com.mycompany.exerciciopedido;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public enum Acompanhamento {
    
    BATATA_FRITA(1, "Batata frita", 13.50), SALADA(2, "Salada", 5.50), TORTA(3, "Torta", 7.00);

    private final Integer id;
    private final String nome;
    private final Double preco;
    
    private Acompanhamento (Integer id, String nome, Double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void mostrarOpcoes(){
        StringBuilder sb = new StringBuilder();
        sb.append("X").append("-".repeat(18)).append("X").append(" Menu de Opções ").append("X").append("-".repeat(18)).append("X").append("\n").append("\n");
        for(Acompanhamento acompanhamento : Acompanhamento.values()){
            sb.append("-".repeat(50)).append("\n");
            sb.append("ID: ").append(acompanhamento.getId()).append("\n");
            sb.append("Nome: ").append(acompanhamento.getNome()).append("\n");
            sb.append("Valor: ").append(acompanhamento.getPreco()).append("\n");
            sb.append("-".repeat(50)).append("\n");
        }
        sb.append("X").append("-".repeat(18)).append("X").append("                 ").append("X").append("-".repeat(18)).append("X").append("\n").append("\n");
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Double getPreco(){
        return this.preco;
    }
    
}
