
/**
 * Classe de teste para BMQuestao3
 * 
 * @author Paulo
 * @version 09/11/2022
 */
public class BMQuestao6Teste
{
    public static void main(String[] args) {
        BMQuestao6 conta1 = new BMQuestao6();
        conta1.abreContaSimples("Cliente 1", 50f);
        conta1.mostraDados();
        conta1.saldo = 100f;
        conta1.mostraDados();
        conta1.retira(50f);
        conta1.mostraDados();
        conta1.contaEEspecial = true;
        conta1.retira(70f);
        conta1.mostraDados();
        // System.out.println(String.format("%f.2", saldo))
    }
}
