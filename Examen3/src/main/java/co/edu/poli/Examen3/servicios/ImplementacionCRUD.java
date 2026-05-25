package co.edu.poli.Examen3.servicios;

import co.edu.poli.Examen3.modelo.Tipodeexamen;
import java.io.*;

public class ImplementacionCRUD implements OperacionArchivo, OperacionCRUD {

	    private Tipodeexamen[] examen = new Tipodeexamen[2];

	    public Tipodeexamen[] getEntidades() {
	        return this.examen;
	    }

	    public void setEntidades(Tipodeexamen[] transporte) {
	        this.examen = examen;
	    }

	    @Override
	    public void crear(Tipodeexamen e) {

	        try {
	            if (e == null) {
	                throw new IllegalArgumentException("No se puede agregar un objeto null");
	            }

	            if (leer(e.getCodigoidentificacion()) != null) {
	                throw new IllegalArgumentException("Ya existe un camion con ese ID");
	            }

	           
	            for (int i = 0; i < examen.length; i++) {
	                if (examen[i] == null) {
	                    examen[i] = e;
	                    System.out.println("transporte agregado en posición " + i);
	                    return;
	                }
	            }

	            // 2. Si no hay espacio → crecer arreglo
	            Tipodeexamen[] nuevo = new Tipodeexamen[examen.length + 1];

	            for (int i = 0; i < examen.length; i++) {
	                nuevo[i] = examen[i];
	            }

	            nuevo[examen.length] = e;
	            examen = nuevo;

	            System.out.println("Arreglo expandido. Entidad agregada en posición " + (examen.length - 1));

	        } catch (IllegalArgumentException ex) {
	            System.out.println("Error al crear: " + ex.getMessage());
	        }
	    }

	    // =========================
	    // LEER
	    // =========================
	    @Override
	    public Tipodeexamen leer(String codigoidentificacion) {

	        try {
	            if (codigoidentificacion == null) {
	                throw new IllegalArgumentException("El ID no puede ser nulo");
	            }

	            for (Tipodeexamen e : examen) {
	                if (e != null && e.getCodigoidentificacion().equals(codigoidentificacion)) {
	                    return e;
	                }
	            }

	        } catch (IllegalArgumentException ex) {
	            System.out.println("Error al leer: " + ex.getMessage());
	        }

	        return null;
	    }

	    // =========================
	    // ACTUALIZAR
	    // =========================
	    @Override
	    public void actualizar(String codigoidentificacion, Tipodeexamen nueva) {

	        try {
	            if (codigoidentificacion == null || nueva == null) {
	                throw new IllegalArgumentException("ID o entidad no pueden ser nulos");
	            }

	            for (int i = 0; i < examen.length; i++) {
	                if (examen[i] != null && examen[i].getCodigoidentificacion().equals(codigoidentificacion)) {
	                    examen[i] = nueva;
	                    System.out.println("camion actualizado con ID: " + codigoidentificacion);
	                    return;
	                }
	            }

	            System.out.println("No se encontró camion con ID: " + codigoidentificacion);

	        } catch (IllegalArgumentException ex) {
	            System.out.println("Error al actualizar: " + ex.getMessage());
	        }
	    }

	    // =========================
	    // ELIMINAR
	    // =========================
	    @Override
	    public void eliminar(String codigoidentificacion) {

	        try {
	            if (codigoidentificacion == null) {
	                throw new IllegalArgumentException("El ID no puede ser nulo");
	            }

	            for (int i = 0; i < examen.length; i++) {
	                if (examen[i] != null && examen[i].getCodigoidentificacion().equals(codigoidentificacion)) {
	                	examen[i] = null;
	                    System.out.println("camion eliminado con ID: " + codigoidentificacion);
	                    return;
	                }
	            }

	            System.out.println("No se encontró camion con ID: " + codigoidentificacion);

	        } catch (IllegalArgumentException ex) {
	            System.out.println("Error al eliminar: " + ex.getMessage());
	        }
	    }

	    // =========================
	    // LISTAR
	    // =========================
	    @Override
	    public Tipodeexamen[] listar() {

	        int count = 0;
	        for (Tipodeexamen e : examen) {
	            if (e != null) count++;
	        }

	        Tipodeexamen[] limpio = new Tipodeexamen[count];
	        int j = 0;

	        for (Tipodeexamen e : examen) {
	            if (e != null) limpio[j++] = e;
	        }

	        return limpio;
	    }

	    // =========================
	    // SERIALIZAR
	    // =========================
	    @Override
	    public String serializar(Tipodeexamen[] examen, String path, String name) {

	        try (FileOutputStream fos = new FileOutputStream(path + name);
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            oos.writeObject(examen);
	            return "Archivo creado correctamente";

	        } catch (IOException e) {
	            return "Error al guardar: " + e.getMessage();
	        }
	    }

	    // =========================
	    // DESERIALIZAR
	    // =========================
	    @Override
	    public Tipodeexamen[] deserializar(String path, String name) {

	    	Tipodeexamen[] datos = null;

	        try (FileInputStream fis = new FileInputStream(path + name);
	             ObjectInputStream ois = new ObjectInputStream(fis)) {

	            datos = (Tipodeexamen[]) ois.readObject();

	        } catch (IOException e) {
	            System.out.println("Error IO: " + e.getMessage());

	        } catch (ClassNotFoundException e) {
	            System.out.println("Clase no encontrada: " + e.getMessage());
	        }

	        return datos;
	    }

	
	}
