/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.agrecacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class App {

    public static void main(String[]args){
        
        Grupo grupo1 = new Grupo("Grupo LP");
        
        Contato contato1 = new Contato("Diego", "(11) 99999-9999");
        Contato contato2 = new Contato("Raissa", "(11) 88888-8888");
        Contato contato3 = new Contato("Giuliana", "(11) 77777-7777");
        
        grupo1.adiciona(contato1);
        grupo1.adiciona(contato2);
        grupo1.adiciona(contato3);

        List <Contato> teste = new ArrayList();
        
        teste.add(contato1);
        teste.add(contato2);
        teste.add(contato3);
        
        Grupo grupo2 = new Grupo("Teste lista", teste);
        
    }
    
}
