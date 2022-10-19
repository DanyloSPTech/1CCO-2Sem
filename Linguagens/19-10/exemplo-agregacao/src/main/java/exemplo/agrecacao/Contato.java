/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.agrecacao;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloqueado;
    
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }
    
    public void bloquear(){
        this.bloqueado = true;
    }
    
    public void desbloquear(){
        this.bloqueado = false;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public Boolean getBloqueado(){
        return this.bloqueado;
    }
    
    public void setBloqueado(Boolean bloqueado){
        this.bloqueado = bloqueado;
    }
    
}
