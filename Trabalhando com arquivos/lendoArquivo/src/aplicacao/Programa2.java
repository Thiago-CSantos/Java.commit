package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta: ");
		String caminhoPasta = sc.nextLine();
		
		File caminho = new File(caminhoPasta);
		
		File pastas[] = caminho.listFiles(File::isDirectory);
		
		System.out.println("Pastas: ");
		
		for (File folder : pastas) {
			System.out.println(folder);
		}
		System.out.println("");
		
		System.out.println("Digite o caminho do arquivo: ");
		String caminhoArquivo = sc.nextLine();
		
		File arquivo[] = caminho.listFiles(File::isFile);
		
		System.out.println("Arquivos: ");
		for(File files: arquivo) {
			System.out.println(files);
		}
		
		System.out.println("");
		
		System.out.println("Crindo pasta: ");
		
		boolean sucesso = new File(caminhoPasta+"\\OLÁ_mundo").mkdir();
		
		System.out.println("Diretorio criado com sucesso: "+ sucesso);
		
		
		
		
		
		
		
		
		
		
		
		
		//Scanner  sc = new Scanner(System.in);		
		//String v1[] = new String[2];
		
		//for(int i=0; i<2; i++) {
		//	System.out.println("Digite algo:");
		//	v1[i] = sc.nextLine();
		//}
		
		//String caminhoArquivo = "C:\\Windows\\Temp\\teste2.txt";
		
		//try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo /*true*/))){//true --> para não reecriar outro arquivo e sim reescrevelo
			
		//	for (String vetores : v1) {
		//		bw.write(vetores);
		//		bw.newLine();
		//	}
			
		//}
		//catch (IOException ex){
		//	ex.printStackTrace();
		//}
		
		
		
		
		//String caminho = "C:\\Windows\\Temp\\teste.txt";
		
		//try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			//String linha = br.readLine();
			
			//while (linha != null) {
				//System.out.println(linha);
				//linha = br.readLine();
			//}
		//}
		
		//catch(IOException ex) {
			//System.out.println(ex);
		//}
		
		
	}
}
