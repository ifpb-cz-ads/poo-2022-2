import java.util.ArrayList;

public class StartupGame {

  private GameHelper helper = new GameHelper();
  private ArrayList<Startup> startups = new ArrayList<Startup>();
  private int numTentativas = 0;

  private void configurarJogo() {
    // inicialize algumas atartups provendo as localizacoes
    Startup um = new Startup();
    um.setNome("iComida");
    Startup dois = new Startup();
    dois.setNome("Happinho");
    Startup tres = new Startup();
    tres.setNome("9999");
    startups.add(um);
    startups.add(dois);
    startups.add(tres);

    System.out.println("Seu objetivo é afundar tres Startups.");
    System.out.println("iComida, Happinho, 9999");
    System.out.println("Tente afundar todas no menor numero possível de tentativas");

    for (Startup startup : startups) {
      ArrayList<String> novaLocalizacao = helper.placeStartup(3);
      startup.setCelulasDeLocalizacao(novaLocalizacao);
    }
  }

  private void iniciarJogo() {
    while (!startups.isEmpty()) {
      String palpite = helper.getUserInput("Insira uma tentativa");
      verificarPalpite(palpite);
    }
    finalizarJogo();
  }

  private void verificarPalpite(String palpite) {
    numTentativas++;
    String resultado = "errou"; // admita erro até ter um acerto

    for (Startup startupTeste : startups) {
      resultado = startupTeste.verificar(palpite);

      if (resultado.equals("acertou")) {
        break;
      }
      if (resultado.equals("afundou")) {
        startups.remove(startupTeste); // já era
        break;
      }
    }

    System.out.println(resultado);
  }

  private void finalizarJogo() {
    System.out.println("Todas as startups foram afundadas! Suas ações não valem mais nada");
    if (numTentativas <= 18) {
      System.out.println("Parabéns! Você levou apenas " + numTentativas + " tentativas.");
    } else {
      System.out.println("Você demorou muito. " + numTentativas + " tentativas.");
    }
  }

  public static void main(String[] args) {
    StartupGame game = new StartupGame();
    game.configurarJogo();
    game.iniciarJogo();
  }
}