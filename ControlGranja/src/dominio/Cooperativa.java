
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
@Table(name = "TCooperativas")
public class Cooperativa implements Serializable {
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
	@Column(name = "Puntuacion")
	private int puntos;
	
	
	@Basic(optional = false)
	@Column(name = "Numero_Miembros")
	private int numero_Miembros;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cooperativa")
	private List<Usuario> usuario;
	
	public Cooperativa() {
	}

	
	public Cooperativa(String nombre, String descripcion, int puntos, int numero_Miembros ) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.numero_Miembros = numero_Miembros;
		this.puntos = puntos;
	}


	public Cooperativa(int id, String nombre, String descripcion,  int puntos, int numero_Miembros,
			List<Usuario> usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.numero_Miembros = numero_Miembros;
		this.puntos = puntos;
		this.usuario = usuario;
	}



	public Cooperativa(String nombre, String descripcion, int numero_Miembros,int puntos, List<Usuario> usuario) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.numero_Miembros = numero_Miembros;
		this.usuario = usuario;
		this.puntos = puntos;
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

	public int getNumero_Miembros() {
		return numero_Miembros;
	}

	public void setNumero_Miembros(int numero_Miembros) {
		this.numero_Miembros = numero_Miembros;
	}


	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	

	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numero_Miembros;
		result = prime * result + puntos;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Cooperativa other = (Cooperativa) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numero_Miembros != other.numero_Miembros)
			return false;
		if (puntos != other.puntos)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cooperativa [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", puntos=" + puntos
				+ ", numero_Miembros=" + numero_Miembros + ", usuario=" + usuario + "]";
	}



}
