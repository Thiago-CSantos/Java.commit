package exercicios_fixação;

import java.util.Locale;
import java.util.Scanner;

import Entidades.ConversaoMoeda;

public class exercicios_fixação_CoverçãoMoeda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar? ");
		 ConversaoMoeda.valorDolar= sc.nextDouble();
		 
		 System.out.print("Quantos dolares você vai compra? ");
		 ConversaoMoeda.qtd_dolar= sc.nextDouble();
		 
		 System.out.printf("$%.2f você pagara: R$ %.2f ", ConversaoMoeda.qtd_dolar, ConversaoMoeda.CalcDolar());
		 

	}

}
