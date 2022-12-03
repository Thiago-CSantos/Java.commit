package aplicacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entidades.Contratos;
import model.entidades.Parcelas;
import servicos.ServicoContrato;
import servicos.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		
		System.out.print("Numero: ");
		int numContrato = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy) : ");
		LocalDate data = LocalDate.parse(sc.next(),fmt);
		
		System.out.print("Valor do contrato: ");
		double vlContrato = sc.nextDouble();
		
		Contratos objContrato = new Contratos(numContrato, vlContrato, data);
		
		System.out.print("Entre com o numero  de parcelas : ");
		int numParcelas = sc.nextInt();
		
		
		ServicoPaypal payPal = new ServicoPaypal();
		
		ServicoContrato servicoContrato = new ServicoContrato(payPal);
		
		servicoContrato.processoContrato(objContrato, numParcelas);
		
		System.out.println("PARCELAS: ");
		
		for (Parcelas parcela : objContrato.getLista()) {
			
			System.out.println(parcela);
			
		}
		
	}

}
