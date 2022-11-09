
/**
 * Atividade colaborativa aula 06 - BMQuestao3
 * 
 * @author Paulo
 * @version 09/11/2022
 */
public class BMQuestao3
{
    String nomeDoCorrentista;
    float saldo;
    boolean contaEEspecial;
    
    void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0.0f;
        contaEEspecial = false;
    }
    
    void deposita(float valor) {
        saldo += valor;
    }
    
    boolean retira(float valor) {
        boolean sucesso = false;
        
        if (!contaEEspecial) {
            if (valor <= saldo) {
                saldo -= valor;
                sucesso = true;
            }
        } else {
            saldo -= valor;
            sucesso = true;
        }
        
        return sucesso;
    }
    
    void mostraDados() {
        System.out.println("O nome do(a) correntista é: ");
        System.out.println(nomeDoCorrentista);
        System.out.println("O saldo é: ");
        System.out.println(saldo);
        
        System.out.print("A conta é ");
        System.out.println(contaEEspecial ? "especial." : "comum.");
        
        if (saldo < 0 && contaEEspecial) {
            System.out.println("Saldo negativo!!!");
        }
    }
}
