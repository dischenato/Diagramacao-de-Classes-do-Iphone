package iphone.internet;

public class Safari implements Internet {
    public void iniciar() {
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("Acessando página da internet a partir de URL");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página da internet");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador");

    }

    public void fechar() {
        System.out.println("Encerrando navegador de internet");

    }

}
