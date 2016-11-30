package eadapp.OLD.data;


import eadapp.classesEntidade.Conta;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Administrador;
import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Estudante;
import eadapp.classesEntidade.Prova;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
        private Connection conn;
	
	public Database() throws SQLException {
		this(true);
	}

	public Database(boolean initData) throws SQLException {

            String URL = "jdbc:derby:db";
            String USER = "ead";
            String PASS = "app";
            try {
                this.conn = DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
/*
            if (initData) {
                    initData();
            }*/
	}
	/*
	public List<Estudante> getEstudantes() throws SQLException {
            List<Estudante> estudantes = new ArrayList<Estudante>();
            Statement statement = conn.createStatement();
            
            statement.executeQuery("SELECT id, nome, cpf, email, senha FROM conta WHERE classe = 'E'");
            ResultSet rs = statement.getResultSet();
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                
                Estudante e = new Estudante(id,nome,cpf,email,senha);
                estudantes.add(e);
            }
            rs.close();
            statement.close();
            
            return estudantes;
	}
	
	public List<Professor> getProfessores() throws SQLException {
            List<Professor> professores = new ArrayList<>();
            Statement statement = conn.createStatement();
            
            statement.executeQuery("SELECT id, nome, cpf, email, senha FROM conta WHERE classe = 'P'");
            ResultSet rs = statement.getResultSet();
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                
                Professor p = new Professor(id,nome,cpf,email,senha);
                professores.add(p);
            }
            rs.close();
            statement.close();
            
            return professores;
	}
	
	public List<Administrador> getAdministradores() {
		return null;
	}

	public List<Curso> getCursos() throws SQLException {
            List<Curso> cursos = new ArrayList<Curso>();
            Statement statement = conn.createStatement();
            
            statement.executeQuery("SELECT id, descricao, nome, professor_id FROM curso");
            ResultSet rs = statement.getResultSet();
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String nome = rs.getString("nome");
                int professor_id = rs.getInt("professor_id");
                
                List<Professor> professores = this.getProfessores();
                Professor prof = null;
                for (Professor p : professores) {
                    if (p.getId() == professor_id) {
                        prof = p;
                    }
                }
                
                Curso c = new Curso(id, descricao, nome, prof);
                cursos.add(c);
            }
            
            rs.close();
            statement.close();
            
            return cursos;
	}
        
        public List<Prova> getProvas(Curso c) throws SQLException {
            List<Prova> provas = new ArrayList<Prova>();
            Statement statement = conn.createStatement();
            
            statement.executeQuery("SELECT id,tempomaximo FROM questao WHERE prova_id = "+c.getId());
            ResultSet rs = statement.getResultSet();
            
            while(rs.next()) {
                int id = rs.getInt("id");
                int tempomaximo = rs.getInt("tempomaximo");
                Map<String,String> questoes = new HashMap<>();
                
                Prova provaStub = new Prova(0,0);
                provaStub.setId(id);
                questoes = this.getQuestoes(provaStub);
                
                Prova p = new Prova(id,c,questoes,tempomaximo);
            }
            rs.close();
            statement.close();
            
            return provas;
	}
        
        public Map<String,String> getQuestoes(Prova pr) throws SQLException {
            Map<String,String> questoes = new HashMap<>();
            Statement statement = conn.createStatement();
            
            statement.executeQuery("SELECT pergunta, resposta FROM questao WHERE prova_id = "+pr.getId());
            ResultSet rs = statement.getResultSet();
            
            while(rs.next()) {
                String pergunta = rs.getString("pergunta");
                String resposta = rs.getString("resposta");
                questoes.put(pergunta,resposta);
            }
            rs.close();
            statement.close();
            
            return questoes;
	}
	
	public void add(Estudante e) throws SQLException {
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO conta(nome , cpf , email , senha , classe) " + "VALUES ('"+e.getNome()+"','"
                                                                                                           +e.getCpf()+"','"
                                                                                                           +e.getEmail()+"','"
                                                                                                           +e.getSenha()+"','E')");
	}
	
	public void add(Professor p) throws SQLException {
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO conta(nome , cpf , email , senha , classe) " + "VALUES ('"+p.getNome()+"','"
                                                                                                           +p.getCpf()+"','"
                                                                                                           +p.getEmail()+"','"
                                                                                                           +p.getSenha()+"','P')");
	}
	
	public void add(Administrador a) throws SQLException {
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO conta(nome , cpf , email , senha , classe) " + "VALUES ('"+a.getNome()+"','"
                                                                                                           +a.getCpf()+"','"
                                                                                                           +a.getEmail()+"','"
                                                                                                           +a.getSenha()+"','E')");
	}
	
	public void add(Curso c) throws SQLException {
            int prof_id = c.getProfessor().getId();
            
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO curso(descricao,nome,profssor_id) " + "VALUES ('"+c.getDescricao()+"','"
                                                                                                           +c.getNome()+"','"
                                                                                                           +prof_id+"')");
	}
        
        public void update(Estudante e) throws SQLException {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE conta SET nome='"+e.getNome()+"',cpf='"+e.getCpf()+"',email='"+e.getEmail()+"',senha='"+e.getSenha()+"' WHERE id='"+e.getId()+"'");
            statement.executeUpdate("DELETE FROM inscricao WHERE estudante_id = "+e.getId());
            
            e.getCursosInscritos().forEach((c) -> {
                try {
                    statement.executeUpdate("INSERT INTO inscricao(estudante_id,curso_id) "+"VALUES ('"+e.getId()+"','"+c.getId()+"')");
                } catch (SQLException ex) {
                    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
        
        
        
        
        

	private void initData() throws SQLException {
            Estudante c = new Estudante("12345678910","123456","mrcatraarroba");
            add(c);
            List<Estudante> est = this.getEstudantes();
            est.forEach((e) -> {
                System.out.println(e.getCpf());
            });
		
	}
*/
}
