package entidade;

import java.util.Date;

public class ContratoHora {
	
	private Date data;
	private double valorHora;
	private int hora;
	
	public double valorTotal() {
		return valorHora * hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
}
