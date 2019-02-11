package objetos;

public class Alumno {
	
	private String nombre;
	private int matricula;
	private double not1, not2;
	
	public Alumno(String nombre, int matricula) {
		
		this.nombre = nombre;
		this.matricula = matricula;
		
	}
	
	void ponNota(double not1, double not2) {
		
		this.not1 = not1;
		this.not2 = not2;
		
	}
	
	double dameMedia() {
		
		return (not1 + not2) / 2;
		
	}
	
	public String toString() {
		
		String descripcion = "Nombre: " + nombre + "\n\tMatrícula: " + matricula + "\n\tNota 1: " + not1 + "\n\tNota 2: " + not2 + "\n\tNota Media: " + dameMedia() + "\n\n";
		return descripcion;
		
	}

}
