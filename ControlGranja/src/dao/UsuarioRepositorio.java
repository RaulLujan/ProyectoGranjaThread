package dao;

import org.springframework.data.repository.CrudRepository;

import dominio.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer>{

}
