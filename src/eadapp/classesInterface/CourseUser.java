package eadapp.classesInterface;


import eadapp.classesEntidade.Curso;
	import eadapp.classesEntidade.Administrador;
	import eadapp.classesEntidade.Professor;
	import eadapp.classesEntidade.Estudante;
	import eadapp.classesEntidade.Conta;
	import eadapp.OLD.data.Database;
import java.util.Iterator;

public class CourseUser {
	
	
	public void iniciarProva(){
		
	}
	public void entregarProva(){
		
	}
	public void pedirInscricao(Curso c, Estudante e){
            c.cadastrarPedidoDeInscricao(e);
	}
	public void sairDoCurso(Curso c, Estudante e){
            c.removerAluno(e);
	}
	public void pedirDiplomacao(Curso c, Estudante e){
            c.cadastrarPedidoDeDiplomacao(e);
	}
	public int visualizarEstadoAtual(Curso c, Estudante e){
            Iterator<Estudante> iter = c.getAlunosPediramInscricao().iterator();
            while (iter.hasNext()) {
                if (iter.next().getId() == e.getId()) {
                    return 0;
                }
            }
            
            Iterator<Estudante> iter2 = c.getAlunosInscritos().iterator();
            while (iter2.hasNext()) {
                if (iter2.next().getId() == e.getId()) {
                    return 1;
                }
            }
            
            Iterator<Estudante> iter3 = c.getAlunosPediramDiplomacao().iterator();
            while (iter3.hasNext()) {
                if (iter3.next().getId() == e.getId()) {
                    return 2;
                }
            }
            
            Iterator<Estudante> iter4 = c.getAlunosDiplomados().iterator();
            while (iter4.hasNext()) {
                if (iter4.next().getId() == e.getId()) {
                    return 3;
                }
            }
            return -1;
	}
	
}
