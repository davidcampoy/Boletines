package herencias.ejercicio1;

public class Alumno extends Integrante {
	
	private boolean repetidor;
	
	public Alumno(String nombre, int edad, char sexo, String nacionalidad, boolean repetidor) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.repetidor = repetidor;
		
	}
	
	public Alumno() {
		this("Sin nombre", 0, 'X', "Sin nacionalidad", false);
	}
	
	public String toString() {
		return String.format(super.toString() + "Repetidor: %s\n", repetidor?"Si":"No");
	}

}
