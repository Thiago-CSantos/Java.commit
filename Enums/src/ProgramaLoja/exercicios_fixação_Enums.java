package ProgramaLoja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.Cliente;
import entidade.Pedido;
import entidade.PedidoItem;
import entidade.PedidoStatus;
import entidade.Produto;

public class exercicios_fixação_Enums {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Date dataNascimentoCliente = new Date();
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
		PedidoItem pedidoItem = new PedidoItem();
		
		
		
		System.out.println("Dados do cliente: ");
		
		System.out.print("Nome: ");
		String nomeCliente =  sc.nextLine();
		
		System.out.print("Email: ");
		String emailCliente =  sc.nextLine();
		
		System.out.print("Data de nascimento ex: dd/MM/yyyy ");
		dataNascimentoCliente = formatarData.parse(sc.next());
		
		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataNascimentoCliente);
		
		//System.out.println(formatarData.format(data));
		
		
		System.out.println("Dados do pedido: ");
		
		System.out.print("Status do pedido 0-PAGAMENTO_PENDENTE 1-PROCESSANDO 2-ENVIADO 3-ENTREGUE: ");
		String code = sc.next().toUpperCase();
		PedidoStatus statusPedido = PedidoStatus.valueOf(code);
		
		//System.out.println(statusPedido);
		
		System.out.print("Quantos items vai ter o pedido");
		int nPedidos = sc.nextInt();
		
		Pedido pedido = new Pedido(new Date(), statusPedido, cliente);
		
		for(int i=0; i < nPedidos; i++) {
			System.out.println("Entre #"+(i+1)+"item: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String produtoNome = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			double produtoPreco = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			int produtoQuantidade = sc.nextInt();
			
			Produto produto = new Produto(produtoNome, produtoPreco);
			
			PedidoItem pI = new PedidoItem(produtoQuantidade, produtoPreco, produto);
			
			pedido.addItem(pI);
			
		}
		
		System.out.println("Pedido sumario: ");
		System.out.println("");
		
		System.out.println("Momento do pedido: "+pedido+"\nStatus do Pedido: "+statusPedido+"\n Cliente: "+cliente.getNome()+" ("+cliente.getDataNascimento()+") -"+cliente.getEmail());
		
		System.out.println("Items do pedido");
		Produto product = new Produto();
		System.out.println(""+product.getNome()+", $"+product.getPreco()+", Quantidade: "+pedidoItem.getQuantidade()+", Subtotal:"+pedidoItem.subtotal());
		
		System.out.println("Preço total: "+pedido.precoTotal());
		
	}

}
