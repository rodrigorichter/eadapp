package eadapp.classesInterface;

import eadapp.data.Database;

public class AccountSettings {
	
	public void criarConta(String input_cpf, String input_senha, Database dataBase){
		/* usuario insere na janela o cpf e senha desejados,
		 * então esta interface insere um novo estudante na lista
		 * de estudantes da database do sistema
		 * 
		 */
		
		Estudante novoEstudante = new Estudante(input_cpf,input_senha);
		dataBase.add(novoEstudante);
	}
		
	public void recuperarSenha(){
		
	}
	
	public void visualizarCursosAtuais(){
		
	}
	public void buscarCursos(){
		
	}
	public void buscarSuporte(){
		
	}
	
	public void visualizarDados(){
		
	}
	public void editarPerfil(){
		
	}
}