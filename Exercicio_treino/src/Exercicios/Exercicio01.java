package Exercicios;

import java.util.Scanner;

import Entidades.Cliente;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Nome:");
		String nome1 = ler.nextLine();
		
		System.out.print("Endereço:");
		String endereco1 = ler.nextLine();
		
		System.out.print("Renda:");
		float renda1 = ler.nextFloat();
		
		Cliente receber = new Cliente(nome1, endereco1, renda1);
		
		System.out.println("Seus dados");
		System.out.print("Nome:"+receber.getName()+" Endereço:"+receber.getEndereco()+" Renda:"+receber.getRenda());
		
		System.out.print("\n"+receber.ClasseSocial());
	}

}
