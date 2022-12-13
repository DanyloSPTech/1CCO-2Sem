package com.mycompany.exerciciopedido;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Pedido {

    private static Double TAXA_TRIBUTO = 5.80;
    
    private Lanche lanche;
    private Bebida bebida;
    private Acompanhamento acompanhamento;

    public Pedido(Lanche lanche, Bebida bebida, Acompanhamento acompanhamento) {
        this.lanche = lanche;
        this.bebida = bebida;
        this.acompanhamento = acompanhamento;
    }
    
    public Double getTotal(){
        return lanche.getPreco() + bebida.getPreco() + acompanhamento.getPreco() + TAXA_TRIBUTO;
    }

    public static Double getTAXA_TRIBUTO() {
        return TAXA_TRIBUTO;
    }

    public static void setTAXA_TRIBUTO(Double TAXA_TRIBUTO) {
        Pedido.TAXA_TRIBUTO = TAXA_TRIBUTO;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
    
}
