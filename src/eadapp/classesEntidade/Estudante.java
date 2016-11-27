package eadapp.classesEntidade;

import java.util.List;

public class Estudante extends Conta {
	private List<Curso> cursosInscritos;
	
	public Estudante(String input_cpf, String input_senha,String input_email) {
		this.cpf = input_cpf;
		this.senha = input_senha;
		this.email = input_email;
		cursosInscritos = null;
                this.id = 0;
	} 

    public Estudante(int id, String nome, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
    }
	
	public List<Curso> getCursosInscritos() {
		return this.cursosInscritos;
	}
        
}
