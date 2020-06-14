package dao;

import org.springframework.data.repository.CrudRepository;

import dominio.Animal;


public interface AnimalRepositorio extends CrudRepository<Animal, Integer>{

}
