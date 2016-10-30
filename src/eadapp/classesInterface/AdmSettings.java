package eadapp.classesInterface;

public class AdmSettings {
	
	import eadapp.classesEntidade.Curso;
	import eadapp.classesEntidade.Administrador;
	import eadapp.classesEntidade.Professor;
	import eadapp.classesEntidade.Estudante;
	import eadapp.classesEntidade.Conta;
	import eadapp.data.Database;
	
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
	public void criarCurso(Database database, String descricao, String nome, Professor professor){
		Curso novoCurso = new Curso(nome, descricao, professor);
		database.add(novoCurso);
	}
}
