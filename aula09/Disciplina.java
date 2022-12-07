
/**
 * Classe que representa uma disciplina num sistema acadêmico.
 * 
 * @author Paulo
 * @version 30/11/2022
 */
public class Disciplina
{
    private String nome;
    private int creditos;

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCreditos() {
        return this.creditos;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
