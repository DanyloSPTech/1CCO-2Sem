/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.agrecacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Grupo {

    private String nome;
    private List <Contato> contatos;
    
    public Grupo(String nome, List <Contato> contatos){
        this.nome = nome;
        this.contatos = contatos;
    }
    
    public Grupo(String nome){
        this.nome = nome;
        this.contatos = new ArrayList();
    }
    
    public void adiciona(Contato contato){
        this.contatos.add(contato);
    }
    
    public void remove(Contato contato){
        this.contatos.remove(contato);
    }
    
    public void remove(String telefone){
        for(Contato contato : contatos){
            if(contato.getTelefone().equals(telefone)){
                contatos.remove(contato);
            }
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public List <Contato> getContatos(){
        return this.contatos;
    }
    
    public void setContatos(List <Contato> contatos){
        this.contatos = contatos;
    }
    
}
