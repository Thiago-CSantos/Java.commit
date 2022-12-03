package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produtos;

public class Programa2 {
	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um caminho onde vai criar a pasta:");
		String caminhoArquivo = ler.nextLine();
		
		File caminho = new File(caminhoArquivo);
		String cp = caminho.getParent();
		
		List<Produtos> lista = new ArrayList<>();
		
		boolean sucesso = new File(cp + "\\out").mkdir();
		
		System.out.println(sucesso);
		
		String cpc = cp +"\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
			String itemCSV = br.readLine();
			
			while(itemCSV != null) {
				
				String vetor[] = itemCSV.split(",");
				String name = vetor[0];
				double preco = Double.parseDouble(vetor[1]);
				int quantidade = Integer.parseInt(vetor[2]);
				
				Produtos produtos = new Produtos(name, preco, quantidade);
				
				lista.add(produtos);
				
				itemCSV = br.readLine();
				
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(cpc))){
				
				for(Produtos item : lista) {
					bw.write(item.getNome()+ ", "+item.total());
					bw.newLine();
				}
				
				System.out.println(cpc+"Criado:");
				
			}catch(IOException e) {
				System.out.println(e);
			}
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		/*Scanner  sc = new Scanner(System.in);
		
		System.out.println("Digite um caminho de um arquivo");
		String caminhoArquivo = sc.nextLine();
		
		File file = new File(caminhoArquivo);
		
		System.out.println("getName: "+ file.getName());
		System.out.println("getParent: "+file.getParent());
		System.out.println("getPath: "+file.getPath());*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("Diretorio criado com sucesso: "+ sucesso);*/
		
	
		
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
