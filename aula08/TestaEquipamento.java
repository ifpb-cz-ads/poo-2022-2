
/**
 * Atividade colaborativa 8.03 BMQuestao6.
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class TestaEquipamento
{
    public static void main(String[] args) {
        // BMQuestao7
        Equipamento equipamento = new Equipamento();
        equipamento.setModelo("Impressora");
        equipamento.setPreco(1500);
        
        Computador comp = new Computador();
        comp.setModelo("Dell XPS");
        comp.setPreco(6999);
        comp.setRam(16);
        comp.setFrequenciaCpu(2.87);
        
        //BMQuestao8
        System.out.println("Modelo do equipamento: " + equipamento.getModelo());
        System.out.println("Preço do equipamento: R$ " + equipamento.getPreco());
        System.out.println("Modelo do Computador: " + comp.getModelo());
        System.out.println("Preço do Computador: R$ " + comp.getPreco());
        System.out.println("RAM do Computador: " + comp.getRam() + "GB");
        System.out.println("Frequência da CPU do Computador: " + 
                                comp.getFrequenciaCpu() + "GHz");
    }
}
