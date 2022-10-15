package entidade;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario() {
	}
	
	public Funcionario(int id2, String nome2, double salario2) {
		this.id = id2;
		this.nome = nome2;
		this.salario = salario2;
	}
	
	public void aumentoSalario(double porcentagem) {
		salario = salario + (salario * porcentagem /100);
	}

	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Id: "+id+" "+nome+" "+salario+"\n";
	}
	
	
	
}

