
/**
 * Programa de exemplos de laços em Java.
 * 
 * @author Paulo Ewerton
 * @version 26/10/2022
 */
public class Lacos
{
    public static void main(String[] args) {
        
        // exemplo while
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--; // i -= 1; i = i -1;
        }
        
        // exemplo do while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        
        // exemplo for
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
        
        // exemplo break
        
        int numBuscado = 10;
        for (int l = 0; l < 100; l++) {
            if (l == numBuscado) {
                System.out.println("Número encontrado");
                break;
            }
            System.out.println("Número não encontrado. Continuando...");
        }
        
        // exemplo continue
        for (int m = 0; m < 100; m++) {
            if (m % 2 == 0) {
                System.out.println("Número " + m + " é par.");
                // return;
                continue;
            }
            System.out.println("Número é ímpar.");
        }
        
        String[] alunos = {"Ana", "Bia", "maria", "Bia", "josé", "Bia"};
        int count = 0;
        for (int n = 0; n < alunos.length; n++) {
            if (!alunos[n].equals("maria")) {
                continue;
            }
            count++;
        }
        System.out.println("Nome encontrado: " + count + " vezes.");
    }
}
