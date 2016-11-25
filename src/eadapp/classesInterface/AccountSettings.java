package eadapp.classesInterface;


import java.util.List;

import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Administrador;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Estudante;
import eadapp.classesEntidade.Conta;
import eadapp.data.Database;

public class AccountSettings {
	
	public Conta login(String email, String senha, Database database){
		/*
		 * procura na lista de contas da database uma conta com um email e 
		 * senha especificos e devolve esta conta na sa�da do m�todo
		 */
		
		
		Conta umaConta = new Estudante("","","");
		return umaConta;
	}
	
	
	
	public void criarContaEstudante(String input_cpf, String input_senha, String input_email,Database dataBase){
		/* usuario insere na janela o cpf e senha desejados,
		 * ent�o esta interface insere um novo estudante na lista
		 * de estudantes da database do sistema
		 * 
		 */
		
		Estudante novoEstudante = new Estudante(input_cpf,input_senha, input_email);
		dataBase.add(novoEstudante);
	}
		
	public void recuperarSenha(String email, Conta umaConta){
		if (email == umaConta.getEmail()){
			//envia uma mensagem para o email, com a op��o de trocar a senha
		}
	}
	
	public List<Curso> visualizarCursosInscritos(Estudante umEstudante){
		return umEstudante.getCursosInscritos();
	}
	
	public List<Curso> visualizarCursosMinistrados(Professor umProfessor){
		return umProfessor.getCursosMinistrados();
	}
	
	public List<Curso> buscarCursos(Database database){
		/*devolve a lista de cursos para que eles possam ser mostrados
		 * na interface gr�fica
		 */
		List<Curso> cursosDisponiveis = database.getCursos();
		return cursosDisponiveis;
	}
	public void buscarSuporte(){
		/*
		 * busca na lista de admins, um admin que esteja disponivel para
		 * contato [estaDisponivel == true]
		 */
	}
	
	public String visualizarDados(Conta umaConta){
		String info = new String();
		info = info.concat(umaConta.getCpf());
		info = info.concat(umaConta.getNome());
		
		return info;
	}
	public void editarPerfil(){
		
	}
}