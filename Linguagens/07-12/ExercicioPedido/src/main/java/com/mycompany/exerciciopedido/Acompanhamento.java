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
    
    public static void mostrarOpcoes(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(Acompanhamento acompanhamento : Acompanhamento.values()){
            sb.append("-".repeat(50)).append("\n");
            sb.append(String.format("Código: %d | Lanche: %s - R$ %.2f", acompanhamento.getId(), acompanhamento.getNome(), acompanhamento.getPreco())).append("\n");
            sb.append("-".repeat(50)).append("\n");
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
    
    public static Acompanhamento buscarPorId(Integer id){
        for(Acompanhamento acompanhamento : Acompanhamento.values()){
            if(acompanhamento.getId() == id){
                return acompanhamento;
            }
        }
        throw new IllegalArgumentException("ID de Acompanhamento não existe!");
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
