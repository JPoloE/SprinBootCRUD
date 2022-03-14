package com.gestor.controlador;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.gestor.interfaceService.IestudianteService;
import com.gestor.modelo.Estudiante;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IestudianteService service;
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Estudiante> estudiantes = service.listar();
		model.addAttribute("Estudiantes", estudiantes);
		return "index";
		
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("Estudiantes", new Estudiante());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Estudiante e, Model model) {
		service.save(e);
		return"redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Estudiante>estudiantes=service.listarId(id);
		model.addAttribute("Estudiantes",estudiantes);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	

}
