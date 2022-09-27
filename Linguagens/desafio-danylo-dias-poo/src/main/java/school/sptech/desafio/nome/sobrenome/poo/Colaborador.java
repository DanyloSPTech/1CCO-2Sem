
package school.sptech.desafio.nome.sobrenome.poo;

public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;
    
    public Colaborador(String nome, String cargo, Double salario){
        if(salario > 0){
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
        }else{
            System.out.println("Informe um salário válido para o colaborador!");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
