/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exercicio.personagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danylo Dias Gomes
 * 
 */

public class App {

    public static void main(String[]args){
        
        List <SuperPoder> poderesMiranha = new ArrayList();
        SuperPoder soltarTeia = new SuperPoder("Soltar Teia", 4);
        poderesMiranha.add(soltarTeia);
        SuperPoder andarParede = new SuperPoder("Andar em Paredes", 2);
        poderesMiranha.add(andarParede);
        SuperPoder sentidoAranha = new SuperPoder("Sentido Aranha", 6);
        poderesMiranha.add(sentidoAranha);
        Heroi miranha = new Heroi("Homem-Aranha", "Peter Parker", poderesMiranha);
        
        List <SuperPoder> poderesBatman = new ArrayList();
        SuperPoder intelectoGenio = new SuperPoder("Intelecto de Gênio", 10);
        poderesBatman.add(intelectoGenio);
        SuperPoder dinheiro = new SuperPoder("'Dinheiro'", 9);
        poderesBatman.add(dinheiro);
        Heroi batman = new Heroi("Batman", "Bruce Wayne", poderesBatman);
        
        List <SuperPoder> poderesMulherMaravilha = new ArrayList();
        SuperPoder forca = new SuperPoder("Força", 9);
        poderesMulherMaravilha.add(forca);
        SuperPoder superVelocidade = new SuperPoder("Super Velocidade", 8);
        poderesMulherMaravilha.add(superVelocidade);
        SuperPoder fatorRegenerativo = new SuperPoder("Fator Regenerativo", 10);
        poderesMulherMaravilha.add(fatorRegenerativo);
        Heroi mulherMaravilha = new Heroi("Mulher Maravilha", "Diana Prince", poderesMulherMaravilha);
        
        List <SuperPoder> poderesSuperman = new ArrayList();
        SuperPoder voar = new SuperPoder("Voar", 5);
        poderesSuperman.add(voar);
        SuperPoder forca2 = new SuperPoder("Força", 10);
        poderesSuperman.add(forca2);
        SuperPoder raioX = new SuperPoder("Visão de Raio-X", 4);
        poderesSuperman.add(raioX);
        SuperPoder sopro = new SuperPoder("Sopro Congelante", 3);
        poderesSuperman.add(sopro);
        Heroi superman = new Heroi("Superman", "Clark Kent", poderesSuperman);
        
        List <SuperPoder> poderesTsunade = new ArrayList();
        SuperPoder choque = new SuperPoder("Choque Desorientador do Corpo", 7);
        poderesTsunade.add(choque);
        SuperPoder bisturi = new SuperPoder("Bisturi de Chackra", 7);
        poderesTsunade.add(bisturi);
        SuperPoder katsuyu = new SuperPoder("Katsuyu: Imensa Rede de Cura", 10);
        poderesTsunade.add(katsuyu);
        SuperPoder peteleco = new SuperPoder("Peteleco", 10);
        poderesTsunade.add(peteleco);
        Heroi tsunade = new Heroi("Vovó Tsunade", "Tsunade Senju", poderesTsunade);

        List <SuperPoder> poderesMinato = new ArrayList();
        SuperPoder trovao = new SuperPoder("Deus Voador do Trovão", 7);
        poderesMinato.add(trovao);
        SuperPoder rasengan = new SuperPoder("Rasengan", 8);
        poderesMinato.add(rasengan);
        SuperPoder noveCaudas = new SuperPoder("Modo de Chakra do Nove-Caldas", 9);
        poderesMinato.add(noveCaudas);
        Heroi minato = new Heroi("Relâmpago amarelo da folha", "Minato Namikaze", poderesMinato);

        List <SuperPoder> poderesHinata = new ArrayList();        
        SuperPoder byakugan = new SuperPoder("Byakugan", 8);
        poderesHinata.add(byakugan);
        SuperPoder trigramas = new SuperPoder("Oito Trigramas Sessenta e Quatro Palmas", 8);
        poderesHinata.add(trigramas);
        Heroi hinata = new Heroi("Hinata", "Hinata Hyuga", poderesHinata);

        List <SuperPoder> poderesKakashi = new ArrayList();
        SuperPoder kamui = new SuperPoder("Kamui", 8);
        poderesKakashi.add(kamui);
        SuperPoder chidori = new SuperPoder("Chidori", 7);
        poderesKakashi.add(chidori);
        SuperPoder sharingan = new SuperPoder("Sharingan", 8);
        poderesKakashi.add(sharingan);
        Heroi copiador = new Heroi("Ninja Copiador", "Kakashi Hatake", poderesKakashi);
        
        List <SuperPoder> poderesDuende = new ArrayList();
        SuperPoder forcaDuende = new SuperPoder("Força", 6);
        poderesDuende.add(forcaDuende);
        SuperPoder explosivos = new SuperPoder("Explosivos", 3);
        poderesDuende.add(explosivos);
        Vilao duende = new Vilao("Duende Verde", "Norman Osbourne", poderesDuende);
        
        List <SuperPoder> poderesCoringa = new ArrayList();
        SuperPoder gasRiso = new SuperPoder("Gás do Riso", 8);
        poderesCoringa.add(gasRiso);
        Vilao coringa = new Vilao("Coringa", "Arthur Fleck", poderesCoringa);
        
        List <SuperPoder> poderesHera = new ArrayList();
        SuperPoder imunidadeToxica = new SuperPoder("Imunidade Tóxica", 6);
        poderesHera.add(imunidadeToxica);
        SuperPoder manipularPlantas = new SuperPoder("Manipulação de Plantas", 8);
        poderesHera.add(manipularPlantas);
        SuperPoder hipnose = new SuperPoder("Hipnose", 8);
        poderesHera.add(hipnose);
        Vilao hera = new Vilao("Hera Venenosa", "Pamela Isley", poderesHera);
        
        List <SuperPoder> poderesLuthor = new ArrayList();
        SuperPoder intelecto = new SuperPoder("Intelecto de Gênio", 7);
        poderesLuthor.add(intelecto);
        Vilao luthor = new Vilao("Lex Luthor", "Lex Luthor", poderesLuthor);
        
        List <SuperPoder> poderesPain = new ArrayList();
        SuperPoder shinra = new SuperPoder("Shinra Tensei", 9);
        poderesPain.add(shinra);
        SuperPoder bansho = new SuperPoder("Banshō Ten'in", 9);
        poderesPain.add(bansho);
        Vilao pain = new Vilao("Pain", "Pein Tendo", poderesPain);
        
        List <SuperPoder> poderesTobi = new ArrayList();
        SuperPoder fuinjutsu = new SuperPoder("Acorrentamento por Fūinjutsu", 8);
        poderesTobi.add(fuinjutsu);
        SuperPoder drenagem = new SuperPoder("Drenagem de Chakra", 7);
        poderesTobi.add(drenagem);
        poderesTobi.add(kamui);
        Vilao tobi = new Vilao("Tobi", "Obito Uchiha", poderesTobi);
        
        List <SuperPoder> poderesKonan = new ArrayList();
        SuperPoder chakram = new SuperPoder("Chakram de Papel", 7);
        poderesKonan.add(chakram);
        SuperPoder shuriken = new SuperPoder("Shuriken de Papel", 6);
        poderesKonan.add(shuriken);
        SuperPoder clone = new SuperPoder("Clone de Papel", 7);
        poderesKonan.add(clone);
        Vilao konan = new Vilao("Konan", "Konan", poderesKonan);
        
        List <SuperPoder> poderesGasOculto = new ArrayList();
        SuperPoder corte = new SuperPoder("Corte em Vários Pedaços", 7);
        poderesGasOculto.add(corte);
        SuperPoder espada = new SuperPoder("Espada Rotativa Voadora", 7);
        poderesGasOculto.add(espada);
        SuperPoder cloneAgua = new SuperPoder("Técnica do Clone de Água", 8);
        poderesGasOculto.add(cloneAgua);
        Vilao gasOculto = new Vilao("Demônio do gás oculto", "Zabuza Momochi", poderesGasOculto);
        
        Confronto.lutar(hinata, konan);
        Confronto.lutar(batman, coringa);
        Confronto.lutar(mulherMaravilha, luthor);
        Confronto.lutar(miranha, duende);
        Confronto.lutar(superman, gasOculto);
        Confronto.lutar(minato, pain);

        
    }
    
}
