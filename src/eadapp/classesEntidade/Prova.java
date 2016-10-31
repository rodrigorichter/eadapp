package eadapp.classesEntidade;

public class Prova {
	private String[][] questoes;
	private int tempoMaximo;
	
	
	
	public Prova(int tempoMaximo, int numeroQuestoes){
		this.questoes = new String[numeroQuestoes][2];
		this.tempoMaximo = tempoMaximo;
	}
	
	public void adicionarQuestao(int nQuestao, String pergunta, String resposta){
		questoes[nQuestao][0]= pergunta;
		questoes[nQuestao][1]= resposta;
	}
}
