package entidade;

public class Cliente {
	
	private int id;
	private String nome;
	private int idade;

	public Cliente() {
		// TODO Stub de construtor gerado automaticamente
	}
	
	public Cliente(int id2, String nome2, int idade2) {
		this.id = id2;
		this.nome = nome2;
		this.idade = idade2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}
	
	public void setID(int id3) {
		this.id = id3;
	}

	
	
	
}
