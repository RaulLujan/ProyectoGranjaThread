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
@Table(name = "tgranjas")
public class Granja implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;
	@Basic(optional = false)
	@Column(name = "Nombre")
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "granja")
	private List<Usuario> usuario;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "granja")
	private List<Precio> precio;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "granja")
	private List<Infraestructura> infraestructura;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "granja")
	private List<Campo> campo;

	public Granja() {
	}
	
	

	public Granja(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Granja(int id,String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public Granja(String nombre, List<Precio> precio, List<Usuario> usuario,
			List<Infraestructura> infraestructura, List<Campo> campo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.infraestructura = infraestructura;
		this.campo = campo;
		this.usuario = usuario;
	}




	public Granja(int id, String nombre, List<Precio> precio,List<Usuario> usuario,
			List<Infraestructura> infraestructura, List<Campo> campo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.infraestructura = infraestructura;
		this.campo = campo;
		this.usuario = usuario;
	}

	
	public Granja(int id, String nombre,
			 List<Campo> campo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.campo = campo;

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

	public  List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario( List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public List<Precio> getPrecio() {
		return precio;
	}

	public void setPrecio(List<Precio> precio) {
		this.precio = precio;
	}

	public List<Infraestructura> getInfraestructura() {
		return infraestructura;
	}

	public void setInfraestructura(List<Infraestructura> infraestructura) {
		this.infraestructura = infraestructura;
	}

	public List<Campo> getCampo() {
		return campo;
	}

	public void setCampo(List<Campo> campo) {
		this.campo = campo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campo == null) ? 0 : campo.hashCode());
		result = prime * result + id;
		result = prime * result + ((infraestructura == null) ? 0 : infraestructura.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
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
		Granja other = (Granja) obj;
		if (campo == null) {
			if (other.campo != null)
				return false;
		} else if (!campo.equals(other.campo))
			return false;
		if (id != other.id)
			return false;
		if (infraestructura == null) {
			if (other.infraestructura != null)
				return false;
		} else if (!infraestructura.equals(other.infraestructura))
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
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Granja [id=" + id + ", nombre=" + nombre  + ", usuario=" + usuario + ", precio="
				+ precio + ", infraestructura=" + infraestructura + ", campo=" + campo + "]";
	}
	


	

}
