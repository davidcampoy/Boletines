package objetos;

public class Ejercicio1D {

	public static void main(String[] args) {
		
		Persona ppl1 = new Persona("Firulais", 19, 1.8f, "Chatarrero", 50.90f);
		
		System.out.printf("Nombre = %s\nEdad = %d\nAltura = %.2f\nOcupación = %s", ppl1.getNombre(), ppl1.getEdad(), ppl1.getAltura(), ppl1.getOcupacion(), ppl1.getSueldo());

	}

}
