package eadapp.classesEntidade;

import java.util.List;

public class Estudante {
	private int id;
	private String nome;
	private String cpf;
	private String senha;
	private List<Curso> cursosInscrito;
	
	public Estudante(String input_cpf, String input_senha) {
		this.cpf = input_cpf;
		this.senha = input_senha;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}
}
