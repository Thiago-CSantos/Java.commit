package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private PedidoStatus status;
	
	private Cliente cliente;
	private List<PedidoItem> items = new ArrayList<>();
	
	public Pedido() {
	}
	
	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}



	public void addItem(PedidoItem item) {
		items.add(item);
	}
	
	public void removeItem(PedidoItem item) {
		items.remove(item);
	}
	
	public Double precoTotal() {
		double soma = 0;
		
		for(PedidoItem p : items) {
			soma = soma + p.subtotal();
		}
		return soma;
	}
	
	

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return sdf.format(momento);
	}
	
}
