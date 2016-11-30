/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eadapp.classesEntidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rodrigo
 */
@Entity
public abstract class Conta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    
    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;
    protected boolean estaBanido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
            return this.nome;
    }
    
    public String getCpf() {
            return this.cpf;
    }
    
    public String getEmail() {
            return this.email;
    }
    
    public String getSenha() {
            return this.senha;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public void setCpf(String c) {
        this.cpf = c;
    }
    
    public void setEmail(String e) {
        this.email = e;
    }
    
    public void setSenha(String s) {
        this.senha = s;
    }
    
    public int ChecarCorretudeCadastro(String nome, String cpf, String email, String senha, String senharepetida){
            if (senha != senharepetida){
                return 1; // senha repetida incorretamente
            }
            else{
                if (true == true){ // cpf ja existe no banco de dados
                        return 2;
                }
                else{
                    if (true == true){ // email ja existe no banco de dados
                        return 3;
                    }
                    else{
                        return 0; // TUDO ESTÁ CORRETO
                    }
                }
            }
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
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eadapp.classesEntidade.contaa[ id=" + id + " ]";
    }

}