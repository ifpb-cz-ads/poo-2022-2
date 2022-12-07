
/**
 * Atividade colaborativa 8.03 CTQuestao1
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class ContaEspecial extends Conta
{
    private double limite;
    
    public ContaEspecial() {}
    
    public ContaEspecial(int numero, String nomeTitular, double limite) {
        super(numero, nomeTitular);
        this.limite = limite;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public boolean sacar(double valor) {
        if (this.getSaldo() + this.limite >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
