package com.mycompany.exerciciopedido;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public enum Bebida {
    
    REFRIGERANTE(1, "Refrigerante", 5.0), AGUA(2, "Água", 1.0), LEITE(3, "Leite", 2.50), SUCO_LARANJA(4, "Suco de Laranja", 3.0), SUCO_UVA(5, "Suco de Uva", 3.0);

    private final Integer id;
    private final String nome;
    private final Double preco;
    
    private Bebida (Integer id, String nome, Double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public static void mostrarOpcoes(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(Bebida bebida : Bebida.values()){
            sb.append("-".repeat(50)).append("\n");
            sb.append(String.format("Código: %d | Bebida: %s - R$ %.2f", bebida.getId(), bebida.getNome(), bebida.getPreco())).append("\n");
            sb.append("-".repeat(50)).append("\n");
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
    
    public static Bebida buscarPorId(Integer id){
        for(Bebida bebida : Bebida.values()){
            if(bebida.getId() == id){
                return bebida;
            }
        }
        throw new IllegalArgumentException("ID de Bebida não existe!");
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
