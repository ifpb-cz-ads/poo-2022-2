
/**
 * Atividade colaborativa 8.03 CTQuestao1
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class ContaPoupanca extends Conta
{
    public ContaPoupanca() {}
    
    public ContaPoupanca(int numero, String nomeTitular) {
        super(numero, nomeTitular);
    }
    
    public void reajustar(double percentual) {
        double reajuste = this.getSaldo() * percentual;
        this.depositar(reajuste);
    }
}
