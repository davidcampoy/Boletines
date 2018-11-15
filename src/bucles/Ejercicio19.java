package bucles;
import java.util.Scanner;

public class Ejercicio19 {
	
	/*
	 * 1.- Pedir al usuario la base del triángulo.
	 * 2.- Pintar un triángulo con el número de lineas que haya indicado el usuario.
	 * 3.- El triángulo debe estar formado por números correlativos, es decir, tendrá números de 1 a n, hasta que se acabe esa línea.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int base, num = 1;
		
		System.out.println("Escribe la base del triángulo: ");
		base = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= base; i++) { // Filas
			
			for(int j = 1; j <= base-i; j++) { // Espacios
				System.out.print(" ");
			}
			
			for(int k = base; k > base-i; k--) { // Asteriscos
				System.out.print(num + " ");
				num++;
			}
			
			num = 1;
			
			System.out.println("");
			
		}

	}

}
