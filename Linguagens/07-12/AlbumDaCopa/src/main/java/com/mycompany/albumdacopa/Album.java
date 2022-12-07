package com.mycompany.albumdacopa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Album {

    public static final int MAXIMO_FIGURINHAS = 10;
    private List <Figurinha> figurinhas;
    
    public Album(){
        figurinhas = new ArrayList();
    }
    
    public void adicionarFigurinhas(Figurinha novaFigurinha){
        if(figurinhas.size() < MAXIMO_FIGURINHAS){
            figurinhas.add(novaFigurinha);        
        }
    }
    
    public void adicionarFigurinhas(List <Figurinha> figurinhasNovas){
        for(Figurinha figurinha : figurinhasNovas){
            if(figurinhas.size() < MAXIMO_FIGURINHAS){
                figurinhas.add(figurinha);            
            }
        }
    }
    
    public Integer contagemDeFigurinhasPorTipo(TipoRaridadeEnum tipo){
        Integer qtdeFigurinhas = 0;
        for(Figurinha figurinha : figurinhas){
            if(figurinha.getRaridadeEnum().equals(tipo)){
                qtdeFigurinhas++;
            }
        }
        return qtdeFigurinhas;
    }
    
    public double valorTotalFigurinhas(){
        Double valorTotal = 0.0;
        for(Figurinha figurinha : figurinhas){
            valorTotal += figurinha.getRaridadeEnum().precoVenda();
        }
        return valorTotal;
    }
    
    public double valorTotalFigurinhas(TipoRaridadeEnum tipo){
        Double valorTotal = 0.0;
        for(Figurinha figurinha : figurinhas){
            if(figurinha.getRaridadeEnum().equals(tipo)){
                valorTotal += figurinha.getRaridadeEnum().precoVenda();            
            }
        }
        return valorTotal;
    }
    
    public Boolean albumCompleto(){
        return figurinhas.size() >= MAXIMO_FIGURINHAS;
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }
    
}
