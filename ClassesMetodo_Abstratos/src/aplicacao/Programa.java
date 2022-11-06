package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuintes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		List<Contribuintes> lista = new ArrayList<>();
		double sum=0;
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Contribuinte #%d: \n", i+1);
			
			System.out.print("Pessoa jurídica ou física (j/f): ");
			char jf = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			double rendaAnu = sc.nextDouble();
			
			if(jf == 'f') {
				System.out.print("Gasto com saúde: ");
				 double gastoS= sc.nextDouble();
				 
				 Contribuintes pessoaF = new PessoaFisica(nome, rendaAnu, gastoS);
				 
				 lista.add(pessoaF);
			}
			else if(jf == 'j') {
				System.out.print("Números de funcionários: ");
				 int nFuncionarios= sc.nextInt();
				 
				 Contribuintes pessoaJ = new PessoaJuridica(nome,rendaAnu,nFuncionarios);
				 
				 lista.add(pessoaJ);
			}
			
		}
		System.out.println("");
		System.out.println("Impostos a pagar: ");
		for(Contribuintes c: lista) {
			
			System.out.printf("%s: $%.2f \n", c.getNome(), c.imposto());
			
			sum = sum + c.imposto();
		}
		
		System.out.printf("\nTOTAL IMPOSTOS: $%f", sum);
	}

}
