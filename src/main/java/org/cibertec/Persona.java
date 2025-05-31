package org.cibertec;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Persona {
	
	private String nombre, web; //MODIFICADOR PRIVATE ES OPCIONAL
	private int edad; //DEBIDO A LA CLASE LOMBOK
	
	public Persona(String nombre, String web, int edad) {
		this.nombre=nombre;
		this.web=web;
		this.edad=edad;
	}

}
