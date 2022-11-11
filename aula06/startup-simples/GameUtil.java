import java.util.Scanner;

public class GameUtil {
  public int lerEntradaDoUsuario(String prompt) {
    System.out.print(prompt + ": ");
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  }
}
