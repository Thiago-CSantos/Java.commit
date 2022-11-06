package entidades;

public class PessoaJuridica extends Contribuintes {
	
	private int numeroFuncionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double imposto() {
		double x = 0;
		if(numeroFuncionarios > 10) {
			 x = getRendaAnual()*0.14;
		}
		else if(numeroFuncionarios <=10 && numeroFuncionarios>0) {
			x = getRendaAnual()*0.16;
		}
		return x;
		
	}
}
