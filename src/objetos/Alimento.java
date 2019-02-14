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
		
		if(lipidos < 20 && vitaminas != "B") {
			return true;
			
		}else {
			return false;
		}
	}
	
	public String toString() {
		
		String descripcion = "Nombre: " + nombre + "\nLípidos: " + lipidos + "\nHidratos de carbono: " + hidratosCarbono + "\nProteinas: " + proteinas + "\nDe origen animal: " + origenAnimal + "\nVitaminas: " + vitaminas + "\nMinerales: " + minerales;
		return descripcion;
		
	}
	
	boolean esRecomendableParaDeportistas() {
		
		if(proteinas > 10 && proteinas < 15 && lipidos > 30 && lipidos < 35 && hidratosCarbono > 55 && hidratosCarbono < 65) {
			return true;
			
		}else {
			return false;
		}
	}
	
//	double calculaContenidoEnergetico() {
//		
//		
//		
//	}

}
