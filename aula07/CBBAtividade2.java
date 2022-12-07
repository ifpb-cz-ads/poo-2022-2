
/**
 * Atividade colaborativa 07.03 CBBAtividade2.
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class CBBAtividade2
{
    public static void main(String[] args) {
        int[] nums = new int[100];
        int j = 1;
        
        for (int i = 0; i < 100; i++) {
            nums[i] = j++;
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
