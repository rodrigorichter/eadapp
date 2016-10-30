package eadapp.classesEntidade;

public class Administrador extends Conta {
	private boolean estaDisponivel;
	
	
	public Administrador(String input_cpf, String input_senha,String input_email) {
		this.cpf = input_cpf;
		this.senha = input_senha;
		this.email = input_email;
	} 
	
	
	public boolean getEstaDisponivel() {
		return estaDisponivel;
	}
}
