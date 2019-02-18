package objetos;

public class Alimento {
	
	private String nombre, origenAnimal;
	private char  vitaminas, minerales;
	private int lipidos, hidratosCarbono, proteinas;
	
	public Alimento(String nombre, int lipidos, int hidratosCarbono, int proteinas, String origenAnimal, char vitaminas, char minerales) {
		
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
		ALTO('A'), MEDIO('M'), BAJO('B');
		
		private final char code;
		
		cantidad(char code){
			this.code = code;
		}
		
		char getCantidad(){
			return code;
		}
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setLipidos(int lipidos) {
		this.lipidos = lipidos;
	}
	
	int getLipidos() {
		return lipidos;
	}
	
	void setHidratosCarbono(int hidratosCarbono) {
		this.hidratosCarbono = hidratosCarbono;
	}
	
	int getHidratosCarbono() {
		return hidratosCarbono;
	}
	
	void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}
	
	int getProteinas() {
		return proteinas;
	}
	
	void setOrigenAnimal(String origenAnimal) {
		this.origenAnimal = origenAnimal;
	}
	
	String getOrigenAnimal() {
		return origenAnimal;
	}
	
	void setVitaminas(char vitaminas) {
		this.vitaminas = vitaminas;
	}
	
	char getVitaminas() {
		return vitaminas;
	}
	
	void setMinerales(char minerales) {
		this.minerales = minerales;
	}
	
	char getMinerales() {
		return minerales;
	}
	
	boolean esDietetico() {
		
		if(lipidos < 20 && vitaminas != cantidad.BAJO.getCantidad()) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public String toString() {
		
		String descripcion = "Nombre: " + nombre + "\nLípidos: " + lipidos + "%\nHidratos de carbono: " + hidratosCarbono + "%\nProteinas: " + proteinas + "%\nDe origen animal: " + origenAnimal + "\nVitaminas: " + vitaminas + "\nMinerales: " + minerales;
		return descripcion;
		
	}
	
	boolean esRecomendableParaDeportistas() {
		
		if(proteinas >= 10 && proteinas <= 15 && lipidos >= 30 && lipidos <= 35 && hidratosCarbono >= 55 && hidratosCarbono <= 65) {
			return true;
			
		}else {
			return false;
		}
	}
	
	double calculaContenidoEnergetico() {
		
		double kcalLipidos, kcalHC, kcalProteinas, totalKcal;
		
		kcalLipidos = lipidos * 9.4;
		kcalHC = hidratosCarbono * 4.1;
		kcalProteinas = proteinas * 5.3;
		
		totalKcal = kcalLipidos + kcalHC + kcalProteinas;
		
		return totalKcal / 100;
		
	}

}
