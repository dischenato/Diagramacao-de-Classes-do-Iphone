package iphone.musica;

import java.util.Scanner;

public class Ipod {
    private boolean ligado = false;
    private boolean tocando = false;
    private Scanner entrada = new Scanner(System.in);

    public void iniciarIpod() {
        ligado = true;
        System.out.println("Iniciando Ipod");
        mostrarComandos();
        receberComandos();
    }

    private void mostrarComandos() {
        System.out.println("Comandos disponíveis no Ipod:");
        System.out.println("1. Selecionar música");
        System.out.println("2. Tocar música");
        System.out.println("3. Pausar música");
        System.out.println("4. Sair do Ipod");
    }

    private void receberComandos() {
        while (ligado) {
            System.out.println("Digite o número do comando:");
            int comando = Integer.parseInt(entrada.nextLine());

            switch (comando) {
                case 1:
                    selecionarMusica();
                    break;
                case 2:
                    tocarMusica();
                    break;
                case 3:
                    pausarMusica();
                    break;
                case 4:
                    sairIpod();
                    break;
                default:
                    System.out.println("Comando inválido. Por favor, escolha um número válido.");
            }
        }
    }

    public void selecionarMusica() {
        if (ligado) {
            tocando = true;
            System.out.println("Música selecionada");
        } else {
            System.out.println("Ipod não está ligado.");
        }
    }

    public void tocarMusica() {
        if (ligado) {
            tocando = true;
            System.out.println("Tocando música");
        } else {
            System.out.println("Ipod não está ligado.");
        }
    }

    public void pausarMusica() {
        if (ligado && tocando) {
            tocando = false;
            System.out.println("Pausando música");
        } else {
            System.out.println("Não há música tocando para pausar.");
        }
    }

    public void sairIpod() {
        if (ligado) {
            ligado = false;
            System.out.println("Saindo do Ipod");
        } else {
            System.out.println("Ipod não está ligado.");
        }
    }
}