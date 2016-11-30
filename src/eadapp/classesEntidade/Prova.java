/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eadapp.classesEntidade;


import java.io.Serializable;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rodrigo
 */
@Entity
public class Prova implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Curso curso;
    private Map<String, String> questoes;
    private int tempoMaximo;
    private boolean estaDisponivel;
    
    public Prova() {
        
    }

    public Prova(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Prova)) {
            return false;
        }
        Prova other = (Prova) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eadapp.classesEntidade.provaa[ id=" + id + " ]";
    }
    
    public void adicionarQuestao(int nQuestao, String pergunta, String resposta){
		questoes.put(pergunta, resposta);
    }
}
