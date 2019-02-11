package objetos;

public class Alimento {
	
	private String nombre, origenAnimal, vitaminas, minerales;
	private int lipidos, hidratosCarbono, proteinas;
	
	public Alimento(String nombre, int lipidos, int hidratosCarbono, int proteinas, String origenAnimal, String vitaminas, String minerales) {
		
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hidratosCarbono = hidratosCarbono;
		this.proteinas = proteinas;
		this.origenAnimal = origenAnimal;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
		
	}
	
	public Alimento(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public enum cantidad{
		A, M, B;
	}
	
	boolean esDietetico() {
		
		
		
	}

}
