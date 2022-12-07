
import java.util.Scanner;
/**
 * Atividade colaborativa 07.03 - CBBAtividade6.
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class CBBAtividade6
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        
        int maior = 0;
        int j = 0;
        while (j < nums.length) {
            System.out.println("Digite um número inteiro: ");
            int num = scan.nextInt();
            nums[j] = num;
            
            if (num > maior) {
                maior = num;
            }
            j++;
        }
        
        System.out.println("Números digitados: ");
        for (int i = 0; i < nums.length; i++) {            
            System.out.println(nums[i]);
        }
        
        System.out.println("O maior número foi: " + maior);
    }
}
