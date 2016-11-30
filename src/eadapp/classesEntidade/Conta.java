package eadapp.classesEntidade;

public class Conta {
	protected int id;
	protected String nome;
	protected String cpf;
	protected String email;
	protected String senha;
        protected boolean estaBanido;
       
        
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
	
	
	public String getEmail() {
		return this.email;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public String getNome() {
		return this.nome;
	}
	
}
