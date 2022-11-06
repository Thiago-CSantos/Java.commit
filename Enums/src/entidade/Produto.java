package entidade;

public class Produto {
	
	private String nome;
	private Double preco;
	
	
	public Produto() {
	}
	
	public Produto(String produtoNome, Double produtoPreco) {
		super();
		this.nome = produtoNome;
		this.preco = produtoPreco;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return this.preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
