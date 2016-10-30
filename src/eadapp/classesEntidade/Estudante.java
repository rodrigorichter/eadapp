package eadapp.classesEntidade;

import java.util.List;

public class Estudante {
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private List<Curso> cursosInscrito;
	
	public Estudante(String input_cpf, String input_senha,String input_email) {
		this.cpf = input_cpf;
		this.senha = input_senha;
		this.email = input_email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public String getNome() {
		return this.nome;
	}
	public List<Curso> getCursosInscrito() {
		return this.cursosInscrito;
	}
}
