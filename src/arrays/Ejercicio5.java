package arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	
	/*
	 * 1.- Pedir al usuario que rellene una lista con números enteros.
	 * 2.- Preguntar al usuario de qué número desea conocer las veces que aparece en la lista y sus posiciones.
	 * 3.- Buscar cuántas veces aparece dicho número y sus respectivas posiciones en caso de aparecer.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int list[] = new int[10], num = 0, i, count = 0;
		boolean end = true;
		String positions = "";
		
		for(i = 0; i < list.length; i++) {
			
			do {				// Rellenar la lista
				end = true;
				
				try {
					
					System.out.println("Introduce un número entero: ");
					list[i] = scan.nextInt();
					
				}catch(InputMismatchException e) {
					end = false;
					
				}finally {
					scan.nextLine();
				}
				
			}while(!end);
			
		}
		
		do {					// Indicar el número a buscar
			end = true;
			
			try {
				
				System.out.println("Indica de qué número deseas conocer las posiciones en la lista: ");
				num = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
				
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		scan.close();
		
		for(i = 0; i < list.length; i++) {		// Búsqueda del número y sus posiciones
			
			if(list[i] == num) {
				count++;
				positions += (i + 1);
				positions += ", ";
			}
			
		}
		
		System.out.printf("El número %d se repite %d veces.\n", num, count);
		System.out.println("Las posiciones que contienen el valor " + num + " son: " + positions);

	}

}
