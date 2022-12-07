
/**
 * Classe que representa um servidor público
 * em um sistema acadêmico.
 * 
 * @author Paulo
 * @version 30/11/2022
 */
public class Servidor extends Pessoa
{
    private String unidade;
    
    public String getUnidade() {
        return this.unidade;
    }
    
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public String toString() {
        return super.toString() + " Unidade: " + this.unidade;
    }
}
