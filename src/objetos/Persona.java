package objetos;

public class Persona {
	
	private String nombre;
	private int edad;
	private float altura;
	private String ocupacion;
	private float sueldo;
	
	public Persona() {
		
		nombre = "\"Sin nombre\"";
		edad = 0;
		altura = 0.0f;
		ocupacion = "\"Sin ocupación\"";
		
	}
	
	public Persona(String nombre, int edad, float altura, String ocupacion, float sueldo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.ocupacion = ocupacion;
		this.sueldo = sueldo;
		
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	int getEdad() {
		return edad;
	}
	
	void setEdad(int edad) {
		this.edad = edad;
	}
	
	float getAltura() {
		return altura;
	}
	
	void setAltura(float altura) {
		this.altura = altura;
	}
	
	String getOcupacion() {
		return ocupacion;
	}
	
	void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	float getSueldo() {
		return sueldo;
	}
	
	void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	void sumarSueldo(Persona ppl) {
		
		this.sueldo += ppl.sueldo;
		
	}
	
	void doblarSueldo() {
		
		this.sueldo *= 2;
		
	}

}
