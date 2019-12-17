package com.senati.clase02;

public class AppMateria {

	public static void main(String[] args) {
		Materia materia1 = new Materia("E010", "Desarrollo de Software", "Leng de Programacion", 60);
		Materia materia2 = new Materia("E020", "Soporte de Equipos", "Sistema Operativo", 45);
		
		System.out.println(materia1.toString());
		System.out.println(materia2.toString());

	}

}
