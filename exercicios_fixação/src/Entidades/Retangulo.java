/**
 * 
 */
package Entidades;


public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double calcArea() {
		
		double area = largura * altura;
		
		return area;
		
	}
	
	public double calcPerimetro() {
		double perimetro = 2*(largura) + 2*(altura);
		
		return perimetro;
	}
	
	public double calcDiagonal () {
		
		double raiz = Math.sqrt(altura* altura + largura * largura);
		
		double diagonal = raiz;
		
		return diagonal;
		
	}
	
}
