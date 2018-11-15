package bucles;
import java.util.Scanner;

public class Ejercicio2 {
	
/*
 * 1.- Pedir dos números positivos.
 * 2.- Sumar el primer número tantas veces como indique el segundo.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, end = 0;
		
		System.out.println("Introduce el primer número: ");
		num1 = scan.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= num2; i++) {
			end += num1;
		}
		
		System.out.printf("%d * %d = %d", num1, num2, end);

	}

}
