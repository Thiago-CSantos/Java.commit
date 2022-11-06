package Entidades;

public class Aluno {
	
	public String nome, pass="aprovado", fail="reprovado";
	public float nota1, nota2,nota3, resultado;
	
	public double NotaFinal() {
		
		 resultado = nota1 + nota2 + nota3;
		
		return resultado;
	}
	
	public String toString() {
		
		if(resultado<60) {
			
			return fail;
			
		}
		else {
			
			return pass;
		}
		
		
	}

}
