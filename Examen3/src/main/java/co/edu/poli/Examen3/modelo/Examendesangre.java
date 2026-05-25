package co.edu.poli.Examen3.modelo;

public class Examendesangre extends Tipodeexamen {
	
	String ph;
	String tipodesangre;
	public Examendesangre(String codigoidentificacion, String nombrepaciente, String fechaderealizacion,
			String costoprocedimiento, String ph, String tipodesangre) {
		super(codigoidentificacion, nombrepaciente, fechaderealizacion, costoprocedimiento);
		this.ph = ph;
		this.tipodesangre = tipodesangre;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getTipodesangre() {
		return tipodesangre;
	}
	public void setTipodesangre(String tipodesangre) {
		this.tipodesangre = tipodesangre;
	}
	
	

}
