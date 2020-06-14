package modelo;

import java.util.List;

import dao.*;
import dominio.*;

public class Modelo implements ModeloInterface {


	private CooperativaRepositorio cooperativas;
	private GranjaRepositorio granjas ;
	private UsuarioRepositorio usuarios;
	private AnimalRepositorio animales;
	private CampoRepositorio campos ;
	private EspacioRepositorio espacios;
	private InfraestructuraRepositorio infraestructuras;
	private PrecioRepositorio precios ;
	private TiposInfraestructuraRepositorio tiposInfraestructuras;
	private RecursoRepositorio recursos;
	
	
	
	public boolean alta(Cooperativa p){
		if (cooperativas.exists(p.getId())) {
		return false;}
	return cooperativas.save(p) != null;}
	
	public boolean alta(Granja c){
		if (granjas.exists(c.getId())) {
		return false;}
	return granjas.save(c) != null;}
	
	public boolean alta(Usuario u){
		if (usuarios.exists(u.getId())) {
		return false;}
	return usuarios.save(u) != null;}
	public boolean alta(Animal p){
		if (animales.exists(p.getId())) {
		return false;}
	return animales.save(p) != null;}
	public boolean alta(Campo p){
		if (campos.exists(p.getId())) {
		return false;}
	return campos.save(p) != null;}
	public boolean alta(Espacio p){
		if (espacios.exists(p.getId())) {
		return false;}
	return espacios.save(p) != null;}
	public boolean alta(Infraestructura p){
		if (infraestructuras.exists(p.getId())) {
		return false;}
	return infraestructuras.save(p) != null;}
	public boolean alta(Precio p){
		if (precios.exists(p.getId())) {
		return false;}
	return precios.save(p) != null;}
	public boolean alta(TiposInfraestructura p){
		if (tiposInfraestructuras.exists(p.getId())) {
			return false;}
	return tiposInfraestructuras.save(p) != null;}
	public boolean alta(Recurso p){
		if (recursos.exists(p.getId())) {
		return false;}
	return recursos.save(p) != null;}
	
	
	
	public boolean baja(Cooperativa p){
		if (cooperativas.exists(p.getId())) {
			cooperativas.delete(p);return true;}
	return false;}
	
	public boolean baja(Granja c){
		if (granjas.exists(c.getId())) {
			granjas.delete(c);return true;}
	return false;}
	
	public boolean baja(Usuario u){
		if (usuarios.exists(u.getId())) {
			usuarios.delete(u);return true;}
	return false;}
	public boolean baja(Animal p){
		if (animales.exists(p.getId())) {
			animales.delete(p);return true;}
	return false;}
	public boolean baja(Campo p){
		if (campos.exists(p.getId())) {
			campos.delete(p);return true;}
	return false;}
	public boolean baja(Espacio p){
		if (espacios.exists(p.getId())) {
			espacios.delete(p);return true;}
	return false;}
	public boolean baja(Infraestructura p){
		if (infraestructuras.exists(p.getId())) {
			infraestructuras.delete(p);return true;}
	return false;}
	public boolean baja(Precio p){
		if (precios.exists(p.getId())) {
			precios.delete(p);return true;}
	return false;}
	public boolean baja(TiposInfraestructura p){
		if (tiposInfraestructuras.exists(p.getId())) {
			tiposInfraestructuras.delete(p);return true;}
	return false;}
	public boolean baja(Recurso p){
		if (recursos.exists(p.getId())) {
			recursos.delete(p);return true;}
	return false;}
	
	
	
	public boolean modificacion(Cooperativa p){
		if (cooperativas.exists(p.getId())) {
			cooperativas.save(p);
			return true;}
		return false;}
	
	public boolean modificacion(Granja c){
		if (granjas.exists(c.getId())) {
			granjas.save(c);
			return true;}
		return false;}
	
	public boolean modificacion(Usuario u){
		if (usuarios.exists(u.getId())) {
			usuarios.save(u);
			return true;}
		return false;}
	public boolean modificacion(Animal p){
		if (animales.exists(p.getId())) {
			animales.save(p);
			return true;}
		return false;}
	public boolean modificacion(Campo p){
		if (campos.exists(p.getId())) {
			campos.save(p);
			return true;}
		return false;}
	public boolean modificacion(Espacio p){
		if (espacios.exists(p.getId())) {
			espacios.save(p);
			return true;}
		return false;}
	public boolean modificacion(Infraestructura p){
		if (infraestructuras.exists(p.getId())) {
			infraestructuras.save(p);
			return true;}
		return false;}
	public boolean modificacion(Precio p){
		if (precios.exists(p.getId())) {
			precios.save(p);
			return true;}
		return false;}
	public boolean modificacion(TiposInfraestructura p){
		if (tiposInfraestructuras.exists(p.getId())) {
			tiposInfraestructuras.save(p);
			return true;}
		return false;}
	public boolean modificacion(Recurso p){
		if (recursos.exists(p.getId())) {
			recursos.save(p);
			return true;}
		return false;}
	
	

	public Cooperativa consultaCooperativa(int id){return cooperativas.findOne(id);}
	public Granja consultaGranja(int id){return granjas.findOne(id);}
	public Usuario consultaUsuario(int id){return usuarios.findOne(id);}
	public Animal consultaAnimal(int id){return animales.findOne(id);}
	public Campo consultaCampo(int id){return campos.findOne(id);}
	public Espacio consultaEspacio(int id){return espacios.findOne(id);}
	public Infraestructura consultaInfraestructura(int id){return infraestructuras.findOne(id);}
	public Precio consultaPrecio(int id){return precios.findOne(id);}
	public TiposInfraestructura consultaTiposInfraestructura(int id){return tiposInfraestructuras.findOne(id);}
	public Recurso consultaRecurso(int id){return recursos.findOne(id);}
	
	
	public List<Cooperativa> consultaCooperativas(){return (List<Cooperativa>) cooperativas.findAll();}
	public List<Granja> consultaGranjas(){return (List<Granja>) granjas.findAll();}
	public List<Usuario> consultaUsuarios(){return (List<Usuario>) usuarios.findAll();}
	public List<Animal> consultaAnimales(){return (List<Animal>) animales.findAll();}
	public List<Campo> consultaCampos(){return (List<Campo>) campos.findAll();}
	public List<Espacio> consultaEspacios(){return (List<Espacio>) espacios.findAll();}
	public List<Infraestructura> consultaInfraestructuras(){return (List<Infraestructura>) infraestructuras.findAll();}
	public List<Precio> consultaPrecios(){return (List<Precio>) precios.findAll();}
	public List<TiposInfraestructura> consultaTiposInfraestructuras(){return (List<TiposInfraestructura>) tiposInfraestructuras.findAll();}
	public List<Recurso> consultaRecursos(){return (List<Recurso>) recursos.findAll();}


	public CooperativaRepositorio getcooperativas() {
		return cooperativas;
	}

	public void setcooperativas(CooperativaRepositorio cooperativas) {
		this.cooperativas = cooperativas;
	}

	public GranjaRepositorio getgranjas() {
		return granjas;
	}

	public void setgranjas(GranjaRepositorio granjas) {
		this.granjas = granjas;
	}

	public UsuarioRepositorio getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(UsuarioRepositorio usuarios) {
		this.usuarios = usuarios;
	}

	public CooperativaRepositorio getCooperativas() {
		return cooperativas;
	}

	public void setCooperativas(CooperativaRepositorio cooperativas) {
		this.cooperativas = cooperativas;
	}

	public GranjaRepositorio getGranjas() {
		return granjas;
	}

	public void setGranjas(GranjaRepositorio granjas) {
		this.granjas = granjas;
	}

	public AnimalRepositorio getAnimales() {
		return animales;
	}

	public void setAnimales(AnimalRepositorio animales) {
		this.animales = animales;
	}

	public CampoRepositorio getCampos() {
		return campos;
	}

	public void setCampos(CampoRepositorio campos) {
		this.campos = campos;
	}

	public EspacioRepositorio getEspacios() {
		return espacios;
	}

	public void setEspacios(EspacioRepositorio espacios) {
		this.espacios = espacios;
	}

	public InfraestructuraRepositorio getInfraestructuras() {
		return infraestructuras;
	}

	public void setInfraestructuras(InfraestructuraRepositorio infraestructuras) {
		this.infraestructuras = infraestructuras;
	}

	public PrecioRepositorio getPrecios() {
		return precios;
	}

	public void setPrecios(PrecioRepositorio precios) {
		this.precios = precios;
	}

	public TiposInfraestructuraRepositorio getTiposInfraestructuras() {
		return tiposInfraestructuras;
	}

	public void setTiposInfraestructuras(TiposInfraestructuraRepositorio tiposInfraestructuras) {
		this.tiposInfraestructuras = tiposInfraestructuras;
	}

	public RecursoRepositorio getRecursos() {
		return recursos;
	}

	public void setRecursos(RecursoRepositorio recursos) {
		this.recursos = recursos;
	}

}
