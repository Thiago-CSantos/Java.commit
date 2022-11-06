package Entidades;

public class ConversaoMoeda {
	
	public static final double imposto = 0.06; //É uma contante.
	
	public static double valorDolar;
	public static double qtd_dolar;
	
	public static double CalcDolar() {
		double result;
		result = valorDolar * qtd_dolar;
		
		double r = result *imposto;
		
		return result + r;
		
		
		
	}

	
}
