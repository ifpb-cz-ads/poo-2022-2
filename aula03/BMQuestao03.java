
/**
 * Atividade colaborativa 2, BMQuestao03
 * 
 * @author Paulo 
 * @version 19/10/2022
 */
public class BMQuestao03
{
    public static void main(String[] args) {
        // letra a
        double itemDeVenda01 = 2.95;
        double itemDeVenda02 = 3.50;
        
        // letra b
        System.out.println("O item 1 custa R$ " + itemDeVenda01 + " " +
                           "e o item 2 custa R$ " + itemDeVenda02 + ".");
                           
        // letra c
        double total = itemDeVenda01 + itemDeVenda02;
        System.out.println("O custo total dos itens é R$ " + total + ".");
        
        // letra d
        double taxa = 0.0825;
        double taxaCalculada = total * taxa; 
        System.out.println("A taxa calculada a partir do total é de R$ " +
                           taxaCalculada + ".");
                           
        // letra e
        itemDeVenda01 += taxaCalculada; // itemDeVenda01 = itemDeVenda01 + taxaCalculada
        itemDeVenda02 += taxaCalculada;
        double novoCusto = itemDeVenda01 + itemDeVenda02;
        System.out.println("O custo de venda com a taxa é de R$ " + novoCusto);
        
        // letra f
        boolean muitoCaro = (novoCusto > 10);
        System.out.println("O custo total está caro? " + muitoCaro);
    }
}
