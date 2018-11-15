package bucles;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
	
/*
 * 1.- Solicitar el rango al usuario.
 * 2.- Generar 15 números aleatorios entre ese rango.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int min = 0, max = 0;
		
		System.out.println("Introduce el número mínimo: ");
		min = scan.nextInt();
		
		System.out.println("Introduce el número máximo: ");
		max = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= 15; i++) {
			System.out.println(rand.nextInt(max - min + 1)+ min);
		}

	}

}
