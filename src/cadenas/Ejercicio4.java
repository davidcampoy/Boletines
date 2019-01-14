package cadenas;
import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena y una letra cualquiera aparte.
	 * 2.- Contar cuantas veces aparece dicha letra en la cadena indicada.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS;
		char word;
		int count = 0;
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		System.out.println("Indica la letra que desea contar: ");
		word = scan.next().charAt(0);
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) {
			
			if(userS.charAt(i) == word) {
				count++;
			}
			
		}
		
		System.out.println("Número de apariciones de dicha letra: " + count);

	}

}
