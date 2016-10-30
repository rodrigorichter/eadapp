package eadapp.classesInterface;


import java.util.List;

import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Estudante;
import eadapp.data.Database;

public class AccountSettings {
	
	public void criarConta(String input_cpf, String input_senha, String input_email,Database dataBase){
		/* usuario insere na janela o cpf e senha desejados,
		 * então esta interface insere um novo estudante na lista
		 * de estudantes da database do sistema
		 * 
		 */
		
		Estudante novoEstudante = new Estudante(input_cpf,input_senha, input_email);
		dataBase.add(novoEstudante);
	}
		
	public void recuperarSenha(String email, Estudante umEstudante){
		if (email == umEstudante.getEmail()){
			//envia uma mensagem para o email, com a opção de trocar a senha
		}
	}
	
	public List<Curso> visualizarCursosAtuais(Estudante umEstudante){
		return umEstudante.getCursosInscrito();
	}
	
	public List<Curso> buscarCursos(Database database){
		/*devolve a lista de cursos para que eles possam ser mostrados
		 * na interface gráfica
		 */
		List<Curso> cursosDisponiveis = database.getCursos();
		return cursosDisponiveis;
	}
	public void buscarSuporte(Estudante umEstudante){
		/*
		 * busca na lista de admins, um admin que esteja disponível para
		 * contato [estaDisponivel == true]
		 */
	}
	
	public String visualizarDados(Estudante umEstudante){
		String info = new String();
		info = info.concat(umEstudante.getCpf());
		info = info.concat(umEstudante.getNome());
		
		return info;
	}
	public void editarPerfil(){
		
	}
}