package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

  private List<Integer> inteiros;

  public ListaUtil() {
    this.inteiros = new ArrayList<>();
  }

  public void add(Integer valor) {
      if(valor != null){
          inteiros.add(valor);
      }
  }

  public void remove(Integer valor) {
      if(valor != null){
          inteiros.remove(valor);
      }
  }

  public Integer count() {
    return inteiros.size();
  }

  public Integer countPares() {
      Integer pares = 0;
      if(inteiros.size() > 0){
          for(int i = 0; i < inteiros.size(); i++){
              if(inteiros.get(i) % 2 == 0){
                  pares++;
              }
          }
      }
      return pares;
  }

  public Integer countImpares() {
    Integer impares = 0;
      if(inteiros.size() > 0){
          for(int i = 0; i < inteiros.size(); i++){
              if(inteiros.get(i) % 2 != 0){
                  impares++;
              }
          }
      }
      return impares;
  }

  public Integer somar() {
      Integer soma = 0;
      if(inteiros.size() > 0){
          for(int i = 0; i < inteiros.size(); i++){
              soma += inteiros.get(i);
          }
      }
      return soma;
  }

  public Integer getMaior() {
      Integer maior = 0;
      if(inteiros.size() > 0){
          for(int i = 0; i < inteiros.size(); i++){
              if(inteiros.get(i) > maior){
                  maior = inteiros.get(i);
              }
          }
      }
      return maior;
  }

  public Integer getMenor() {
    Integer menor;
    if(inteiros.size() > 0){
        menor = inteiros.get(0);
        for(int i = 0; i < inteiros.size(); i++){
            if(inteiros.get(i) < menor){
                menor = inteiros.get(i);
            }
        }
    }else{
        menor = 0;
    }
    return menor;
  }

  public Boolean hasDuplicidade() {
    Boolean duplicidade = false;
    if(inteiros.size() > 0){
        for(int i = 0; i < inteiros.size(); i++){
            if(inteiros.contains(inteiros.get(i)) && i != inteiros.indexOf(inteiros.get(i))){
                duplicidade = true;
                break;
            }
        }
    }
    return duplicidade;
  }
}
