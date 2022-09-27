package school.sptech.desafio.nome.sobrenome.poo;

public class RecursosHumanos {

    private Integer quantidadePromovidos;
    private Integer quantidadeReajustes;
    
    public RecursosHumanos (){
        quantidadePromovidos = 0;
        quantidadeReajustes = 0;
    }
    
    public void reajustarSalario(Colaborador colaborador, Double porcentagem){
        if(colaborador != null && porcentagem != null){
            if(porcentagem > 0){
                colaborador.setSalario(colaborador.getSalario() + (colaborador.getSalario() * porcentagem / 100));
                quantidadeReajustes += 1;
            }else{
                System.out.println(String.format("Valor da porcentagem para ajuste inválido! cancelando reajuste de: %s...", colaborador.getNome()));
            }
            
        }
    }
    
    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario){
        if(colaborador != null && novoCargo != null && novoSalario != null){
            if(novoSalario > colaborador.getSalario()){
                colaborador.setCargo(novoCargo);
                colaborador.setSalario(novoSalario);
                quantidadePromovidos += 1;
            }else{
                System.out.println(String.format("Novo salário é inferior ao antigo! cancelando promoção de: %s...", colaborador.getNome()));
            }
        }
    }
    
}
