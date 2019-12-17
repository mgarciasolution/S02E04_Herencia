package com.senati.clase02;

public class Materia extends Especialidad {

	String nombre;
	int horas;
	
	public Materia(String idEspecialidad, String nombre) {
		super(idEspecialidad, nombre);
	}
	
	

	public Materia(String idEspecialidad, String nombre, String nomMateria, int horas) {
		super(idEspecialidad, nombre);
		this.nombre = nomMateria;
		this.horas = horas;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Materia=" + nombre + ", horas=" + horas + ", idEsp=" + idEspecialidad + ", Especialidad="
				+ Nombre;
	}
	
	
	

}
