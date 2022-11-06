package entidades;

public class Produto {
	
	private String nome;
	private Double preco;
	
	public Produto() {
	}
	
	public Produto(String nome2, Double preco2) {
		this.nome = nome2;
		this.preco = preco2;
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

	public String etiquetaPreco() {
		return getNome()+" $"+getPreco();
	}
}
