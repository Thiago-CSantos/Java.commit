package servicos;

public interface ServicoPagamentoOnline {
	
	public Double taxaPagamento(Double quantidade);
	
	public Double jurosSimples(Double quantidade, int mes);
		
	
	
}
