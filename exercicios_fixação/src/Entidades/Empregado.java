package Entidades;

public class Empregado {
	
	public String nome;
	public double salarioB, imposto, porcentagem;
	
	public String NomeEmpregado() {
		
		return nome;
		
	}
	
	public double SalarioLiquido() {
		
		double taxa = salarioB*porcentagem/100;
		salarioB=salarioB+taxa;
		
		double salarioL = salarioB-imposto;
		
		return salarioL;
		
	}
	
	
}
