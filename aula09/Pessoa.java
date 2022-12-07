
/**
 * Classe que representa uma Pessoa em um sistema acadêmico.
 * 
 * @author Paulo Ewerton
 * @version 30/11/2022
 */
public class Pessoa
{
    private String nome;
    private String matricula;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    // sobrescrito de Object
    public String toString() {
        String str = "Nome: " + this.nome + " " +
                     "Matricula: " + this.matricula;
        return str;
    }
    
    public void imprimirDados() {
        this.toString();
    }
}
