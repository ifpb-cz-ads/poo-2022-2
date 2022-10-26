
/**
 * Programa que recebe um palpite do usuário e
 * verifica se ele acertou um número escolhido
 * aleatoriamente.
 * 
 * @author Paulo 
 * @version 26/10/2022
 */
import java.util.Scanner;
import java.util.Random;

public class Palpite
{
    public static void main(String[] args) {
        int max = 100;
        int min = 0; 
        
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(max);
        
        int palpite = 0;
        int numTentativas = 10;
        
        while (numTentativas > 0) {
            System.out.println("Qual o seu palpite? (" + min + " ~ " + max + ")");
            palpite = entrada.nextInt();
            
            if (palpite == numeroSecreto) {
                System.out.println("Você acertou!");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Número muito pequeno.");
                min = palpite;
            } else {
                System.out.println("Número muito grande.");
                max = palpite;
            }
            System.out.println("Restam " + --numTentativas + " tentativas.");
        }
    }
}
