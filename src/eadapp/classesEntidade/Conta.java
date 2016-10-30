package eadapp.classesEntidade;

public class Conta {
	protected int id;
	protected String nome;
	protected String cpf;
	protected String email;
	protected String senha;
	
	
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
	
}
