package com.gestor.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.interfaceService.IestudianteService;
import com.gestor.interfaces.IEstudiante;
import com.gestor.modelo.Estudiante;

@Service
public class EstudianteServicio implements IestudianteService{
	
	@Autowired
	private IEstudiante dato;

	@Override
	public List<Estudiante> listar() {
		// TODO Auto-generated method stub
		return (List<Estudiante>)dato.findAll();
	}

	@Override
	public Optional<Estudiante> listarId(int id) {
		// TODO Auto-generated method stub
		return dato.findById(id);
	}

	@Override
	public int save(Estudiante e) {
		// TODO Auto-generated method stub
		int res = 0;
		Estudiante estudiante = dato.save(e);
		if (!estudiante.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dato.deleteById(id);
		
	}

}
