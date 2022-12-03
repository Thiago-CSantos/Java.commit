package servicos;

public class ServicoPaypal implements ServicoPagamentoOnline{
	
	@Override
	public Double taxaPagamento(Double quantidade) {
		return  quantidade * 0.02;
	}
	
	@Override
	public Double jurosSimples(Double quantidade, int mes) {
		return quantidade * 0.01;
	}
	
}
