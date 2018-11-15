package bucles;
import java.util.Scanner;

public class Ejercicio10 {
	
/*
 * 1.- Pedir un número entero positivo.
 * 2.- Multiplicar dicho número por todos los números desde 2 hasta dicho número.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, result = 1;
		
		do {
		
			System.out.println("Escribe un número entero positivo: ");
			num = scan.nextInt();
			
			
			for(int i = 2; i<=num; i++) {
				result*=i;
			}
		
		}while(num <= 0);
		
		scan.close();
		System.out.println(result);

	}

}
