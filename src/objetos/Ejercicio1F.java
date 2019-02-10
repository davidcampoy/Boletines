package objetos;

public class Ejercicio1F {

	public static void main(String[] args) {
		
		Persona ppl1 = new Persona("Eustaquio", 25, 1.82f, "Basurero", 654.26f);
		Persona ppl2 = new Persona("Firulais", 30, 1.75f, "Gerente de banco", 2150.83f);
		
		System.out.printf("Trabajador 1:\n\tNombre: %s\n\tEdad: %d\n\tAltura: %.2f\n\tOcupación: %s\n\tSueldo: %.2f€\n\n", ppl1.getNombre(), ppl1.getEdad(), ppl1.getAltura(), ppl1.getOcupacion(), ppl1.getSueldo());
		System.out.printf("Trabajador 2:\n\tNombre: %s\n\tEdad: %d\n\tAltura: %.2f\n\tOcupación: %s\n\tSueldo: %.2f€\n\n", ppl2.getNombre(), ppl2.getEdad(), ppl2.getAltura(), ppl2.getOcupacion(), ppl2.getSueldo());
		
		System.out.println("Sumar el sueldo del trabajador 1 al trabajador 2: ");
		
		ppl2.sumarSueldo(ppl1);
		System.out.printf("\tSueldo trabajador 2: %.2f€\n\n", ppl2.getSueldo());
		
		System.out.println("Doblar sueldo trabajador 1: ");
		
		ppl1.doblarSueldo();
		System.out.printf("\tSueldo trabajador 1: %.2f€", ppl1.getSueldo());
		
	}

}
