package eadapp.classesEntidade;

import java.util.List;

public class Professor extends Conta{
	private List<Curso> cursosMinistrados;
	
	public Professor(String input_cpf, String input_senha,String input_email) {
		this.cpf = input_cpf;
		this.senha = input_senha;
		this.email = input_email;
                this.estaBanido = false;
	} 
	
	public List<Curso> getCursosMinistrados() {
		return this.cursosMinistrados;
	}
}
