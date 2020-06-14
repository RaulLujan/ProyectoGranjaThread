package dominio;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TUsuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Id")
	private int id;

	@Basic(optional = false)
	@Column(name = "Login")
	private String login;

	@Basic(optional = false)
	@Column(name = "Pass")
	private String pass;
	
	@Basic(optional = false)
	@Column(name = "Nombre")
	private String nombre;
	
	@Basic(optional = false)
	@Column(name = "Apellidos")
	private String apellidos;

	@Basic(optional = false)
	@Column(name = "Telefono")
	private String telefono;

	@Basic(optional = false)
	@Column(name = "Correo")
	private String correro;

	@Column(name = "Fecha")
	private String fecha;
	
	@Basic(optional = false)
	@Column(name = "Puntuacion")
	private int puntos;

	
	@JoinColumn(name = "Id_Granja", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Granja granja;
	
	@JoinColumn(name = "Id_Cooperativa", referencedColumnName = "Id")
	@ManyToOne(optional = false)
	private Cooperativa cooperativa;
	
	
	public Usuario() {

	}



	public Usuario(String login, String pass, String nombre, String apellidos, String telefono, String correro,
			String fecha, int puntos) {
		super();
		this.login = login;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correro = correro;
		this.fecha = fecha;
		this.puntos = puntos;
	}






	public Usuario(String login, String pass, String nombre, String apellidos, String telefono, String correro,
			String fecha, int puntos, Granja granja, Cooperativa cooperativa) {
		super();
		this.login = login;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correro = correro;
		this.fecha = fecha;
		this.puntos = puntos;
		this.granja = granja;
		this.cooperativa = cooperativa;
	}






	public Usuario(int id, String login, String pass, String nombre, String apellidos, String telefono, String correro,
			String fecha, int puntos, Granja granja, Cooperativa cooperativa) {
		super();
		this.id = id;
		this.login = login;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correro = correro;
		this.fecha = fecha;
		this.puntos = puntos;
		this.granja = granja;
		this.cooperativa = cooperativa;
	}






	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorrero() {
		return correro;
	}


	public void setCorrero(String correro) {
		this.correro = correro;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public Granja getGranja() {
		return granja;
	}


	public void setGranja(Granja granja) {
		this.granja = granja;
	}


	public Cooperativa getCooperativa() {
		return cooperativa;
	}


	public void setCooperativa(Cooperativa cooperativa) {
		this.cooperativa = cooperativa;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((cooperativa == null) ? 0 : cooperativa.hashCode());
		result = prime * result + ((correro == null) ? 0 : correro.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((granja == null) ? 0 : granja.hashCode());
		result = prime * result + id;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + puntos;
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Usuario other = (Usuario) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (cooperativa == null) {
			if (other.cooperativa != null)
				return false;
		} else if (!cooperativa.equals(other.cooperativa))
			return false;
		if (correro == null) {
			if (other.correro != null)
				return false;
		} else if (!correro.equals(other.correro))
			return false;
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
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (puntos != other.puntos)
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", pass=" + pass + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", telefono=" + telefono + ", correro=" + correro + ", fecha=" + fecha + ", puntos="
				+ puntos + ", granja=" + granja + ", cooperativa=" + cooperativa + "]";
	}
	
	

	
	
	
}