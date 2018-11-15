package bucles;
import java.util.Scanner;

public class Ejercicio17 {
	
	/*
	 * 1.- Pedir un número entero al usuario.
	 * 2.- Pintar, en tantas líneas como haya indicado el usuario, asteriscos de manera que formen una pirámide.
	 * 3.- La última línea tendrá el mismo número de asteriscos que de líneas.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Escribe la base del triangulo: ");
		num = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= num; i++) { // Filas
			
			for(int j = 1; j <= num-i; j++) { // Espacios
				System.out.print(" ");
			}
			
			for(int k = num; k > num-i; k--) { // Asteriscos
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}

	}

}
