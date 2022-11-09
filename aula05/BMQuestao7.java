
/**
 * Atividade colaborativa aula 05 - BMQuestao7
 * 
 * @author Paulo
 * @version 09/11/2022
 */
public class BMQuestao7
{
    public static void main(String[] args) {
        int x = 13;
        int y = 0;
        
        while (x != 1) {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = (3 * x) + 1;
            }
            System.out.print(y + " ");
            x = y;
        }
    }
}
