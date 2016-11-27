package eadapp.classesEntidade;

import java.util.HashMap;
import java.util.Map;

public class Prova {
    private int id;
    private Curso curso;
	private Map<String, String> questoes;
	private int tempoMaximo;
	
	
	
	public Prova(int tempoMaximo, int numeroQuestoes){
		this.questoes = new HashMap<>();
		this.tempoMaximo = tempoMaximo;
	}

    public Prova(int id, Curso c, Map<String, String> questoes, int tempomaximo) {
        this.id = id;
        this.curso = c;
        this.questoes = questoes;
    }
	
	public void adicionarQuestao(int nQuestao, String pergunta, String resposta){
		questoes.put(pergunta, resposta);
	}
        
        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id = id;
        }
}
