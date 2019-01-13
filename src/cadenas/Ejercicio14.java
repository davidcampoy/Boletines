package cadenas;

import java.util.Scanner;

public class Ejercicio14 {

	/*
	 * 1.- Pedir al usuario que introduzca una cadena.
	 * 2.- Contar cuantas palabras tiene dicha cadena.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS;
		int count = 0, aid = 0;
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) {
			
			if(userS.charAt(i) != ' ') {
				
				aid++;
				
			}else {
				aid = 0;
			}
			
			if(aid == 1) {
				
				count++;
				
			}
			
		}
		
		System.out.println("Palabras encontradas: " + count);

	}

}
