
/**
 * Atividade colaborativa aula 6 - BMQuestao5
 * 
 * @author Paulo
 * @version 09/11/2022
 */
public class BMQuestao5
{
    String nome;
    Jogador[] jogadores;
    Treinador treinador;
    
    void substituirJogador(Jogador jogadorSubstituto, int posicao) {
        jogadores[posicao] = jogadorSubstituto;
    }
    
    void adicionarJogador(int posicao) {
        Jogador jogador = new Jogador();
        jogadores[posicao] = jogador;
    }
    
    void posicionarJogador(int posicao, Jogador jogador) {
        jogadores[posicao] = jogador;
    }
    
    void inscreverLiga(String liga) {
        System.out.println("Time inscrito na liga " + liga);
    }
    
    void substituirTreinador() {
        Treinador treinador = new Treinador();
        treinador.nome = "Treinador 1";
        treinador.salario = 20000;
        
        treinador = treinador;
    }
    
}
