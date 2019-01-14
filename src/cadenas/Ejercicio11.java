package cadenas;
import java.util.Scanner;

public class Ejercicio11 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena y un carácter aparte.
	 * 2.- Reemplazar en dicha cadena todos los caractéres que haya indicado el usuario por asteriscos.
	 * 3.- Mostrar la cadena resultante.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS, resultS = "";
		char word;
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		System.out.println("Introduce un carácter: ");
		word = scan.next().charAt(0);
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) {
			
			if(userS.charAt(i) == word) { // En caso de coincidir con la letra indicada, se añade un asterisco en lugar de la letra.
				
				resultS += "*";
				
			}else {
				
				resultS += userS.charAt(i); // En caso contrario, se añade la letra tal cual.
				
			}
			
		}
		
		System.out.println("Cadena resultante: " + resultS);

	}

}
