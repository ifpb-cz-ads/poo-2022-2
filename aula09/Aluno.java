
/**
 * Classe que representa um Aluno num sistema acadêmico.
 * 
 * @author Paulo
 * @version 30/11/2022
 */
public class Aluno extends Pessoa
{
    private double[] notas = new double[3];
    
    public double[] getNotas() {
        return this.notas;
    }
    
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia() {
        double sum = 0;
        for (double d : this.notas) {
            sum += d;
        }
        
        return sum / 3;
    }
    
    public double calcularMedia(double[] notasEspeciais) {
        double sum = 0;
        for (double d : notasEspeciais) {
            sum += d;
        }
        
        return sum / notasEspeciais.length;
    }
    
}
