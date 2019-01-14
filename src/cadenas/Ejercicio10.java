package cadenas;
import java.util.Scanner;

public class Ejercicio10 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena.
	 * 2.- Buscar y sumar cada dígito que aparezca en la cadena.
	 * 3.- Mostrar el resultado.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS;
		int result = 0;
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		scan.close();
		
		for(int i = 0; i < userS.length(); i++) {
			
			if(userS.charAt(i) == '1') {
				
				result += 1;
				
			}else if(userS.charAt(i) == '2') {
				
				result += 2;
				
			}else if(userS.charAt(i) == '3') {
				
				result += 3;
				
			}else if(userS.charAt(i) == '4') {
				
				result += 4;
				
			}else if(userS.charAt(i) == '5') {
				
				result += 5;
				
			}else if(userS.charAt(i) == '6') {
				
				result += 6;
				
			}else if(userS.charAt(i) == '7') {
				
				result += 7;
				
			}else if(userS.charAt(i) == '8') {
				
				result += 8;
				
			}else if(userS.charAt(i) == '9') {
				
				result += 9;
				
			}
			
		}
		
		System.out.println("Resultado: " + result);

	}

}
