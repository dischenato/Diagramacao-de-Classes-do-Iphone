package iphone.telefone;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico implements Telefone{
    public void iniciar() {
    }
    
    String NomeContato;
    int numero;
    

    List<AparelhoTelefonico> contatos;

    public AparelhoTelefonico() {
        contatos = new ArrayList<>();
    }

    public AparelhoTelefonico(String nome, int numero) {
        this.NomeContato = nome;
        this.numero = numero;
    }

    @SuppressWarnings("unused")
    public void adicionarContato(String nome, int numero){
        contatos.add(new AparelhoTelefonico(nome, numero));
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para contato");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @SuppressWarnings("unused")
    public String buscarContato(String nome){
        List<AparelhoTelefonico> c = contatos.stream()
                .filter(n -> n.NomeContato.equalsIgnoreCase(nome))
                .toList();
        return c.toString();
    }

    @SuppressWarnings("unused")
    public void fechar(){
        System.out.println("Encerrando telefone");
    }

}