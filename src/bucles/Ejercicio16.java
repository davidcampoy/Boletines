package bucles;
import java.util.Scanner;

public class Ejercicio16 {
	
	/*
	 * 1.- Pedir al usuario un número entero del número de cifras que éste desee.
	 * 2.- Imprimir dicho número en sentido inverso.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Escribe un número: ");
		num = scan.nextInt();
		scan.close();
		
		do {
			System.out.print(num % 10);
			num = num / 10;
		}while(num > 10);
		
		System.out.println(num);

	}

}
