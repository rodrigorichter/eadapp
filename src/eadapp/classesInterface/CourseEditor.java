package eadapp.classesInterface;


import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Administrador;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Prova;
import eadapp.classesEntidade.Estudante;
import eadapp.classesEntidade.Conta;
import eadapp.data.Database;

public class CourseEditor {
	public void adicionarLink(){
		
	}	
	public void criarProva(int tempoMaximo, int numeroQuestoes, Curso umCurso){
		Prova novaProva = new Prova(tempoMaximo,numeroQuestoes);
		umCurso.add(novaProva);

	}	
	public void adicionarQuestaoProva(int nQuestao, String pergunta, String resposta, Prova umaProva){
		umaProva.adicionarQuestao(nQuestao, pergunta, resposta);
	}	
	public void visualizarPedidoDiplo(){
		
	}	
	public void concederDiplomacao(){
		
	}	
	public void editarDescCurso(){
		
	}	
	public void adicionarAluno(){
		
	}
}
