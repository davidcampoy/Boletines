package herencias.ejercicio1;

public class Profesor extends Integrante {
	
	private double sueldo;
	
	public Profesor(String nombre, int edad, char sexo, String nacionalidad, double sueldo){
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.sueldo = sueldo;
		
	}
	
	public Profesor() {
		this("Sin nombre", 0, 'X', "Sin nacionalidad", 0.0);
	}
	
	public String toString() {
		return String.format(super.toString() + "Sueldo: %f\n", sueldo);
	}

}
