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

public class VendedorComissao {

    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;
    
    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa){
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    public Double calcularSalario(){
        return vendas * (taxa / 100);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n\n").append("---Vendedor Comissão---").append("\n");
        sb.append("Código: ").append(codigo).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Vendas: ").append(vendas).append("\n");
        sb.append("Taxa: ").append(taxa).append("\n");
        sb.append("\n").append("Salário: ").append(calcularSalario());
        
        return sb.toString();
        
    }
    
}
