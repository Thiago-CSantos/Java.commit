package entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaF = new ArrayList<>();
		
		System.out.println("Entre com um numero de funcionarios: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Funcionario #%d data:\n",i+1);
			System.out.print("É terceirizado(sim/não)?");
			String sn = sc.next();
			sc.nextLine();
			if(sn.equals("sim")) {
				
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Horas trabalhada: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora trabalhada: ");
			double vHoras = sc.nextDouble();
			System.out.print("Dispesa adicional do funcionario: ");
			double dispesaAdd = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario_Terceirizado(nome,horas,vHoras,dispesaAdd);

			listaF.add(funcionario);
			
			}
			else {
				System.out.print("Nome:");
				String nome = sc.nextLine();
				System.out.print("Horas trabalhada: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora trabalhada: ");
				double vHoras = sc.nextDouble();
				
				Funcionario funcionario = new Funcionario(nome,horas,vHoras);
				
				listaF.add(funcionario);
			}
			
			
		}
		System.out.println("");
		System.out.println("Pagamentos: ");
		for (Funcionario c : listaF) {
			System.out.println(c);
		}
	}

}
