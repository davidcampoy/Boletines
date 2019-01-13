package cadenas;
import java.util.Scanner;

public class Ejercicio9 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena.
	 * 2.- Imprimir esa misma cadena en orden inverso.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS, resultS = "";
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		scan.close();
		
		for(int i = userS.length() - 1; i >= 0; i--) {
			
			resultS += userS.charAt(i);
			
		}
		
		System.out.println("Cadena resultante: " + resultS);

	}

}
