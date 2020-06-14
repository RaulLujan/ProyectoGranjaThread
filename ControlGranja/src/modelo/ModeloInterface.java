package modelo;

import java.util.List;
import dominio.Granja;
import dominio.Infraestructura;
import dominio.Precio;
import dominio.Recurso;
import dominio.TiposInfraestructura;
import dominio.Animal;
import dominio.Campo;
import dominio.Cooperativa;
import dominio.Espacio;
import dominio.Usuario;

public interface ModeloInterface {
	

	public boolean alta(Cooperativa p);
	public boolean alta(Granja c);
	public boolean alta(Usuario u);
	public boolean alta(Animal p);
	public boolean alta(Campo c);
	public boolean alta(Espacio u);
	public boolean alta(Infraestructura p);
	public boolean alta(Precio c);
	public boolean alta(Recurso u);
	public boolean alta(TiposInfraestructura p);


	
	public boolean baja(Cooperativa p);
	public boolean baja(Granja c);
	public boolean baja(Usuario c);
	public boolean baja(Animal p);
	public boolean baja(Campo c);
	public boolean baja(Espacio u);
	public boolean baja(Infraestructura p);
	public boolean baja(Precio c);
	public boolean baja(Recurso u);
	public boolean baja(TiposInfraestructura p);
	

	public boolean modificacion(Cooperativa p);
	public boolean modificacion(Granja c);
	public boolean modificacion(Usuario c);
	public boolean modificacion(Animal p);
	public boolean modificacion(Campo c);
	public boolean modificacion(Espacio u);
	public boolean modificacion(Infraestructura p);
	public boolean modificacion(Precio c);
	public boolean modificacion(Recurso u);
	public boolean modificacion(TiposInfraestructura p);
	

	public Cooperativa consultaCooperativa(int id);
	public Granja consultaGranja(int id);
	public Usuario consultaUsuario(int id);
	public Animal consultaAnimal(int id);
	public Campo consultaCampo(int id);
	public Espacio consultaEspacio(int id);
	public Infraestructura consultaInfraestructura(int id);
	public Precio consultaPrecio(int id);
	public Recurso consultaRecurso(int id);
	public TiposInfraestructura consultaTiposInfraestructura(int id);

	
	

	public List<Cooperativa> consultaCooperativas();
	public List<Granja> consultaGranjas();
	public List<Usuario> consultaUsuarios();
	public List<Animal> consultaAnimales();
	public List<Campo> consultaCampos();
	public List<Espacio> consultaEspacios();
	public List<Infraestructura> consultaInfraestructuras();
	public List<Precio> consultaPrecios();
	public List<Recurso> consultaRecursos();
	public List<TiposInfraestructura> consultaTiposInfraestructuras();
}
