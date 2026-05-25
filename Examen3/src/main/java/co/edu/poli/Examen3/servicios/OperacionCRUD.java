package co.edu.poli.Examen3.servicios;
import co.edu.poli.Examen3.modelo.Tipodeexamen;

public interface OperacionCRUD {

	 void crear(Tipodeexamen e);

	   
	    Tipodeexamen leer(String codigoidentificacion);

	    void actualizar(String codigoidentificacion, Tipodeexamen e);

	    void eliminar(String codigoidentificacion);
	    

	    Tipodeexamen[] listar();
}
