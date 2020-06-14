
package dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TTiposInfraestructuras")
public class TiposInfraestructura implements Serializable {
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
	@Column(name = "Descripcion")
	private String descripcion;

	@Basic(optional = false)
	@Column(name = "Mantenimiento")
	private double mantenimineto;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoInfraestructura")
	private List<Infraestructura> infraestructura;

	public TiposInfraestructura() {
	}

	
	public TiposInfraestructura(String nombre, String descripcion, double mantenimineto) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.mantenimineto = mantenimineto;
	}


	public TiposInfraestructura(String nombre, String descripcion, double mantenimineto,
			List<Infraestructura> infraestructura) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.mantenimineto = mantenimineto;
		this.infraestructura = infraestructura;
	}



	public TiposInfraestructura(int id, String nombre, String descripcion, double mantenimineto,
			List<Infraestructura> infraestructura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.mantenimineto = mantenimineto;
		this.infraestructura = infraestructura;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMantenimineto() {
		return mantenimineto;
	}

	public void setMantenimineto(double mantenimineto) {
		this.mantenimineto = mantenimineto;
	}

	public List<Infraestructura> getInfraestructura() {
		return infraestructura;
	}

	public void setInfraestructura(List<Infraestructura> infraestructura) {
		this.infraestructura = infraestructura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + ((infraestructura == null) ? 0 : infraestructura.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mantenimineto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		TiposInfraestructura other = (TiposInfraestructura) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (infraestructura == null) {
			if (other.infraestructura != null)
				return false;
		} else if (!infraestructura.equals(other.infraestructura))
			return false;
		if (Double.doubleToLongBits(mantenimineto) != Double.doubleToLongBits(other.mantenimineto))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoInfraestructura [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", mantenimineto=" + mantenimineto + ", infraestructura=" + infraestructura + "]";
	}

	
	
	
	

}
