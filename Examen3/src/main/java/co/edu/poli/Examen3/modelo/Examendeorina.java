package co.edu.poli.Examen3.modelo;

public class Examendeorina extends Tipodeexamen {
	String presenciaglucosa;
	String niveldeph;
	public Examendeorina(String codigoidentificacion, String nombrepaciente, String fechaderealizacion,
			String costoprocedimiento, String presenciaglucosa, String niveldeph) {
		super(codigoidentificacion, nombrepaciente, fechaderealizacion, costoprocedimiento);
		this.presenciaglucosa = presenciaglucosa;
		this.niveldeph = niveldeph;
	}
	public String getPresenciaglucosa() {
		return presenciaglucosa;
	}
	public void setPresenciaglucosa(String presenciaglucosa) {
		this.presenciaglucosa = presenciaglucosa;
	}
	public String getNiveldeph() {
		return niveldeph;
	}
	public void setNiveldeph(String niveldeph) {
		this.niveldeph = niveldeph;
	}
	
	
	

}
