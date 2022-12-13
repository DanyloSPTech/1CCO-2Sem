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
    
    public static void mostrarOpcoes(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(Lanche lanche : Lanche.values()){
            sb.append("-".repeat(50)).append("\n");
            sb.append(String.format("Código: %d | Lanche: %s - R$ %.2f", lanche.getId(), lanche.getNome(), lanche.getPreco())).append("\n");
            sb.append("-".repeat(50)).append("\n");
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
    
    public static Lanche buscarPorId(Integer id){
        for(Lanche lanche : Lanche.values()){
            if(lanche.getId() == id){
                return lanche;
            }
        }
        throw new IllegalArgumentException("ID de Lanche não existe!");
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
