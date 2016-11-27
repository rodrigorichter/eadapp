package eadapp.classesEntidade;

import java.util.List;

public class Professor extends Conta{
	private List<Curso> cursosMinistrados;
	
	public Professor(String input_cpf, String input_senha,String input_email) {
		this.cpf = input_cpf;
		this.senha = input_senha;
		this.email = input_email;
                this.id = 0;
	} 
        
        public Professor(int id, String nome, String cpf, String email, String senha) {
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.senha = senha;
	} 
	
	public List<Curso> getCursosMinistrados() {
		return this.cursosMinistrados;
	}
}
