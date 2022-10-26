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
        
        VendedorComissaoMaisFixo vendedor = new VendedorComissaoMaisFixo(100, "Danylo", 5500.00, 15.00, 1200.00);
        
        System.out.println(vendedor.calcularSalario());
        
    }
    
}
