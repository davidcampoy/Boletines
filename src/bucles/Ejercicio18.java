package bucles;
import java.util.Scanner;

public class Ejercicio18 {
	
	/*
	 * 1.- Pedir al usuario la base del rombo y el carácter con el que se imprimirá este.
	 * 2.- Pintar un triángulo con el número de líneas y el carácter indicado por el usuario.
	 * 3.- Una vez terminado el usuario, completar justo debajo el dibujo del rombo.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, i, j, k;
		String character;
		
		System.out.println("Escribe la base del rombo: ");
		num = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Escribe el carácter con el que quieres que se complete el rombo: ");
		character = scan.nextLine();
		
		scan.close();
		
		// Primera parte del rombo (triangulo).
		for(i = 1; i <= num; i++) { // Filas
			
			for(j = 1; j <= num-i; j++) { // Espacios
				System.out.print(" ");
			}
			
			for(k = num; k > num-i; k--) { // Asteriscos
				System.out.print(character + " ");
			}
			
			System.out.println("");
			
		}
		
		// Segunda parte del rombo.
		for(i = 1; i < num; i++) { // Filas
			
			for(j = num; j > num-i; j--) { // Espacios
				System.out.print(" ");
			}
			
			for(k = 1; k <= num-i; k++) { // Asteriscos
				System.out.print(character + " ");
			}
			
			System.out.println("");
			
		}

	}

}
