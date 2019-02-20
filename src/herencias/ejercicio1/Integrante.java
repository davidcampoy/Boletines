package herencias.ejercicio1;

public class Integrante {
	
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected String nacionalidad;
	
	public Integrante(String nombre, int edad, char sexo, String nacionalidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
	}
	
	public Integrante() {
		this("Sin nombre", 0, 'X', "Sin nacionalidad");
	}
	
	public String toString() {
		return String.format("Nombre: %s\nEdad: %d\nSexo: %c\n Nacionalidad: %s\n", nombre, edad, sexo, nacionalidad);
	}

}
