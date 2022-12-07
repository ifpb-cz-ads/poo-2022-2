
import java.util.Scanner;
/**
 * Atividade colaborativa 07.03 - CTQuestao3.
 * 
 * @author Paulo 
 * @version 07/12/2022
 */
public class CTQuestao3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[10];
        
        int j = 0;
        double soma = 0;
        while (j < notas.length) {
            System.out.println("Digite a nota do aluno:");
            double nota = Double.parseDouble(scan.next());
            notas[j] = nota;
            soma += nota;
            j++;
        }
        
        System.out.println("Quantidade de notas: " + notas.length);
        System.out.println("Média das notas: " + soma / notas.length);
    }
}
