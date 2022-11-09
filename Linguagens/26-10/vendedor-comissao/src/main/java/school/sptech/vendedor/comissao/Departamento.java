/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.vendedor.comissao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class Departamento {

    private String nome;
    private List <VendedorComissao> vendedores;
    
    public Departamento(String nome){
        this.nome = nome;
        this.vendedores = new ArrayList();
    }
    
    public Departamento(String nome, List <VendedorComissao> vendedores){
        this.nome = nome;
        this.vendedores = vendedores;
    }
    
    public void adicionarVendedor(VendedorComissao vendedor){
        this.vendedores.add(vendedor);
    }
    
    public Double calcularTotalSalario(){
        Double somaSalario = 0.0;
        for(VendedorComissao vendedor : vendedores){
            somaSalario += vendedor.calcularSalario();
        }
        return somaSalario;
    }
    
    public Integer getQuantidadeFixos(){
        
        Integer total = 0;
        
        for(VendedorComissao vendedor : vendedores){
            
            if(vendedor instanceof VendedorComissaoMaisFixo) {
                total++;
            }
            
            // Usando um método exclusivo de uma subclasse:
//            if(vendedor instanceof VendedorComissaoMaisFixo) {
//                VendedorComissaoMaisFixo vendedorFixo = (VendedorComissaoMaisFixo) vendedor;
//                vendedorFixo.metodoExclusivo();
//            }
            
        }
        
        return total;
        
    }
    
    public Integer getQuantidadeVendedores(){
        return vendedores.size();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("---Departamento---").append("\n");
        sb.append("\n").append("Nome: ").append(this.nome);
        
        return sb.toString();
    }
    
}
