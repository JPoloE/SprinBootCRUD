package com.gestor.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombres;
	private String edad;
	private String curso;
	
	public Estudiante() {
		
	}
	
	//Constructor

	public Estudiante(int id, String nombres, String edad, String curso) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.edad = edad;
		this.curso = curso;
	}
	
	//Medotos Get y Set de ID

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	//Medotos Get y Set de nombres

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
	//Medotos Get y Set de edad

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	//Medotos Get y Set de curso

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
