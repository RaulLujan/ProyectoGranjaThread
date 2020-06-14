
package dominio;

import java.io.Serializable;
import java.util.GregorianCalendar;


import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "TAnimales")
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;

	@Basic(optional = false)
	@Column(name = "Nombre")
	private String nombre;
	
	@Basic(optional = false)
	@Column(name = "Fecha_Nacimiento")
	private GregorianCalendar fecha;

	@JoinColumn(name = "Id_Recurso", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Recurso recurso;

	@JoinColumn(name = "Id_Espacio", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Espacio espacio;

	
	public Animal() {
		super();
	}

	

	public Animal(int id, String nombre, GregorianCalendar fecha, Recurso recurso, Espacio espacio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.recurso = recurso;
		this.espacio = espacio;
	}


	public Animal(String nombre, GregorianCalendar fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Animal(String nombre, GregorianCalendar fecha, Recurso recurso, Espacio espacio) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.recurso = recurso;
		this.espacio = espacio;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public Recurso getRecurso() {
		return recurso;
	}

	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

	public Espacio getEspacio() {
		return espacio;
	}

	public void setEspacio(Espacio espacio) {
		this.espacio = espacio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((espacio == null) ? 0 : espacio.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (espacio == null) {
			if (other.espacio != null)
				return false;
		} else if (!espacio.equals(other.espacio))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", recurso=" + recurso + ", espacio="
				+ espacio + "]";
	}


	
	
	
	

}
