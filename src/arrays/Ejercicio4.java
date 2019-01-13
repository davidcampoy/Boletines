package arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 * 1.- Mostrar al usuario una lista de caracteres.
	 * 2.- Pedir al usuario que indique un carácter en una posición de la lista en concreto.
	 * 3.-Desplazar el resto de caracteres una posición a la derecha.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char characters[] = {'a', 'j', 'd', 'y', 'k', ' '}, letter;
		int position = 0;
		boolean exit = true;
		
		System.out.print("Lista actual: ");
		System.out.println(characters);
		
		do {
			
			do {
				exit = true;
				
				try {
					
					System.out.println("Indica en qué posición desear introducir el carácter (indica 6 si quieres introducir el carácter al final de la lista): ");
					position = scan.nextInt();
					
				}catch(InputMismatchException e) {
					exit = false;
					
				}finally {
					scan.nextLine();
				}
				
			}while(!exit);
		
		}while(position <= 0 || position > characters.length);

		
		System.out.println("indica el carácter: ");
		letter = scan.next().charAt(0);
		
		scan.close();
		
		for(int i = characters.length - 1; i >= position; i--) {
			
			characters[i] = characters[i - 1];
			
		}
		
		characters[position - 1] = letter;
		
		System.out.print("Lista actualizada: ");
		System.out.println(characters);

	}

}
