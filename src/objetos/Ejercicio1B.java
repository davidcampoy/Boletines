package objetos;

import proyectos.Teclado;
import proyectos.Teclado.Compare;

public class Ejercicio1B {

	public static void main(String[] args) {
		
		Persona nm = new Persona();
		
		String name, ocupation;
		int age;
		float size;
		
		System.out.println("Introduce un nombre: ");
		name = Teclado.readString();
		
		nm.setNombre(name);
		
		System.out.println("Introduce una edad: ");
		age = Teclado.compNum(0, Compare.Mayor_o_igual);
		
		nm.setEdad(age);
		
		System.out.println("Introduce la altura: ");
		size = Teclado.compNum(0.5f, Compare.Mayor_o_igual);
		
		nm.setAltura(size);
		
		System.out.println("Introduce la ocupación: ");
		ocupation = Teclado.readString();
		
		nm.setOcupacion(ocupation);
		
		System.out.printf("Nombre = %s\nEdad = %d\nAltura = %.2f\nOcupación = %s", nm.getNombre(), nm.getEdad(), nm.getAltura(), nm.getOcupacion());

	}

}
