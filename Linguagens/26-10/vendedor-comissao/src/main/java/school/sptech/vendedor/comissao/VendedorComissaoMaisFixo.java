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

public class VendedorComissaoMaisFixo extends VendedorComissao{
        
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo){
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }
    
    public void metodoExclusivo(){
        System.out.println("Esse metódo é exclusivo da classe VendedorComissaoMaisFixo");
    }

    @Override
    public Double calcularSalario() {
        return salarioFixo + super.calcularSalario();
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n\n").append("---Vendedor Comissão---").append("\n");
        sb.append("Código: ").append(getClass()).append("\n");
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Vendas: ").append(getVendas()).append("\n");
        sb.append("Taxa: ").append(getTaxa()).append("\n");
        sb.append("\n").append("Salário: ").append(calcularSalario());
        
        return sb.toString();
        
    }
    
    
    
}
