public class StartupSimplesGame {
  public static void main(String[] args) {
    int numTentativas = 0;
    GameUtil util = new GameUtil();

    StartupSimples startup = new StartupSimples();
    int numAleatorio = (int) (Math.random() * 5);

    int[] localizacoes = {numAleatorio, numAleatorio + 1, numAleatorio + 2};
    startup.setCelulasDeLocalizacao(localizacoes);
    boolean estaViva = true;

    while (estaViva) {
      int palpite = util.lerEntradaDoUsuario("digite um numero");
      String resultado = startup.verificar(palpite);
      numTentativas++;
      if (resultado.equals("afundou")) {
        estaViva = false;
        System.out.println("Voce usou " + numTentativas + " tentativas");
      }
    }
  }

}
