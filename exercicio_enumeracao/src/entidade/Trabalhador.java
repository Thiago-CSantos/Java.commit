package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.TrabalhadorLevel;

public class Trabalhador {
	
	private String name;
	private TrabalhadorLevel level;
	private double salarioBase;
	
	// classes associates:
	private Departamento departamento;
	private List<ContratoHora> listaContrato = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(String name2, TrabalhadorLevel level2, double salarioBase2, Departamento departamento2) {

		this.name = name2;
		this.level = level2;
		this.salarioBase = salarioBase2;
		this.departamento = departamento2;
	}
	
	
	public void addContrato(ContratoHora contrato) {
		listaContrato.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		listaContrato.remove(contrato);
	}
	
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for(ContratoHora c : listaContrato) {
			cal.setTime(c.getData());
			int c_ano =  cal.get(Calendar.YEAR);
			int c_mes =	1 + cal.get(Calendar.MONTH);
			
			if(ano == c_ano && mes == c_mes) {
				 soma = soma + c.valorTotal();
			}
		}
		return soma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TrabalhadorLevel getLevel() {
		return level;
	}

	public void setLevel(TrabalhadorLevel level) {
		this.level = level;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getListaContrato() {
		return listaContrato;
	}
	
	
	
}
