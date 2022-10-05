package com.sptech.atividade.com.testes;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;
    
    public Hospital(String nome){
        this.nome = nome;
        quantidadeDeHoraExtra = 0;
        quantidadeDePagamentos = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }
    
    public void realizarPagamento(Medico medico, Double valorPago){
        if(medico != null && valorPago != null){
            if(medico.getAtivo() && valorPago > 0){
                medico.setSalario(medico.getSalario() + valorPago);
                quantidadeDePagamentos++;
            }
        }
    }
    
    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra){
        if(medico != null && valorPago != null && horaExtra != null){
            if(medico.getAtivo() && valorPago > 0 && horaExtra > 0){
                medico.setSalario(medico.getSalario() + valorPago + horaExtra );
                quantidadeDePagamentos++;
                quantidadeDeHoraExtra++;
            }
        }
    }
    
    public void desligarMedico(Medico medico){
        if(medico != null && medico.getAtivo()){
            medico.setAtivo(false);
        }
    }
    
}
