package model.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dataVencimento;
	
	private Double quantidade;

	public Parcelas(LocalDate dataVencimento, Double quantidade) {
		this.dataVencimento = dataVencimento;
		this.quantidade = quantidade;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	
	@Override
	public String toString() {
		return dataVencimento.format(fmt) + " - " + getQuantidade();
	}
	
}
