package programaDataHora;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entidade.Cliente;

public class Program_Cliente {

	public static void main(String[] args) {
		
		int id=0;
		String nome = null;
		int idade = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Cliente recebe =  new Cliente();
		
		List <Cliente> clientes = new ArrayList<Cliente>();
		
		
		while(id >=0) {
			System.out.print("ID: ");
			id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			recebe = new Cliente(id, nome, idade);
			
			if(id >= 0 ) {
				clientes.add(recebe);
			}
		}
		
		
		for(Cliente x : clientes) {
			System.out.println("ID: "+x.getId()+" "+ x.getNome()+" "+x.getIdade()+"anos");
		}
		
	}
}
