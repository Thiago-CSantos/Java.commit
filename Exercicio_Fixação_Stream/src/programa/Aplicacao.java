package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidade.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String caminho = "C:\\Users\\thiag\\OneDrive\\Área de Trabalho\\funcionarios.txt";
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		try {
			
			FileReader fr = new FileReader(caminho);
			BufferedReader br = new BufferedReader(fr);
			
			String lerLinha = br.readLine();
			
			while(lerLinha != null) {
			
				String separar[] = lerLinha.split(",", 3);
				System.out.println(lerLinha);
				
				Funcionario funcionarios = new Funcionario(separar[0], separar[1], Double.parseDouble(separar[2]));
				listaFuncionarios.add(funcionarios);
				
				lerLinha = br.readLine();
				
			}
			System.out.println("");
			System.out.print("Entre com um valor de salario: ");
			double valor = sc.nextDouble();
			
			
			List<String> ordemEmail = listaFuncionarios.stream().filter( x -> x.getSalario() > valor).map(x -> x.getEmail()).collect(Collectors.toList());
			System.out.println("E-mail com salarios a cima de :"+valor);
			ordemEmail.forEach(p -> System.out.printf(p+"\n"));
			
			System.out.println("");
			System.out.println("Soma do salários de todos que começam com a letra 'M': \n");
			
			double somaSalarios = listaFuncionarios.stream().filter(inicial -> inicial.getNome().toUpperCase().charAt(0) == 'M').map( x -> x.getSalario()).reduce(0.0, (n1,n2) -> n1+n2 );
			System.out.println(somaSalarios);
		} 
		catch (IOException erro) {
			// TODO: handle exception
			
			System.out.println("Erro: "+erro.getMessage());
		}
		
		

	}

}
