package eadapp.classesInterface;


import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Administrador;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Estudante;
import eadapp.classesEntidade.Conta;
import eadapp.data.Database;
import java.sql.SQLException;


public class AdmSettings {
	
	
	
	public void banirAluno(){
		
	}
	public void visualizarDadosConta(){
		
	}
	public void criarPromocao(){
		
	}
	public void criarNoticia(){
		
	}
	public void criarContaProfessor(){
		
	}
	public void banirProfessor(){
		
	}
	public void criarCurso(Database database, String descricao, String nome, Professor professor) throws SQLException{
		Curso novoCurso = new Curso(nome, descricao, professor);
		database.add(novoCurso);
	}
}
