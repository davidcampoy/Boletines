package cadenas;
import java.util.Scanner;

public class Ejercicio3 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena.
	 * 2.- Contar todas las vocales que posea dicha cadena y mostrar el número resultante.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS;
		int vocals = 0;
		
		System.out.println("Introduzca una cadena: ");
		userS = scan.nextLine();
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) {
			
			if(userS.charAt(i) == 'a' || userS.charAt(i) == 'e' || userS.charAt(i) == 'i' || userS.charAt(i) == 'o' || userS.charAt(i) == 'u') {
				
				vocals++;
				
			}else if(userS.charAt(i) == 'A' || userS.charAt(i) == 'E' || userS.charAt(i) == 'I' || userS.charAt(i) == 'O' || userS.charAt(i) == 'U') {
				
				vocals++;
				
			}
			
		}
		
		System.out.println("Número de vocales: " + vocals);

	}

}
