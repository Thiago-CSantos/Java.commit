package entidade;

public class Funcionario {
	
	private String nome;
	private Integer horas;
	private Double valorPorHora;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome2, Integer horas2, Double valorPorHora2) {
		this.nome = nome2;
		this.horas = horas2;
		this.valorPorHora = valorPorHora2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}
	
	public Double pagamento() {
		return valorPorHora*horas;
	}
	
	@Override
	public String toString() {
		return "nome:"+this.nome+" - "+ pagamento();
	}
}
