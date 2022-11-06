package exercicios_fixação;

import java.util.Scanner;

import Entidades.ContaBancaria;

public class conta_bancaria {
	
	public static void main(String args[]) {
		int numConta;
		String nomeTi, resposta;
		double saldoInicial;
		
		Scanner sc = new Scanner(System.in);
		ContaBancaria recebe = new ContaBancaria();
		
		
		System.out.print("Entre com o numero da conta");
		numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do titular");
		nomeTi = sc.nextLine();
		
		System.out.print("Deseja depositar? (sim/não)");
		resposta = sc.nextLine();
		
		if(resposta.equals("sim")) {
			
			System.out.println("Qual o valor do deposito inicial");
			saldoInicial = sc.nextDouble();
			recebe = new ContaBancaria(numConta, nomeTi, saldoInicial);
			
		}
		else {
			recebe = new ContaBancaria(numConta, nomeTi);
			
		}
		
		System.out.println(recebe);
		System.out.println("");
		
		System.out.print("Entre com um Deposito: ");
		double deposito = sc.nextDouble();
		recebe.Deposito(deposito);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.print(recebe);
		
		
		System.out.println("");
		
		System.out.print("Saque: ");
		double saque = sc.nextDouble();
		recebe.Saque(saque);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.print(recebe);
		
	}
}
