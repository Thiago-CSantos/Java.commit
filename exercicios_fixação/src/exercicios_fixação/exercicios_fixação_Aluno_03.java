package exercicios_fixação;

import java.util.Scanner;

import Entidades.Aluno;

public class exercicios_fixação_Aluno_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno recebe = new Aluno();
		
		System.out.print("Nome: ");
		recebe.nome = sc.nextLine();
		
		System.out.print("1ºnota: ");
		recebe.nota1 = sc.nextFloat();
		
		System.out.print("2ºnota: ");
		recebe.nota2 = sc.nextFloat();
		
		System.out.print("3ºnota: ");
		recebe.nota3 = sc.nextFloat();
		
		System.out.printf("Nome do aluno: %s \nNota final: %f \n %s",recebe.nome, recebe.NotaFinal(), recebe.toString());

	}

}
