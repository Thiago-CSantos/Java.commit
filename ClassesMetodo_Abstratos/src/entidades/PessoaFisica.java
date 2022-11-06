package entidades;

public class PessoaFisica extends Contribuintes {
	
	private Double gastoSaude;
	
	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double imposto() {
		double y = 0;
		if(getRendaAnual() < 20000) {
			
			y = (getRendaAnual()*0.15)-(getGastoSaude()*0.5);
		}
		else if(getRendaAnual() >= 20000) {
			
			y = (getRendaAnual()*0.25)-(getGastoSaude()*0.5);
		}
		
		return y; 
	}
	
}
