package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = null;
		File arquivo = new File("C:\\Windows\\Temp\\teste.txt");
		
		try {
			sc = new Scanner(arquivo);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
			catch(IOException ex) {
				System.out.println("Error: é " + ex.getMessage());
			}
		
		}
		
	}

