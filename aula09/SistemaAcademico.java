import java.util.ArrayList;
/**
 * Escreva uma descrição da classe SistemaAcademico aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class SistemaAcademico
{
    public static void main(String[] args) {
        Professor prof = new Professor();
        Disciplina disc = new Disciplina();
        disc.setNome("POO");
        disc.setCreditos(4);
        prof.setNome("Prof1");
        prof.setMatricula("202200001");
        prof.setDisciplina(disc);
        
        //prof.imprimirDados();
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Aluno1");
        aluno1.setMatricula("202200002");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Aluno2");
        aluno2.setMatricula("202200003");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Aluno3");
        aluno3.setMatricula("202200004");
        
        aluno1.setNotas(new double[]{7.5, 6.0, 8.0});
        aluno2.setNotas(new double[]{9.5, 10, 9.0});
        aluno3.setNotas(new double[]{5.5, 7, 4.0});
        
        Tecnico tec = new Tecnico();
        tec.setNome("Tecnico1");
        tec.setMatricula("202200005");
        tec.setUnidade("UNIND");
        
        //tec.imprimirDados();
        
        ArrayList<Pessoa> listaAcademica = new ArrayList<>();
        listaAcademica.add(prof);
        listaAcademica.add(aluno1);
        listaAcademica.add(aluno2);
        listaAcademica.add(aluno3);
        listaAcademica.add(tec);
        
        for (Pessoa pessoa : listaAcademica) {
            pessoa.imprimirDados();
        }
        
        System.out.println("Média aluno1: " + aluno1.calcularMedia());
        System.out.println("Média aluno2: " + aluno2.calcularMedia());
        System.out.println("Média especial aluno3: " + 
                            aluno3.calcularMedia(new double[]{7, 8, 9}));
    }
}
