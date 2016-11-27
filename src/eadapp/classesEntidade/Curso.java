package eadapp.classesEntidade;

import java.util.List;

public class Curso{
    private int id;
	private List<Prova> provas;
	private String descricao;
	private String nome;
	private Professor professor;
	
	public Curso(String nome, String descricao, Professor professor){
		this.descricao = descricao;
		this.nome = nome;
		this.professor = professor;
	}
        
        public Curso(int id, String nome, String descricao, Professor professor){
            this.id = id;
		this.descricao = descricao;
		this.nome = nome;
		this.professor = professor;
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
        public Professor getProfessor(){
            return this.professor;
        }
        public int getId(){
            return this.id;
        }
}
