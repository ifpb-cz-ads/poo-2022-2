
/**
 * Atividade colaboratia 7.03 - CBBAtividade5.
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class CBBAtividade5
{
    public static void main(String[] args) {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta",
                         "Sexta", "Sábado", "Domingo"};
                         
        int i = 0;
        System.out.println("--- Usando while ---");
        while (i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }
        
        i = 0;
        System.out.println("--- Usando do-while ---");
        do {
            System.out.println(dias[i]);
            i++;
        } while (i < dias.length);
        
        System.out.println("--- Usando for ---");
        for (int j = 0; j < dias.length; j++) {
            System.out.println(dias[j]);
        }
    }
}
