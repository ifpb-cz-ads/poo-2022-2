public class StartupSimplesTeste {
  public static void main(String[] args) {
    StartupSimples startup = new StartupSimples();

    int[] localizacoes = {2, 3, 4};
    startup.setCelulasDeLocalizacao(localizacoes);

    int palpiteDoUsuario = 2;
    String resultado = startup.verificar(palpiteDoUsuario);
    String resultadoTeste = "falhou";
    if (resultado.equals("acertou")) {
      resultadoTeste = "passou";
    }
    System.out.println(resultadoTeste);
  }
}

class StartupSimples {
  private int[] celulasDeLocalizacao;
  private int numAcertos = 0;

  public void setCelulasDeLocalizacao(int[] celulas) {
    celulasDeLocalizacao = celulas;
  }

  public String verificar(int tentativa) {
    String resultado = "errou";
    for (int celula : celulasDeLocalizacao) {
      if (tentativa == celula) {
        resultado = "acertou";
        numAcertos++;
        break;
      }
    }
    if (numAcertos == celulasDeLocalizacao.length) {
      resultado = "afundou";
    }
    System.out.println(resultado);
    return resultado;
  }
}
