
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
@Table(name = "TCampos")
public class Campo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;

	@Column(name = "Recurso_plantado  ")
	private Integer recurso_plantado    ;
	

	@Column(name = "Fecha_plantado")
	private GregorianCalendar fecha;

	@JoinColumn(name = "Id_Granja", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Granja granja;

	
	public Campo() {
		super();
	}

	public Campo(Integer recurso_plantado, GregorianCalendar fecha) {
		super();
		this.recurso_plantado = recurso_plantado;
		this.fecha = fecha;
	}

	public Campo(Integer recurso_plantado, GregorianCalendar fecha, Granja granja) {
		super();
		this.recurso_plantado = recurso_plantado;
		this.fecha = fecha;
		this.granja = granja;
	}

	public Campo(int id, Integer recurso_plantado, GregorianCalendar fecha, Granja granja) {
		super();
		this.id = id;
		this.recurso_plantado = recurso_plantado;
		this.fecha = fecha;
		this.granja = granja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getRecurso_plantado() {
		return recurso_plantado;
	}

	public void setRecurso_plantado(Integer recurso_plantado) {
		this.recurso_plantado = recurso_plantado;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
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
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((granja == null) ? 0 : granja.hashCode());
		result = prime * result + id;
		result = prime * result + recurso_plantado;
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
		Campo other = (Campo) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (granja == null) {
			if (other.granja != null)
				return false;
		} else if (!granja.equals(other.granja))
			return false;
		if (id != other.id)
			return false;
		if (recurso_plantado != other.recurso_plantado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Campo [id=" + id + ", recurso_plantado=" + recurso_plantado + ", fecha=" + fecha + ", granja=" + granja
				+ "]";
	}
	
	
	


}
