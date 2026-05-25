package co.edu.poli.Examen3.servicios;
import co.edu.poli.Examen3.modelo.Tipodeexamen;

public interface OperacionArchivo {

	 public String serializar(Tipodeexamen[] examen, String path, String name);

	  
	    public Tipodeexamen[] deserializar(String path, String name);

}
