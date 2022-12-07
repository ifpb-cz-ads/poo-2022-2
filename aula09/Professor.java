
/**
 * Classe que representa um docente em um sistema acadêmico.
 * 
 * @author Paulo
 * @version 30/11/2022
 */
public class Professor extends Servidor
{
    private Disciplina disciplina;
    
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    // método sobrescrito de Pessoa
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Disciplina: " + this.disciplina.getNome());
    }
}
