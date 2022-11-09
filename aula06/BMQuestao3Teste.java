
/**
 * Classe de teste para BMQuestao3
 * 
 * @author Paulo
 * @version 09/11/2022
 */
public class BMQuestao3Teste
{
    public static void main(String[] args) {
        BMQuestao3 conta1 = new BMQuestao3();
        conta1.abreContaSimples("Cliente 1");
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
