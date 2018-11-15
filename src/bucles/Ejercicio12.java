package bucles;
import java.util.Scanner;

public class Ejercicio12 {
	
	/*
	 * 1.- Pedir un número al usuario.
	 * 2.- Buscar el primer número de la serie de Fibonacci que sea mayor o igual que el número introducido por el usuario.
	 * 3.- Mostrar el resultado. 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, a0 = 0, a1 = 1, result = 0;
		
		System.out.println("Introduce un número: ");
		num = scan.nextInt();
		scan.close();
		
		do {
			
			result = a0 + a1;
			
			a0 = a1;
			a1 = result;
			
		}while(result < num);
		
		System.out.printf("El número de la serie Fibonacci equivalente o mayor al número introducido es: %d", result);

	}

}
