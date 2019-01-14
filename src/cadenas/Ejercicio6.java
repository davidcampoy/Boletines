package cadenas;
import java.util.Scanner;

public class Ejercicio6 {
	
	/*
	 * 1.- Pedir al usuario que introduzca dos cadenas.
	 * 2.- Juntar las dos cadenas en una y mostrarlas.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s1, s2, s3 = "";
		int i;
		
		System.out.println("Introduce la primera cadena: ");
		s1 = scan.nextLine();
		
		System.out.println("Introduce la segunda cadena: ");
		s2 = scan.nextLine();
		
		scan.close();
		
		for(i = 0; i < s1.length(); i++) { // Añadir la primera cadena letra por letra
			
			s3 += s1.charAt(i);
			
		}
		
		s3 += " ";
		
		for(i = 0; i < s2.length(); i++) { // Añadir la segunda cadena letra por letra
			
			s3 += s2.charAt(i);
			
		}
		
		System.out.println("Cadena resultante: " + s3); // Mostrar la cadena

	}

}
