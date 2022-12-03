package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> mapsVotos = new HashMap<>();
		
		String caminho = "C:\\Users\\thiag\\OneDrive\\Área de Trabalho\\Java\\ws-Eclipse\\Maps\\VotosUrnas.csv";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			
			String lerLinha = br.readLine();
			
			while(lerLinha != null) {
				
				String vetor[] = lerLinha.split(",");
				
				String nome = vetor[0];
				int votos = Integer.parseInt(vetor[1]);
				
				//mapsVotos.put(nome, votos);
				
				if(mapsVotos.containsKey(nome)) {
					
					int somaVotos = votos + mapsVotos.get(nome);
					
					mapsVotos.put(nome, somaVotos);
					
				}
				else {
					mapsVotos.put(nome, votos);
				}
				
				lerLinha = br.readLine();
			}
			
			for (String key : mapsVotos.keySet()) {
				System.out.println("Chave: "+key+ "\n Total de votos:"+mapsVotos.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
