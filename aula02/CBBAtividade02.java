
/**
 * Atividade colaborativa 2, questao CBBAtividade2
 * 
 * @author Paulo
 * @version 19/10/2022
 */
public class CBBAtividade02
{
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        
        int QTDE = 3;
        
        int soma = num1 + num2 + num3;
        int media = soma / QTDE;
        double mediaExata = soma / QTDE;
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da média: " + media);
        System.out.println("Resultado da média (decimal): " + mediaExata);
    }
}
