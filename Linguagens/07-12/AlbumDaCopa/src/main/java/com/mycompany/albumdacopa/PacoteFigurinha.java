package com.mycompany.albumdacopa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class PacoteFigurinha {

    private Boolean aberto;
    private Integer quantidadeDeFigurinhas;
    
    public PacoteFigurinha(Integer quantidadeDeFigurinhas){
        this.aberto = false;
        this.quantidadeDeFigurinhas = quantidadeDeFigurinhas;
    }
    
    public List <Figurinha> abrirPacote(){
        if(!aberto){
            List <Figurinha> figurinhas = new ArrayList();
            for(int i = 0; i < quantidadeDeFigurinhas; i ++){
                Figurinha figurinha = new Figurinha();
                figurinhas.add(figurinha);
            }
            return figurinhas;
        }
        return null;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Integer getQuantidadeDeFigurinhas() {
        return quantidadeDeFigurinhas;
    }

    public void setQuantidadeDeFigurinhas(Integer quantidadeDeFigurinhas) {
        this.quantidadeDeFigurinhas = quantidadeDeFigurinhas;
    }
    
}
