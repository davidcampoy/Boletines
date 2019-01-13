package cadenas;
import java.util.Scanner;

public class Ejercicio5 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena y una letra cualquiera aparte.
	 * 2.- Contar cuantas letras hay entre la primera y la última aparición de dicha letra.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS;
		char word;
		int count = 0, first = 0, fAid = 0, last = 0;
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		System.out.println("Indica la letra que desea contar: ");
		word = scan.next().charAt(0);
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) {
			
			if(userS.charAt(i) == word && fAid == 0) {
				
				first = i;
				fAid++;
				
			}else if(userS.charAt(i) == word) {
				last = i;
			}
			
		}
		
		count = last - first - 1;
		
		System.out.println("Número de letras entre ambas apariciones: " + count);

	}

}
