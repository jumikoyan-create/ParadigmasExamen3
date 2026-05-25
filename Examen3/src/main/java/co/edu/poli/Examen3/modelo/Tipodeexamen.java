package co.edu.poli.Examen3.modelo;
import java.io.Serializable;

public abstract class Tipodeexamen implements Serializable {
	
	private String codigoidentificacion;
	private String nombrepaciente;
	private String fechaderealizacion;
	private String Costoprocedimiento;
	public Tipodeexamen(String codigoidentificacion, String nombrepaciente, String fechaderealizacion,
			String costoprocedimiento) {
		super();
		this.codigoidentificacion = codigoidentificacion;
		this.nombrepaciente = nombrepaciente;
		this.fechaderealizacion = fechaderealizacion;
		Costoprocedimiento = costoprocedimiento;
	}
	public String getCodigoidentificacion() {
		return codigoidentificacion;
	}
	public void setCodigoidentificacion(String codigoidentificacion) {
		this.codigoidentificacion = codigoidentificacion;
	}
	public String getNombrepaciente() {
		return nombrepaciente;
	}
	public void setNombrepaciente(String nombrepaciente) {
		this.nombrepaciente = nombrepaciente;
	}
	public String getFechaderealizacion() {
		return fechaderealizacion;
	}
	public void setFechaderealizacion(String fechaderealizacion) {
		this.fechaderealizacion = fechaderealizacion;
	}
	public String getCostoprocedimiento() {
		return Costoprocedimiento;
	}
	public void setCostoprocedimiento(String costoprocedimiento) {
		Costoprocedimiento = costoprocedimiento;
	}
	
	

	
	

}
