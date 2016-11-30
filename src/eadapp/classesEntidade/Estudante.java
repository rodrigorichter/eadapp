package eadapp.classesEntidade;

import java.util.List;

public class Estudante extends Conta {
	private List<Curso> cursosInscritos;
        private List<Curso> cursosDiplomado;
        private List<Prova> provasRealizadas;
	
	public Estudante(String input_cpf, String input_senha,String input_email) {
		this.cpf = input_cpf;
		this.senha = input_senha;
		this.email = input_email;
                this.estaBanido = false;
                provasRealizadas = null;
		cursosInscritos = null;
                cursosDiplomado = null;
	} 
	
	public List<Curso> getCursosInscritos() {
		return this.cursosInscritos;
	}
}
