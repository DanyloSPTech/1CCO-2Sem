package com.mycompany.exerciciopedido;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public enum Lanche {
    
    XBACON(1, "X-Bacon", 30.0), XBURGUER(2, "X-Burguer", 20.0), XEGG(3, "X-Egg", 15.0), XSALADA(4, "X-Salada", 17.5);
    
    private final Integer id;
    private final String nome;
    private final Double preco;
    
    private Lanche(Integer id, String nome, Double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void mostrarOpcoes(){
        StringBuilder sb = new StringBuilder();
        sb.append("X").append("-".repeat(18)).append("X").append(" Menu de Opções ").append("X").append("-".repeat(18)).append("X").append("\n").append("\n");
        for(Lanche lanche : Lanche.values()){
            sb.append("-".repeat(50)).append("\n");
            sb.append("ID: ").append(lanche.getId()).append("\n");
            sb.append("Nome: ").append(lanche.getNome()).append("\n");
            sb.append("Valor: ").append(lanche.getPreco()).append("\n");
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
