package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String caminho = "C:\\Users\\thiag\\OneDrive\\Área de Trabalho\\produtos.txt";
		
		
		try(BufferedReader ler = new BufferedReader( new FileReader(caminho))){
			
			List<Produto> lista = new ArrayList<>();
			
			String linha = ler.readLine();
			
			while(linha != null) {
				String separar[] = linha.split(",");
				
				Produto p = new Produto(separar[0], Double.parseDouble(separar[1]));
				
				lista.add(p);
				
				System.out.println(linha);
				
				linha = ler.readLine();
			}
			
			System.out.println("");
			
			double calculo = lista.stream().map(pruduto -> pruduto.getPreco()).reduce(0.0, (Double n1, Double n2) -> n1+n2) / lista.size();
			
			
			System.out.printf("Preço médio: %.2f\n", calculo);
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> nomesBaixoMedia = lista.stream().filter(abaixoMedia -> abaixoMedia.getPreco() < calculo ).map( p -> p.getNome()).sorted(comp.reversed()).collect(Collectors.toList());
			
			
			System.out.println("");
			System.out.printf("Produtos com preço abaixo da media(decrecente):\n %s", nomesBaixoMedia);
			
		}
		
		catch(IOException exeption) {
			System.out.println("ERRO: " + exeption.getMessage());
		}

	}

}
