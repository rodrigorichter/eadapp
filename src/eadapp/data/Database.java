package eadapp.data;


import eadapp.classesEntidade.Conta;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Administrador;
import eadapp.classesEntidade.Curso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Database {
	private final ArrayList<Conta> estudantes;
	private final List<Professor> professores;
	private final List<Administrador> administradores;
	private final List<Curso> cursos;
	
	public Database() {
		this(true);
	}

	public Database(boolean initData) {
		this.estudantes = new ArrayList<Conta>();
		this.professores = new ArrayList<Professor>();
		this.administradores = new ArrayList<Administrador>();
		this.cursos = new ArrayList<Curso>();
		
		if (initData) {
			initData();
		}
	}
	
	public List<Conta> getEstudantes() {
		return this.estudantes;
	}
	
	public List<Professor> getProfessores() {
		return this.professores;
	}
	
	public List<Administrador> getAdministradores() {
		return this.administradores;
	}

	public List<Curso> getCursos() {
		return this.cursos;
	}
	
	public void add(Conta e) {
		this.estudantes.add(e);
	}
	
	public void add(Professor p) {
		this.professores.add(p);
	}
	
	public void add(Administrador a) {
		this.administradores.add(a);
	}
	
	public void add(Curso c) {
		this.cursos.add(c);
	}

	private void initData() {
		//Estudante e1 = new Estudante();
		//add(e1);
		
	}

}
