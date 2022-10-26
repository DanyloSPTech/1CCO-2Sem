/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.projeto.heranca;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class AlunoPos extends Aluno{

    private Double nota3;
    
    public AlunoPos(String nome, Integer ra, Double nota1, Double nota2, Double nota3){
        super(ra, nome, nota1, nota2);
        this.nota3 = nota3;
    }

    @Override
    public Double calcularMedia() {
        return (super.getNota1() + super.getNota2() + this.nota3) / 3;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    
}
