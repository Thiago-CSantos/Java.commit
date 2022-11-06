package exercicios_fixação;

import java.util.Scanner;

import Entidades.Retangulo;

public class exercicio_retangulo_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Retangulo recebe = new Retangulo();
		
		System.out.print("Largura do retangulo:");
		recebe.largura = sc.nextDouble();		
		
		
		System.out.print("Largura do retangulo:");
		recebe.altura = sc.nextDouble();
		
		System.out.printf("area: %.2f ", recebe.calcArea());
		System.out.printf("perimetro: %.2f ", recebe.calcPerimetro());
		System.out.printf("diagonal: %.2f ", recebe.calcDiagonal());
		
	}

}
