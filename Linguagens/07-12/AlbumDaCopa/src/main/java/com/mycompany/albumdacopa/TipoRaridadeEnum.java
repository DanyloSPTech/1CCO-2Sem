package com.mycompany.albumdacopa;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public enum TipoRaridadeEnum {

    LENDARIA("Lendária", 1000.00), MITICA("Mítica", 180.00), RARA("Rara", 50.00), COMUM("Comum", 4.00);
    
    private final String nome;
    private final Double precoVenda;

    private TipoRaridadeEnum(String nome, Double precoVenda) {
        this.nome = nome;
        this.precoVenda = precoVenda;
    }
    
    public static TipoRaridadeEnum sortearRaidade(){
        Double idSorteio = Math.random() * 4;
        Integer idRaridade = idSorteio.intValue();
        if(idRaridade <= TipoRaridadeEnum.values().length){
            return TipoRaridadeEnum.values()[idRaridade];
        }else{
            sortearRaidade();
        }
        return null;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Double precoVenda(){
        return this.precoVenda;
    }
    
}
