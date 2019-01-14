package arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nums[] = new int[5], position = 0;
		boolean end = true, exit = true;
		char ask;
		
		nums = fill(nums);
		
		do {
			end = true;
			
			do {
				
				do {
					exit = true;
					
					try {
						
						System.out.println("Indica la posición de la lista que desea mostrar: ");
						position = scan.nextInt();
						
					}catch(InputMismatchException e) {
						exit = false;
						System.out.println("Error, indica una posición válida.");
						
					}finally {
						scan.nextLine();
					}
					
				}while(!exit);
				
			}while(position <= 0 || position > nums.length);
			
			show(nums, position - 1);
			
			do {
				
				System.out.println("¿Desea mostrar otra posición? (S/N): ");
				ask = scan.next().charAt(0);
				
			}while(ask != 's' && ask != 'S' && ask != 'n' && ask != 'N');
			
			if(ask == 's' || ask == 'S') {
				end = false;
			}else if (ask == 'n' || ask == 'N') {
				end = true;
			}
			
		}while(!end);

	}
	
	/*
	 * 1.- Recibe una lista.
	 * 2.- Se pide al usuario que la rellene con números enteros.
	 * 3.- Se devuelve la lista.
	 */
	public static int[] fill(int array[]) {
		
		boolean exit = true;
		
		for(int i = 0; i < array.length; i++) {
			
			do {
				exit = true;
				
				try {
				
					System.out.println("Indica un número entero: ");
					array[i] = scan.nextInt();
				
				}catch(InputMismatchException e) {
					exit = false;
					System.out.println("Error, indica un valor entero válido.");
					
				}finally {
					scan.nextLine();
				}
				
			}while(!exit);
			
		}
		
		return array;
		
	}
	
	/*
	 * 1.- Recibe una posición de una lista.
	 * 2.- Muestra el valor de la lista en dicha posición.
	 */
	public static void show(int array[], int num) {
		
		System.out.println("Valor: " + array[num] + " Posición: " + (num + 1));
		
	}

}
