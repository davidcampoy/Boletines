package Excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
	
	/*
	 * 1.- Pedir al usuario dos números enteros y un símbolo de operación.
	 * 2.- Realizar la operación.
	 * 3.- Devolver el resultado.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, result = 0;
		char operation = ' ';
		
		try {
				
			System.out.println("Indica el primer número: ");
			num1 = scan.nextInt();
			
			System.out.println("Indica el segundo número: ");
			num2 = scan.nextInt();
			
			System.out.println("Indica el símbolo operacional: ");
			operation = scan.next().charAt(0);
			
			if(operation == '+') {
				result = num1 + num2;
				System.out.printf("%d %c %d = %d", num1, operation, num2, result);
				
			}else if(operation == '-') {
				result = num1 - num2;
				System.out.printf("%d %c %d = %d", num1, operation, num2, result);
				
			}else if(operation == '*') {
				result = num1 * num2;
				System.out.printf("%d %c %d = %d", num1, operation, num2, result);
				
			}else if(operation == '/') {
				result = num1 / num2;
				System.out.printf("%d %c %d = %d", num1, operation, num2, result);
				
			}else {
				System.out.println("Error al indicar el símbolo de operación.");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Error al indicar uno de los números.");
			
		}catch(ArithmeticException e) {
			System.out.println("Error en la división (no se puede dividir un número entre cero.)");
		}
		
		scan.close();
		
	}

}
