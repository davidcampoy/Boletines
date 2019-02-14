package objetos;

public class Vehiculo {
	
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	public Vehiculo(String modelo) {
		
		this.modelo = modelo;
		
	}
	
	void setPotencia(double potencia) {
		this.potencia = potencia;
		
	}
	
	double getPotencia() {
		return potencia;
		
	}
	
	void setCRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
		
	}
	
	boolean getCRuedas() {
		return cRuedas;
		
	}
	
	public String toString() {
		
		return String.format("Modelo: %s\nPotencia: %.2f\nTracción a las cuatro ruedas: %s\n", modelo, potencia, cRuedas?"Si":"No");
		
	}

}
