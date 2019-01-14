package arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	
	/*
	 * 1.- Pedir al usuario la cantidad de enteros que habrá. Pedir además que introduzca los enteros.
	 * 2.- Sumar los enteros y mostrar el resultado.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, sum[], i, result = 0;
		boolean end = true;
		
		do {				// Petición del número de enteros (tamaño del array)
			end = true;
			
			try {
				
				System.out.println("Indica cuantos enteros habrá: ");
				num = scan.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("Error, introduce un número válido.");
				end = false;
				
			}finally {
				scan.nextLine();
			}
			
		} while (!end);
		
		sum = new int[num];
		
		for(i = 0; i < num; i++) {		// Introduce los valores en el array
			
			do {
				end = true;
				
				try {
					
					System.out.println("Introduce un número entero: ");
					sum[i] = scan.nextInt();
					
				}catch(InputMismatchException e) {
					end = false;
					System.out.println("Error, indica un valor válido.");
					
				}finally {
					scan.nextLine();
				}
				
			} while (!end);
			
		}
		
		scan.close();
		
		System.out.print("Números introducidos: ");
		
		for(i = 0; i < num; i++) {
			
			System.out.print(sum[i] + " ");
			result += sum[i];
			
		}
		
		System.out.println();
		
		System.out.println("Resultado de la suma: " + result);

	}

}
