package bucles;
import java.util.Scanner;

public class Ejercicio1 {
	
/* 
 * 1.- Pedir un número entre 0 y 10.
 * 2.- Mostrar la tabla de multiplicar de dicho número.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Escribe un número del 1 al 10: ");
		num = scan.nextInt();
		scan.close();
		
		if(num >= 0 && num <= 10) {
			for(int i = 0; i <= 10; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
		}else {
			System.out.println("El número que ha introducido no está comprendido entre 0 y 10.");
		}

	}

}
