package com.gestor.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestor.modelo.Estudiante;

@Repository
public interface IEstudiante extends CrudRepository<Estudiante, Integer>{

}
