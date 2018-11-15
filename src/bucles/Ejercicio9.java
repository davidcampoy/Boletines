package bucles;
import java.util.Scanner;

public class Ejercicio9 {
	
/*
 * 1.- Pedir dos números, un número entero cualquiera y su potencia.
 * 2.- Multiplicar el número por sí mismo tantas veces como indique la potencia.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, pow = 0, result = 0;
		
		System.out.println("Indica el número: ");
		num = scan.nextInt();
		result = num;
		
		System.out.println("Indica la potencia: ");
		pow = scan.nextInt();
		scan.close();
		
		for(int i = 1; i<pow; i++) {
			result *= num;
		}
		
		System.out.printf("%d elevado a %d = %d", num, pow, result);

	}

}
