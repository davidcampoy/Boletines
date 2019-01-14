package cadenas;
import java.util.Scanner;

public class Ejercicio7 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una cadena y un número.
	 * 2.- Copiar en otra cadena letras de la primera cadena hasta el número indicado por el usuario.
	 * 3.- Mostrar la cadena resultante.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userS, resultS = "";
		int num = 0;
		
		System.out.println("Introduce una cadena: ");
		userS = scan.nextLine();
		
		do { // Se pide el número y se comprueba que éste no sea mayor a la longitud de la cadena.
			
			System.out.println("Indica un número: ");
			num = scan.nextInt();
			
			if(num > userS.length()) {
				
				System.out.println("Error, el número no puede ser mayor a la longitud de la cadena.\n");
				scan.nextLine();
				
			}
			
		}while(num > userS.length());
		
		scan.close();
		
		for(int i = 0; i < num; i++) { // Se copian las primeras n letras (condicionadas por la variable num) a la cadena resultante.
			
			resultS += userS.charAt(i);
			
		}
		
		System.out.println("Cadena resultante: " + resultS);

	}

}
