package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Date dataFabricacao =  new Date();
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> listaP = new ArrayList<>();
		
		System.out.println("Entre com um numero de produtos: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
		
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
		
			System.out.print("Produto comum(c)/importado(i)/usado(u) ");
			char ciu = sc.next().charAt(0);
		
			if(ciu == 'c') {
				Produto comum = new Produto(nome, preco);
				listaP.add(comum);
			}
			else if(ciu == 'i') {
				System.out.print("Taxa da alfândega: ");
				Double taxaAlfa = sc.nextDouble();
				
				Produto importado = new ProdutoImportado(nome, preco, taxaAlfa);
				listaP.add(importado);
			}
			else if(ciu == 'u') {
				System.out.print("Data de fabricação: ");
				dataFabricacao = formatarData.parse(sc.next());
				
				Produto usado = new ProdutoUsado(nome, preco, dataFabricacao);
				listaP.add(usado);
			}
			
		}
		
		for (Produto p : listaP) {
			System.out.println(p.etiquetaPreco());
		}
	}

}
