package Entidades;

public class Cliente {
	
	private String nome;
	private String endereco;
	private float renda;
	
	
	public String x = "Você faz parte da classe média brasileira.";
	
	public  Cliente(String nome2, String endereco2, float renda2) {
		this.nome = nome2;
		this.endereco = endereco2;
		this.renda = renda2;
	}
	
	public String ClasseSocial() {
		if(renda >= 667.87 && renda <= 3755.76) {
			 ;
		}

		return x;
		
	}
	
	
	public String getName() {
		return nome;
	}
	
	public void setName(String nome_p) {
		this.nome = nome_p;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco_p) {
		this.endereco = endereco_p;
	}
	
	public float getRenda() {
		return renda;
	}
	
	public void setRenda(float renda_p) {
		this.renda =  renda_p;
	}
	
	
	
}
