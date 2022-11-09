
/**
 * Atividade colaborativa - aula 05 - BMQuestao6
 * 
 * @author Paulo
 * @version 09/11/2022
 */
import java.util.Scanner;

public class BMQuestao6
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] diasSemana = {"seg", "ter", "qua", "qui", "sex", "sab", "dom"};
        
        //String[] dias = new String[7];
        //dias[0] = "seg";
        
        int dia = 1;
        
        while ((dia = entrada.nextInt()) != 0) {
            System.out.println(diasSemana[dia - 1]);
        }
    }
}
