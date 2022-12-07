
/**
 * Atividade colaborativa 8.03 BMQuestao5.
 * 
 * @author Paulo
 * @version 07/12/2022
 */
public class Computador extends Equipamento
{
    private int ram;
    private double frequenciaCpu;
    
    // BMQuestao6
    public int getRam() {
        return this.ram;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public double getFrequenciaCpu() {
        return this.frequenciaCpu;
    }
    
    public void setFrequenciaCpu(double frequenciaCpu) {
        this.frequenciaCpu = frequenciaCpu;
    }
}
