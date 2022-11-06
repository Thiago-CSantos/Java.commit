package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFabricacao;
	
	
	public ProdutoUsado(String nome2, Double preco2, Date dataFabricacao) {
		super(nome2, preco2);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}



	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}


	@Override
	public String etiquetaPreco() {
		return getNome()+"(usado) $"+getPreco()+" (Data de fabricação: "+formatarData.format(dataFabricacao)+")";
	}
}
