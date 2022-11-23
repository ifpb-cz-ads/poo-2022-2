import java.util.ArrayList;

public class Startup {
  private ArrayList<String> celulasDeLocalizacao;
  private String nome;

  public void setCelulasDeLocalizacao(ArrayList<String> loc) {
    celulasDeLocalizacao = loc;
  }

  public void setNome(String n) {
    nome = n;
  }

  public String verificar(String userInput) {
    String resultado = "errou";
    int index = celulasDeLocalizacao.indexOf(userInput);
    if (index >= 0) {
      celulasDeLocalizacao.remove(index);
      if (celulasDeLocalizacao.isEmpty()) {
        resultado = "afundou";
        System.out.println("Você afundou " + nome + "   : ( ");
      } else {
        resultado = "acertou";
      }
    }
    return resultado;
  }
}