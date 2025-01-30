package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
   public void tocar () {
    System.out.println("Reproduzindo música...");
   }
   public void pausar() {
    System.out.println("Música pausada.");
   }
   public void selecionarMusica(String musica) {
    System.out.println("Música Selecionada:  " + musica);
   }
   @Override
   public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
   }
   @Ovveride
   public void adicionarNovaAba () {
    System.out.println ("Nova aba adicionada");
   }
   @Override
   public void atualizarPágina() {
    System.out.println ("Página atualizada");
   }
   @Override
   public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
   }
   @Override
   public void atender() {
    System.out.println("Atendendo a chamada...");
   }
   @Override
   public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
   }

   public static void main(String[] args) {
       Iphone meuIphone = new Iphone();

    meuIphone.selecionarMusica("Linkin Park - Numb");
    meuIphone.tocar();
    meuIphone.pausar();

    meuIphone.ligar("999999999");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    meuIphone.exibirPagina("www.google.com");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPágina();
   }

}
