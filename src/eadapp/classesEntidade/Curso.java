/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eadapp.classesEntidade;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Rodrigo
 */
@Entity
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private List<Prova> provas;
    private String descricao;
    private String nome;
    private Professor professor;
    private List<String> links;
    private List<Estudante> alunosInscritos;
    private List<Estudante> alunosPediramInscricao;
    private List<Estudante> alunosPediramDiplomacao;
    private List<Estudante> alunosDiplomados;
    
    public Curso() {
        
    }

    public Curso(String nome, String descricao, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void addProva(Prova p) {
        provas.add(p);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eadapp.classesEntidade.cursoo[ id=" + id + " ]";
    }
    
    public void diplomarAluno(Estudante e) {
        Iterator<Estudante> iter = alunosPediramDiplomacao.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == e.getId()) {
                iter.remove();
            }
        }
        
        alunosDiplomados.add(e);
    }
    
    public List<Estudante> getAlunosDiplomados() {
        return this.alunosDiplomados;
    }
    
    public List<Estudante> getAlunosInscritos() {
        return this.alunosInscritos;
    }
    
    public List<Estudante> getAlunosPediramInscricao() {
        return this.alunosPediramInscricao;
    }
    
    public List<Estudante> getAlunosPediramDiplomacao() {
        return this.alunosPediramDiplomacao;
    }
    
    public void setDescricao(String d) {
        this.descricao = d;
    }
    
    public void inscreverAluno(Estudante e) {
        this.alunosInscritos.add(e);
    }
    
    public void removerAluno(Estudante e) {
        Iterator<Estudante> iter = alunosPediramDiplomacao.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == e.getId()) {
                iter.remove();
            }
        }
    }
    
    public void cadastrarPedidoDeInscricao(Estudante e) {
        this.alunosPediramInscricao.add(e);
    }
    
    public void cadastrarPedidoDeDiplomacao(Estudante e) {
        alunosPediramDiplomacao.add(e);
    }

    public String getNome() {
        return this.nome;
    }

    public List<String> getLinks() {
        return this.links;
    }
}
