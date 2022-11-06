package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHora {
	
	public DataHora() {
		
	}
	
	public String HoraLocal() {
		Date dataHoraAtual = new Date();
		SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
		
		return hora.format(dataHoraAtual);
	}
}
