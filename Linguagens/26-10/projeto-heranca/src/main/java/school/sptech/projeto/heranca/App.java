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

public class App {

    public static void main(String[]args){
        
        AlunoPos alunoPos = new AlunoPos("Danylo Dias Gomes", 02221004, 10.0, 8.25, 9.20);
        
        System.out.println(alunoPos.calcularMedia());
        
    }
    
}
