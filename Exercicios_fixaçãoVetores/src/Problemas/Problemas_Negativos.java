package Problemas;

import java.util.Scanner;

import Entidades.NumerosNegativos; 

public class Problemas_Negativos {

	public static void main(String[] args) {
		int i;
		
		Scanner ler = new Scanner(System.in);
		 
		
		System.out.print("Quantos numeros você vai digitar? ");
		int numero = ler.nextInt();
		int vetor[] =  new int[numero];
		
		
		
		for(i=0; i<numero; i++) {
				
				System.out.print("Numero: ");
				int n = ler.nextInt();
				vetor[i] =  n;
		}
		
		for(i=0; i<vetor.length; i++) {
			
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
			
		}	
		
	}

}
