
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
@Table(name = "TEspacios")
public class Espacio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;

	@Basic(optional = false)
	@Column(name = "Ocupacion_actual")
	private int ocupacion_actual;
	
	@Column(name = "Capacidad")
	private Integer capacidad;

	@JoinColumn(name = "Id_Recurso", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Recurso recurso;
	
	@JoinColumn(name = "Id_Infraestructura", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Infraestructura infraestructura;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio")
	private List<Animal> animal;


	
	public Espacio() {
		super();
	}
	
	public Espacio(int id, int ocupacion_actual, Integer capacidad, Recurso recurso, Infraestructura infraestructura,
			List<Animal> animal) {
		super();
		this.id = id;
		this.ocupacion_actual = ocupacion_actual;
		this.capacidad = capacidad;
		this.recurso = recurso;
		this.infraestructura = infraestructura;
		this.animal = animal;
	}
	


	public Espacio(int ocupacion_actual, Integer capacidad) {
		super();
		this.ocupacion_actual = ocupacion_actual;
		this.capacidad = capacidad;
	}

	public Espacio(int ocupacion_actual, Integer capacidad, Recurso recurso, Infraestructura infraestructura,
			List<Animal> animal) {
		super();
		this.ocupacion_actual = ocupacion_actual;
		this.capacidad = capacidad;
		this.recurso = recurso;
		this.infraestructura = infraestructura;
		this.animal = animal;
	}
	
	public Espacio(int ocupacion_actual, Integer capacidad, Recurso recurso, Infraestructura infraestructura) {
		super();
		this.ocupacion_actual = ocupacion_actual;
		this.capacidad = capacidad;
		this.recurso = recurso;
		this.infraestructura = infraestructura;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOcupacion_actual() {
		return ocupacion_actual;
	}

	public void setOcupacion_actual(int ocupacion_actual) {
		this.ocupacion_actual = ocupacion_actual;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Recurso getRecurso() {
		return recurso;
	}

	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

	public Infraestructura getInfraestructura() {
		return infraestructura;
	}

	public void setInfraestructura(Infraestructura infraestructura) {
		this.infraestructura = infraestructura;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}


	@Override
	public String toString() {
		return "Espacio [id=" + id + ", ocupacion_actual=" + ocupacion_actual + ", capacidad=" + capacidad
				+ ", recurso=" + recurso + ", infraestructura=" + infraestructura + ", animal=" + animal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + capacidad;
		result = prime * result + id;
		result = prime * result + ((infraestructura == null) ? 0 : infraestructura.hashCode());
		result = prime * result + ocupacion_actual;
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
		Espacio other = (Espacio) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		if (capacidad != other.capacidad)
			return false;
		if (id != other.id)
			return false;
		if (infraestructura == null) {
			if (other.infraestructura != null)
				return false;
		} else if (!infraestructura.equals(other.infraestructura))
			return false;
		if (ocupacion_actual != other.ocupacion_actual)
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		return true;
	}


	
	
	
	

}
