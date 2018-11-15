package bucles;
import java.util.Scanner;

public class Ejercicio8 {
	
/*
 * 1.- Pedir dos números, uno mayor que otro.
 * 2.- El número menor irá aumentando el doble de su valor, y el mayor irá desdenciendo la mitad de su valor.
 * 3.- Esto sucederá hasta que el menor sea más grande que el mayor.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int min = 0, max = 0;
		
		System.out.println("Indica el número mínimo: ");
		min = scan.nextInt();
		
		System.out.println("Indica el número máximo: ");
		max = scan.nextInt();
		scan.close();
		
		for(int i = min, j = max; i<=j; i += i, j -= j / 2) {
			System.out.printf("Mínimo: %d  Máximo: %d\n", i, j);
		}

	}

}
