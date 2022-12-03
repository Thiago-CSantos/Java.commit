package model.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contratos {
	
	private Integer numero;
	private Double valorTotal;
	private LocalDate data;

	private List<Parcelas> lista = new ArrayList<>();
	
	public Contratos(Integer numero, Double valorTotal, LocalDate data) {
		this.numero = numero;
		this.valorTotal = valorTotal;
		this.data = data;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	

	public List<Parcelas> getLista() {
		return lista;
	}

}
