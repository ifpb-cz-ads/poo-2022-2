
/**
 * Atividade colaborativa 8.03 CTQuestao1
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class Conta
{
    private int numero;
    private String nomeTitular;
    private double saldo;
    
    public Conta() {}
    
    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
    }
    
    public void depositar(double valor) {
        this.saldo = this.getSaldo() + valor;
    }
    
    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getNomeTitular() {
        return this.nomeTitular;
    }
    
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
