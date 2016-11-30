package eadapp.classesEntidade;

import java.util.List;

public class Prova {
	private List<Questao> questoes;
	private int tempoMaximo;
        private boolean estaDisponivel;
	
	
	
	public Prova(int tempoMaximo, int numeroQuestoes){
		this.questoes = null;
		this.tempoMaximo = tempoMaximo;
                this.estaDisponivel = true; 
	}
	
	public void adicionarQuestao(int nQuestao, String pergunta, String resposta){
		
	}
}
