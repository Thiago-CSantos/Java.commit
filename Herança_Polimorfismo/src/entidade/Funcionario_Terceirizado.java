package entidade;

public class Funcionario_Terceirizado extends Funcionario{
	
	private Double dispesasFuncionario;
	
	public Funcionario_Terceirizado() {
	}

	public Funcionario_Terceirizado(String nome2, Integer horas2, Double valorPorHora2, Double dispesasFuncionario) {
		super(nome2, horas2, valorPorHora2);
		this.dispesasFuncionario =  dispesasFuncionario;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + dispesasFuncionario * 1.1;
	}

	
	
}
