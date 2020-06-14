/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TRecursos")
public class Recurso implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;
	@Basic(optional = false)
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Descripcion")
	private String descripcion;
	
	@Column(name = "Tipo")
	private String tipo;
	
	@Column(name = "Precio_Maximo")
	private double precioMaximo;
	
	@Column(name = "Precio_Minimo")
	private double precioMinimo;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recurso")
	private List<Precio> precio;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recurso")
	private List<Espacio> espacio;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recurso")
	private List<Animal> animal;

	public Recurso() {
	}


	
	public Recurso(String nombre, String descripcion, String tipo, double precioMaximo, double precioMinimo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.precioMaximo = precioMaximo;
		this.precioMinimo = precioMinimo;
	}


	public Recurso(String nombre, String descripcion, String tipo, double precioMaximo, double precioMinimo,
			List<Precio> precio, List<Espacio> espacio, List<Animal> animal) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.precioMaximo = precioMaximo;
		this.precioMinimo = precioMinimo;
		this.precio = precio;
		this.espacio = espacio;
		this.animal = animal;
	}


	public Recurso(int id, String nombre, String descripcion, String tipo, double precioMaximo, double precioMinimo,
			List<Precio> precio, List<Espacio> espacio, List<Animal> animal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.precioMaximo = precioMaximo;
		this.precioMinimo = precioMinimo;
		this.precio = precio;
		this.espacio = espacio;
		this.animal = animal;
	}

	
	public Recurso(int id, String nombre, String descripcion, String tipo, double precioMaximo, double precioMinimo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.precioMaximo = precioMaximo;
		this.precioMinimo = precioMinimo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioMaximo() {
		return precioMaximo;
	}

	public void setPrecioMaximo(double precioMaximo) {
		this.precioMaximo = precioMaximo;
	}

	public double getPrecioMinimo() {
		return precioMinimo;
	}

	public void setPrecioMinimo(double precioMinimo) {
		this.precioMinimo = precioMinimo;
	}

	public List<Precio> getPrecio() {
		return precio;
	}

	public void setPrecio(List<Precio> precio) {
		this.precio = precio;
	}

	public List<Espacio> getEspacio() {
		return espacio;
	}

	public void setEspacio(List<Espacio> espacio) {
		this.espacio = espacio;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((espacio == null) ? 0 : espacio.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precioMaximo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(precioMinimo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Recurso other = (Recurso) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (espacio == null) {
			if (other.espacio != null)
				return false;
		} else if (!espacio.equals(other.espacio))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (Double.doubleToLongBits(precioMaximo) != Double.doubleToLongBits(other.precioMaximo))
			return false;
		if (Double.doubleToLongBits(precioMinimo) != Double.doubleToLongBits(other.precioMinimo))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recurso [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", precioMaximo=" + precioMaximo + ", precioMinimo=" + precioMinimo + ", precio=" + precio
				+ ", espacio=" + espacio + ", animal=" + animal + "]";
	}
	


	
	

}
