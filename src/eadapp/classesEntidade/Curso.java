package eadapp.classesEntidade;

import java.util.List;

public class Curso{
	private List<Prova> provas;
	private String descricao;
	private String nome;
	private Professor professor;
        private List<String> links;
        private List<Estudante> alunosInscritos;
        private List<Estudante> alunosPediramInscricao;
        private List<Estudante> alunosPediramDiplomacao;
        private List<Estudante> alunosDiplomados;
	
	public Curso(String nome, String descricao, Professor professor){
		this.descricao = descricao;
		this.nome = nome;
		this.professor = professor;
                this.links = null;
                this.provas = null;
	}
	
	public void add(Prova p) {
		this.provas.add(p);
	}
	
	public void setDescricao(String d){
		this.descricao = d;
	}
	public String getNome(){
		return this.nome;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	public List<Prova> getProvas(){
		return this.provas;
	}
}
