package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	
	/*
	 * 1.- Pedir dos números al usuario.
	 * 2.- Dividir a ambos entre números desde el 1 hasta el mayor de ellos.
	 * 3.- Cuando se acabe, mostrar de los que hayan salido resto cero con ambos números, el mayor.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean end = true;
		int num1 = 0, num2 = 0, result = 0;
		
		do {
			end = true;
			
			try {
				
				System.out.println("Indica el primer número: ");
				num1 = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		do {
			end = true;
			
			try {
				
				System.out.println("Indica el segundo número: ");
				num2 = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		for(int i = 1; i <= Math.max(num1, num2); i++) {
			
			if(num1 % i == 0 && num2 % i == 0) {
				result = i;
			}
			
		}
		
		System.out.println("M.C.D = " + result);
		
		scan.close();

	}

}
