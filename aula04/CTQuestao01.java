
/**
 * Atividade colaborativa 04 - CTQuestao01
 * 
 * @author Paulo Ewerton
 * @version 26/10/2022
 */
public class CTQuestao01
{
    public static void main(String[] args) {
        int idadeEleitor = 68;
        
        if (idadeEleitor < 16) {
            System.out.println("Eleitor(a) não pode votar.");
        } else if ((idadeEleitor <= 17) || (idadeEleitor > 65)) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}
