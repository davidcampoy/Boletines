package cadenas;
import java.util.Scanner;

public class Ejercicio13 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena.
	 * 2.- Contar cuantas palabras tiene dicha cadena.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS;
		int count = 1;
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) {
			
			if(userS.charAt(i) == ' ') {
				
				count++;
				
			}
			
		}
		
		System.out.println("Palabras encontradas: " + count);

	}

}
