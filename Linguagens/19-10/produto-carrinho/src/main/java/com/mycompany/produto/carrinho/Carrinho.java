/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produto.carrinho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes4
 * 
 */

public class Carrinho {
    
    private String cliente;
    private List <Produto> produtos;
    
    public Carrinho(String cliente, List <Produto> produtos){
        this.cliente = cliente;
        this.produtos = produtos;
    }
    
    public Carrinho(String cliente){
        this.cliente = cliente;
        produtos = new ArrayList();
    }
    
    public Integer getQuantidade(){
        Integer quantidade = 0;
        for(Produto produto : produtos){
            quantidade++;
        }
        return quantidade;
    }
    
    public void adicionar(Produto produto){
        produtos.add(produto);
    }
    
    public Boolean existsPorNome(String nome){
        Boolean exists = false;
        for(Produto produto : produtos){
            if(produto.getNome().equals(nome)){
                exists = true;
            }
        }
        return exists;
    }
    
    public Integer getQuantidadePorCategoria(String nome){
        Integer quantidade = 0;
        for(Produto produto : produtos){
            if(produto.getNome().equals(nome)){
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public void limpar(){
        this.produtos.clear();
    }
    
    public void removerPorNome(String nome){
        for(Produto produto : produtos){
            if(produto.getNome().equals(nome)){
                produtos.remove(produto);
            }
        }
    }
    
    public Produto getPorNome(String nome){
        for(Produto produto : produtos){
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }
        return null;
    }
    
    public Double getValorTotal(){
        Double valor = 0.0;
        for(Produto produto : produtos){
            valor += produto.getPreco();
        }
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
}
