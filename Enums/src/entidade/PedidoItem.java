package entidade;

public class PedidoItem {
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	
	public PedidoItem() {
	}

	public PedidoItem(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}



	public Double subtotal() {
		return this.preco * quantidade;
	}



	public Integer getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}



	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
