package eadapp.classesInterface;


import static eadapp.EadApp.em;
import java.util.List;

import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Administrador;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Estudante;
import eadapp.classesEntidade.Conta;
//import eadapp.data.Database;
import java.sql.SQLException;
import java.util.Iterator;

public class AccountSettings {
	
public Conta login(String email, String senha){
            /*
             * procura na lista de contas da database uma conta com um email e 
             * senha especificos e devolve esta conta na sa�da do m�todo
             
 */
            List<Conta> contas = em.createQuery("Select c From Conta c",
                                                    Conta.class).getResultList();

            Iterator<Conta> iter = contas.iterator();
            while (iter.hasNext()) {
                Conta c = iter.next();
                if (c.getId() != null && c.getEmail() != null && c.getSenha() != null) {
                    if (c.getEmail().equals(email)) {
                        if (c.getSenha().equals(senha)) {
                            return c;
                        }
                    }
                }
            }
            return null;
   
          
	}
	
	
	
	public void criarContaEstudante(String input_cpf, String input_senha, String input_email) throws SQLException{
            /* usuario insere na janela o cpf e senha desejados,
             * ent�o esta interface insere um novo estudante na lista
             * de estudantes da database do sistema
             * 
             */

            Estudante e = new Estudante(input_cpf,input_senha,input_email);
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
	}
		
	public void recuperarSenha(String email, Conta umaConta){
		if (email.equals(umaConta.getEmail())){
			//envia uma mensagem para o email, com a op��o de trocar a senha
		}
	}
	
	public List<Curso> visualizarCursosInscritos(Estudante umEstudante){
		return umEstudante.getCursosInscritos();
	}
	
	public List<Curso> visualizarCursosMinistrados(Professor umProfessor){
		return umProfessor.getCursosMinistrados();
	}
	
	public List<Curso> buscarCursos() throws SQLException{
		/*devolve a lista de cursos para que eles possam ser mostrados
		 * na interface gr�fica
		 */
            List<Curso> cursos = em.createQuery("SELECT c FROM Curso c").getResultList();
            return cursos;
	}
	public void buscarSuporte(){
		/*
		 * busca na lista de admins, um admin que esteja disponivel para
		 * contato [estaDisponivel == true]
		 */
	}
	
	public String visualizarDados(Conta umaConta){
		String info = new String();
		info = info.concat(umaConta.getCpf());
		info = info.concat(umaConta.getNome());
		
		return info;
	}
	public void editarPerfil(){
		
	}
}