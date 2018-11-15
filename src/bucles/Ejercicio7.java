package bucles;
import java.util.Scanner;

public class Ejercicio7 {
	
/*
 * 1.- Pedir un número mínimo y máximo. Pasar por cada uno de los números desde el mínimo al máximo.
 * 2.- Si el número dividido entre 2 da de resto cero será par, en caso contrario, será impar.
 * 3.- Sumar todos los pares juntos, y por otro lado los impares.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int min = 0, max = 0, par = 0, impar = 0;
		
		System.out.println("Introduce el número mínimo: ");
		min = scan.nextInt();
		
		System.out.println("Introduce el número máximo: ");
		max = scan.nextInt();
		scan.close();
		
		for(int i = min; i<= max; i++) {
			
			if(i % 2 == 0) {
				par += i;
			}else {
				impar += i;
			}
		}
		
		System.out.printf("Suma de los pares: %d\nSuma de los impares: %d", par, impar);

	}

}
