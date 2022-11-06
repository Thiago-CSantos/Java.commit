package entidade;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String email;
	private Date dataNascimento;
	
	public Cliente() {
	}
	
	public Cliente(String nome2, String email2, Date dataNascimento2){
		this.nome = nome2;
		this.email = email2;
		this.dataNascimento = dataNascimento2;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
