package servicos;

import java.time.LocalDate;

import model.entidades.Contratos;
import model.entidades.Parcelas;

public class ServicoContrato {
	
	private ServicoPagamentoOnline spo; //Variavel de interface
	
	public ServicoContrato() {
	}
	
	public ServicoContrato(ServicoPagamentoOnline spo) {
		this.spo = spo;
	}


	public void processoContrato(Contratos contrato, int meses) {
		
		double calc = (contrato.getValorTotal() / meses);
		
		for(int i=0; i<meses; i++) {
			
			LocalDate dataVencimento = contrato.getData().plusMonths(i+1);
			
			double juros = spo.jurosSimples(calc, meses);
			double taxa = spo.taxaPagamento(juros + calc);
			
			double result = calc + juros + taxa;
			
			//Parcelas parcela = new Parcelas(dataVencimento, result);
			
			contrato.getLista().add(new Parcelas(dataVencimento, result));
			
		}
		
	}
	
}
