package Aplicacao;

import java.text.Format;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class programa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Set<Integer> cursoA = new TreeSet<>();
		Set<Integer> cursoB = new TreeSet<>();
		Set<Integer> cursoC = new TreeSet<>();

		Set<Integer> x = new TreeSet<Integer>(cursoA);
		
			int count=0;
		
			System.out.print("Quantos alunos no curso A: ");
			count = leitor.nextInt();

			for (int i = 0; i < count; i++) {
				System.out.print("Aluno id: ");
				int idAluno = leitor.nextInt();
				cursoA.add(idAluno);
			}

			System.out.println("AlunoA: "+ cursoA);
			
			System.out.print("Quantos alunos no curso B: ");
			count = leitor.nextInt();
			
			for (int i = 0; i < count; i++) {
				System.out.print("Aluno id: ");
				int idAluno = leitor.nextInt();
				cursoB.add(idAluno);
			}
			
			System.out.println("AlunoB: "+ cursoB);
			
			System.out.print("Quantos alunos no curso B: ");
			count = leitor.nextInt();
			
			for (int i = 0; i < count; i++) {
				System.out.print("Aluno id: ");
				int idAluno = leitor.nextInt();
				cursoC.add(idAluno);
			}
			System.out.println("AlunoC: "+ cursoC);
			
			x.addAll(cursoB);
			x.addAll(cursoC);
			
		System.out.println("Total de alunos " + x.size());

	}

}
