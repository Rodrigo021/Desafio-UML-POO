public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    @Override
    public void tocar() {
        System.out.println("Tocando");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando : "+musica);
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para : "+numero);
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando : "+url);
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        
    }

}
