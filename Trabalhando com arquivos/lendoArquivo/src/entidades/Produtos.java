package entidades;

public class Produtos {
	
	private String nome;
	private Double preco;
	private Integer quatidade;
	
	public Produtos(String nome, Double preco, Integer quatidade) {
		this.nome = nome;
		this.preco = preco;
		this.quatidade = quatidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(Integer quatidade) {
		this.quatidade = quatidade;
	}
	
	public Double total() {
		return this.preco * this.quatidade;
	}
	
}
