
/**
 * Atividade colaborativa 2, BMQuestao04
 * 
 * @author Paulo 
 * @version 19/10/2022
 */
public class BMQuestao04
{
    public static void main(String[] args) {
        long long1 = 100l;
        int int1 = 200;
        // erro
        // int int2 = int1 + long1;
        
        // solucao 01
        //int int2 = 0;
        //int2 += int1 + long1;
        
        // solucao 02
        int int2 = int1 + (int) long1;
    }
}
