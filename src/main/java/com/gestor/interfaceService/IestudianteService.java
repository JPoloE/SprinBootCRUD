package com.gestor.interfaceService;

import java.util.List;
import java.util.Optional;
import com.gestor.modelo.*;

public interface IestudianteService {
	//Metodos del crud
	public List<Estudiante>listar();
	public Optional<Estudiante>listarId(int id);
	public int save(Estudiante e);
	public void delete(int id);
	
}
