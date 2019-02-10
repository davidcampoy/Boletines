package objetos;

import proyectos.Teclado;

public class Ejercicio1A {

	public static void main(String[] args) {
		
		Persona nm = new Persona();
		
		String name;
		
		System.out.println("Introduce un nombre: ");
		name = Teclado.readString();
		
		nm.setNombre(name);
		
		System.out.printf("Nombre = %s", nm.getNombre());

	}

}
