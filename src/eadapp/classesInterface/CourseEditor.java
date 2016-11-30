package eadapp.classesInterface;


import static eadapp.EadApp.em;
import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Administrador;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Prova;
import eadapp.classesEntidade.Estudante;
import eadapp.classesEntidade.Conta;
import eadapp.OLD.data.Database;
import java.util.Iterator;
import javax.persistence.Query;

public class CourseEditor {
	public void adicionarLink(){
		
	}	
	public void criarProva(int tempoMaximo, int numeroQuestoes, Curso c) {
		Prova p = new Prova(tempoMaximo);
		Curso curso = em.find(Curso.class, c.getId());
                curso.addProva(p);

	}	
	public void adicionarQuestaoProva(int nQuestao, String pergunta, String resposta, Prova umaProva) {
		umaProva.adicionarQuestao(nQuestao, pergunta, resposta);
	}	
	public void visualizarPedidoDiplo() {
		
	}	
	public void concederDiplomacao(Curso c, Estudante e) {
            c.diplomarAluno(e);
	}	
	public void editarDescCurso(Curso c, String d) {
            c.setDescricao(d);
	}	
	public void adicionarAluno(Curso c, Estudante e) {
            c.inscreverAluno(e);
	}
}
