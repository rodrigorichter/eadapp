package eadapp.classesEntidade;

import java.util.List;

public class Estudante extends Conta {
	private List<Curso> cursosInscritos;
	
	public Estudante(String input_cpf, String input_senha,String input_email) {
		this.cpf = input_cpf;
		this.senha = input_senha;
		this.email = input_email;
		cursosInscritos = null;
	} 
	
	public List<Curso> getCursosInscritos() {
		return this.cursosInscritos;
	}
}
