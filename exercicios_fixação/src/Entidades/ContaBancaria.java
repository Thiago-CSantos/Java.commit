package Entidades;

public class ContaBancaria {
	private int numeroConta;
	public String nomeTitular;
	private double saldoConta;
	
	public ContaBancaria() {
		// TODO Stub de construtor gerado automaticamente

	}
	
	public ContaBancaria(int numero_conta, String nome_titular) {
		this.numeroConta = numero_conta;
		this.nomeTitular = nome_titular;
	}
	
	

	public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicialConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		Deposito(saldoInicialConta);
	}
	
	
	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nome_titular) {
		this.nomeTitular = nome_titular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}


	public void Deposito(double quantidade) {
		
		saldoConta = saldoConta + quantidade;
		
	}
	
	public void Saque(double quantidade){
		
		saldoConta = saldoConta - quantidade - 5;
		
	}
	
	public String toString() {
		return "Aconta:"+numeroConta+"\nNome Titular: "+nomeTitular+"\nSaldo: "+saldoConta;
	}

}
