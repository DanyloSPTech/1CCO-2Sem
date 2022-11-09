/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.vendedor.comissao;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class App {

    public static void main(String[]args){
        
        Departamento departamento = new Departamento("Eletronicos");
        
        VendedorComissao vendedor = new VendedorComissao(50, "Douglas", 7500.00, 12.00);
        
        VendedorComissaoMaisFixo vendedorFixo = new VendedorComissaoMaisFixo(100, "Danylo", 5500.00, 15.00, 1200.00);
        
        departamento.adicionarVendedor(vendedor);
        departamento.adicionarVendedor(vendedorFixo);
        
        System.out.println("Vendedor 1: " + vendedor.toString());
        System.out.println("Vendedor 2: " + vendedorFixo.toString());
        
        System.out.println("Total Vendedores: " + departamento.getQuantidadeVendedores());
        
        System.out.println("------------------------------------------------------");
        
        System.out.println("Salário Total Departamento: " + departamento.calcularTotalSalario());
        
    }
    
}
