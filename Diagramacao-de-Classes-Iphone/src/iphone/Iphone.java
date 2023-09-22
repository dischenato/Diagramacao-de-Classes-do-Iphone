package iphone;

import iphone.internet.Safari;
import iphone.musica.Ipod;
import iphone.telefone.AparelhoTelefonico;

import java.util.Scanner;

public class Iphone {
    private static Scanner entrada = new Scanner(System.in);
    private static Ipod ipod;

    public static void main(String[] args) {
        ligar();

        while (true) {
            String aplicativo = escolherAplicativo();

            if (aplicativo.equalsIgnoreCase("Desligar")) {
                desligar();
                break;
            } else {
                usarAplicativo(aplicativo);
            }
        }

        entrada.close();
    }

    private static void desligar() {
        System.out.println("Desligando Aparelho");
    }

    private static String escolherAplicativo() {
        System.out.println("Usuário seleciona aplicativo (ou Digite 'Desligar' para sair):");
        return entrada.nextLine();
    }

    private static void usarAplicativo(String aplicativo) {
        if (aplicativo.equalsIgnoreCase("Musica")) {
            ipod = new Ipod();
            ipod.iniciarIpod();
        } else if (aplicativo.equalsIgnoreCase("Telefone")) {
            AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
            aparelhoTelefonico.iniciar();
            usarAplicativoTelefone(aparelhoTelefonico);
        } else if (aplicativo.equalsIgnoreCase("Internet")) {
            Safari safari = new Safari();
            safari.iniciar();
            usarAplicativoInternet(safari);
        } else {
            System.out.println("Aplicativo não reconhecido.");
        }
    }

    private static void usarAplicativoTelefone(AparelhoTelefonico aparelhoTelefonico) {
        while (true) {
            System.out.println("Opções do aplicativo de telefone:");
            System.out.println("1. Ligar");
            System.out.println("2. Atender");
            System.out.println("3. Iniciar Correio de Voz");
            System.out.println("4. Buscar Contato");
            System.out.println("5. Fechar Aplicativo de Telefone");
            System.out.println("6. Sair para o Menu Principal");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    aparelhoTelefonico.ligar();
                    break;
                case 2:
                    aparelhoTelefonico.atender();
                    break;
                case 3:
                    aparelhoTelefonico.iniciarCorreioVoz();
                    break;
                case 4:
                    System.out.println("Digite o nome do contato:");
                    String nomeContato = entrada.nextLine();
                    String resultado = aparelhoTelefonico.buscarContato(nomeContato);
                    System.out.println(resultado);
                    break;
                case 5:
                    aparelhoTelefonico.fechar();
                    return;
                case 6:
                    aparelhoTelefonico.fechar();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private static void usarAplicativoInternet(Safari safari) {
        while (true) {
            System.out.println("Opções do aplicativo de Internet:");
            System.out.println("1. Exibir Página");
            System.out.println("2. Atualizar Página");
            System.out.println("3. Adicionar Nova Aba");
            System.out.println("4. Fechar Aplicativo de Internet");
            System.out.println("5. Sair para o Menu Principal");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    safari.exibirPagina();
                    break;
                case 2:
                    safari.atualizarPagina();
                    break;
                case 3:
                    safari.adicionarNovaAba();
                    break;
                case 4:
                    safari.fechar();
                    return;
                case 5:
                    safari.fechar();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private static void ligar() {
        System.out.println("Aparelho ligando");
    }
}