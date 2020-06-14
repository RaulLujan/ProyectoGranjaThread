
package dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TInfraestructuras")
public class Infraestructura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;

	@Basic(optional = false)
	@Column(name = "Nombre")
	private String nombre;
	
	@JoinColumn(name = "Id_Granja", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Granja granja;
	
	@JoinColumn(name = "Id_Tipo", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private TiposInfraestructura tipoInfraestructura;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "infraestructura")
	private List<Espacio> espacio;

	public Infraestructura() {
	}
	


	public Infraestructura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Infraestructura(String nombre, Granja granja, TiposInfraestructura tipoInfraestructura,
			List<Espacio> espacio) {
		super();
		this.nombre = nombre;
		this.granja = granja;
		this.tipoInfraestructura = tipoInfraestructura;
		this.espacio = espacio;
	}


	public Infraestructura(int id, String nombre, Granja granja, TiposInfraestructura tipoInfraestructura,
			List<Espacio> espacio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.granja = granja;
		this.tipoInfraestructura = tipoInfraestructura;
		this.espacio = espacio;
	}
	
	public Infraestructura(int id, String nombre, Granja granja, TiposInfraestructura tipoInfraestructura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.granja = granja;
		this.tipoInfraestructura = tipoInfraestructura;

	}
	
	public Infraestructura( String nombre, Granja granja, TiposInfraestructura tipoInfraestructura) {
		super();
		this.nombre = nombre;
		this.granja = granja;
		this.tipoInfraestructura = tipoInfraestructura;

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

	public Granja getGranja() {
		return granja;
	}

	public void setGranja(Granja granja) {
		this.granja = granja;
	}

	public TiposInfraestructura getTipoInfraestructura() {
		return tipoInfraestructura;
	}

	public void setTipoInfraestructura(TiposInfraestructura tipoInfraestructura) {
		this.tipoInfraestructura = tipoInfraestructura;
	}

	public List<Espacio> getEspacio() {
		return espacio;
	}

	public void setEspacio(List<Espacio> espacio) {
		this.espacio = espacio;
	}

	@Override
	public String toString() {
		return "Infraestructura [id=" + id + ", nombre=" + nombre + ", granja=" + granja + ", tipoInfraestructura="
				+ tipoInfraestructura + ", espacio=" + espacio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((espacio == null) ? 0 : espacio.hashCode());
		result = prime * result + ((granja == null) ? 0 : granja.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipoInfraestructura == null) ? 0 : tipoInfraestructura.hashCode());
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
		Infraestructura other = (Infraestructura) obj;
		if (espacio == null) {
			if (other.espacio != null)
				return false;
		} else if (!espacio.equals(other.espacio))
			return false;
		if (granja == null) {
			if (other.granja != null)
				return false;
		} else if (!granja.equals(other.granja))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipoInfraestructura == null) {
			if (other.tipoInfraestructura != null)
				return false;
		} else if (!tipoInfraestructura.equals(other.tipoInfraestructura))
			return false;
		return true;
	}


	
	
	
}
