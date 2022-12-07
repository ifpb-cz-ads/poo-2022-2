
/**
 * Classe que representa um TAE em um sistema acadêmico.
 * 
 * @author Paulo
 * @version 30/11/2022
 */
public class Tecnico extends Servidor
{
    public void atenderAoPublico() {
        System.out.println("Em atendimento");
    }
    
    // metodo herdado de Pessoa
    public void imprimirDados() {
        super.imprimirDados();
        // metodo herdado de Servidor
        System.out.println("Unidade: " + this.getUnidade());
    }
}
