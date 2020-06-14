
package dominio;

import java.io.Serializable;


import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "TPrecios")
public class Precio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;

	@Basic(optional = false)
	@Column(name = "Precio")
	private int precio;

	@JoinColumn(name = "Id_Recurso", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Recurso recurso;
	
	@JoinColumn(name = "Id_Granja", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Granja granja;

	public Precio() {
	}
	
	

	public Precio(int precio) {
		super();
		this.precio = precio;
	}



	public Precio(int precio, Recurso recurso, Granja granja) {
		super();
		this.precio = precio;
		this.recurso = recurso;
		this.granja = granja;
	}



	public Precio(int id, int precio, Recurso recurso, Granja granja) {
		super();
		this.id = id;
		this.precio = precio;
		this.recurso = recurso;
		this.granja = granja;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Recurso getRecurso() {
		return recurso;
	}

	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

	public Granja getGranja() {
		return granja;
	}

	public void setGranja(Granja granja) {
		this.granja = granja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + precio;
		result = prime * result + ((granja == null) ? 0 : granja.hashCode());
		result = prime * result + id;
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
		Precio other = (Precio) obj;
		if (precio != other.precio)
			return false;
		if (granja == null) {
			if (other.granja != null)
				return false;
		} else if (!granja.equals(other.granja))
			return false;
		if (id != other.id)
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
		return "Precio [id=" + id + ", Precio=" + precio + ", recurso=" + recurso + ", granja=" + granja + "]";
	}


	
	
	
}
