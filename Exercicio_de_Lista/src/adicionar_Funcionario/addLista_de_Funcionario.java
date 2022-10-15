package adicionar_Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionario;

public class addLista_de_Funcionario {
	
	
	public static int auxiliar(List<Funcionario> lista, int id) {
		
		for(int i=0; i<lista.size(); i++) {
			
			if(lista.get(i).getId() == id) {
				return i;
			}
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int qtd_funcionario;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos funcionarios serão registrados: ");
		qtd_funcionario = sc.nextInt();
		
		List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		
		for(int i=0; i<qtd_funcionario; i++) {
			System.out.printf("Funcionario #%d",i+1,": \n" );
			
			System.out.print("ID: ");
			Integer id_ = sc.nextInt();		
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome_ = sc.nextLine();
			
			System.out.print("Salario: ");
			Double salario_ = sc.nextDouble();		
			
			Funcionario  recebe = new Funcionario(id_, nome_, salario_); 
			
			listaFuncionario.add(recebe);
		}
		
		System.out.print("Qual o ID do funcionario que tera seu salario aumentado: ");
		int idAumento = sc.nextInt();
		
		int posicao = auxiliar(listaFuncionario, idAumento);
		
		if(posicao == -1) {
			System.out.print("Id não existente");
		}
		else {
			System.out.print("Quantos porcentos'%' :" );
			double porcentagem_ = sc.nextDouble();
			
			listaFuncionario.get(posicao).aumentoSalario(porcentagem_);
		}
		
		System.out.println("");
		System.out.println("Lista de funcionarios: ");
		
		for(Funcionario a : listaFuncionario){
			System.out.print(a);
		}
		
		
	}

}
