package entidades;

public class ProdutoImportado extends Produto {
	private Double taxaAfandega;
	
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome2, Double preco2, Double taxaAfandega) {
		super(nome2, preco2);
		this.taxaAfandega = taxaAfandega;
	}

	public Double getTaxaAfandega() {
		return taxaAfandega;
	}

	public void setTaxaAfandega(Double taxaAfandega) {
		this.taxaAfandega = taxaAfandega;
	}

	public Double precoTotal() {
		return getPreco() + taxaAfandega;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome()+" $"+precoTotal()+" (Taxa alfândega: "+getTaxaAfandega()+")";
	}
	
}
