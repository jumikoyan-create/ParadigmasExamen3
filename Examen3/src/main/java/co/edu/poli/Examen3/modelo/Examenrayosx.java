package co.edu.poli.Examen3.modelo;

public class Examenrayosx extends Tipodeexamen {

	String zonacuerpo;
	String nivelradiacion;
	public Examenrayosx(String codigoidentificacion, String nombrepaciente, String fechaderealizacion,
			String costoprocedimiento, String zonacuerpo, String nivelradiacion) {
		super(codigoidentificacion, nombrepaciente, fechaderealizacion, costoprocedimiento);
		this.zonacuerpo = zonacuerpo;
		this.nivelradiacion = nivelradiacion;
	}
	public String getZonacuerpo() {
		return zonacuerpo;
	}
	public void setZonacuerpo(String zonacuerpo) {
		this.zonacuerpo = zonacuerpo;
	}
	public String getNivelradiacion() {
		return nivelradiacion;
	}
	public void setNivelradiacion(String nivelradiacion) {
		this.nivelradiacion = nivelradiacion;
	}
	
	
}
