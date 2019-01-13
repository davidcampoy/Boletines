package arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 * 1.- Pedir al usuario que introduzca una serie de número enteros.
	 * 2.- Mostrarlos en orden inverso.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nums[] = new int[5], invert[] = new int[5], i, j;
		boolean end = true;
		
		for(i = 0; i < 5; i++) {
			
			do {				//	Introducir los números en el primer array
				end = true;
				
				try {
					
					System.out.println("Introduce un número: ");
					nums[i] = scan.nextInt();
					
				}catch(InputMismatchException e) {
					System.out.println("Error, introduce un valor válido.");
					end = false;
					
				}finally {
					scan.nextLine();
				}
				
			}while(!end);
			
		}
		
		scan.close();
		
		for(j = 0, i = 4; j < 5; j++, i--) {		// Pasar los números del primer array al segundo en orden inverso
			
			invert[j] = nums[i];
			
		}
		
		System.out.print("\nLista de números: ");
		
		for(i = 0; i < 5; i++) {	// Mostrar el primer array
			
			System.out.print(nums[i] + " ");
			
		}
		
		System.out.println();
		
		System.out.print("Números en orden inverso: ");
		
		for(i = 0; i < 5; i++) {	// Mostrar el segundo array
			
			System.out.print(invert[i] + " ");
			
		}

	}

}
