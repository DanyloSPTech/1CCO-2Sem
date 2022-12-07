package com.mycompany.albumdacopa;

import com.github.javafaker.Faker;
import java.util.Locale;
import javax.xml.parsers.FactoryConfigurationError;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Figurinha {

    private String nomeJogador;
    private TipoRaridadeEnum raridadeEnum;
    
    public Figurinha(){
        this.nomeJogador = setNomeJogador();
        this.raridadeEnum = TipoRaridadeEnum.sortearRaidade();
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public String setNomeJogador() {
        return Faker.instance(Locale.forLanguageTag("pt-BR")).name().fullName();
    }

    public TipoRaridadeEnum getRaridadeEnum() {
        return raridadeEnum;
    }
    
}
