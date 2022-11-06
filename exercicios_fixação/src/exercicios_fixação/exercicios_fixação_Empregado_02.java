package exercicios_fixação;

import java.util.Scanner;

import Entidades.Empregado;

public class exercicios_fixação_Empregado_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empregado recebe;
		recebe = new Empregado();
		
		
		System.out.print("Nome: ");
		recebe.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		recebe.salarioB = sc.nextDouble();
		
		System.out.print("Imposto: ");
		recebe.imposto = sc.nextDouble();
		
		System.out.printf("Nome: %s \n Sálario Bruto: %.2f \n Imposto: %.2f \n", recebe.nome, recebe.salarioB, recebe.imposto);
		
		System.out.printf("%s, salario liquido %.2f \n", recebe.nome, recebe.salarioB-recebe.imposto);
		
		System.out.print("Digite um porcentagem para aumento de salario: ");
		recebe.porcentagem = sc.nextDouble();
		
		System.out.printf("Seu sálario liquido com aumento é de: R$ %.2f ", recebe.SalarioLiquido());
		
		
		
		

	}

}
