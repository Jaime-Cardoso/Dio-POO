package org.example;

import org.example.Interfaces.AparelhoTelefonico;
import org.example.Interfaces.NavegadorInternet;
import org.example.Interfaces.ReprodutorMusical;

public class Main{
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Song 1");

        // Testando AparelhoTelefonico
        meuIphone.ligar("555-1234");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.dio.me/users/djnetonet");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}