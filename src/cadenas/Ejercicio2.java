package cadenas;
import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena.
	 * 2.- Suprimir los espacios en blanco.
	 * 3.- Mostrar la cadena resultante.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS, resultS = "";
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) { // Suprimir espacios
			
			if(userS.charAt(i) != ' ') {
				
				resultS += userS.charAt(i);
				
			}
			
		}
		
		System.out.println("Cadena resultante: " + resultS);

	}

}
