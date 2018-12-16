package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 * 1.- Pedir dos números enteros, o dos números decimales y un operador.
	 * 2.- Realizar la operación.
	 * 3.- Devolver el resultado.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean end = true;
		int whole1 = 0, whole2 = 0, wholeResult;
		double dec1 = 0, dec2 = 0, decResult;
		char symbol;
		
		System.out.println("Función con números enteros.");
		
		do {	// Primer número entero
			end = true;
			
			try { 
				
				System.out.println("Introduce el primer número entero: ");
				whole1 = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		do {	// Segundo número entero
			end = true;
			
			try { 
				
				System.out.println("Introduce el segundo número entero: ");
				whole2 = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		do {	// Símbolo de operación (números enteros)
			end = true;
				
			System.out.println("Introduce el símbolo de operación: ");
			symbol = scan.next().charAt(0);
				
			if(symbol != '*' && symbol != '/' && symbol != '-' && symbol != '+') {
				end = false;
				System.out.println("Indica un símbolo de operación válido ( +  -  *  / )");
			}else {
				wholeResult = operation(whole1, whole2, symbol);
				System.out.println("Resultado de la operación con números enteros: " + wholeResult);
			}
			
		}while(!end);
		
		
		System.out.println("\nFunción con números decimales");
		
		do {	// Primer número decimal
			end = true;
			
			try { 
				
				System.out.println("Introduce el primer número decimal: ");
				dec1 = scan.nextDouble();
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		do {	// Segundo número decimal
			end = true;
			
			try { 
				
				System.out.println("Introduce el segundo número decimal: ");
				dec2 = scan.nextDouble();
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		do {	// Símbolo de operación (números decimales)
			end = true;
				
			System.out.println("Introduce el símbolo de operación: ");
			symbol = scan.next().charAt(0);
				
			if(symbol != '*' && symbol != '/' && symbol != '-' && symbol != '+') {
				end = false;
				System.out.println("Indica un símbolo de operación válido ( +  -  *  / )");
			}else {
				decResult = operation(dec1, dec2, symbol);
				System.out.println("Resultado de la operación con números enteros: " + decResult);
			}
			
		}while(!end);
		
		scan.close();
		
	}
	
	/*
	 * 1.- Calcular dos números enteros según el símbolo de operación indicado.
	 * 2.- Devolver el resultado.
	 */
	
	public static int operation(int num1, int num2, char symbol) {		// Función para números enteros
		
		int result = 0;
		
		if(symbol == '+') {
			result = num1 + num2;
			
		}else if(symbol == '-') {
			result = num1 - num2;
			
		}else if(symbol == '*') {
			result = num1 * num2;
			
		}else if(symbol == '/') {
			try {		// Capturar excepción en caso de que la división sea entre cero.
				result = num1 / num2;
			}catch(ArithmeticException e) {
				System.out.println("Error, no se puede efectuar una división entre cero con números enteros.");
			}
		}
		
		return result;
		
	}
	
	/*
	 * 1.- Calcular dos números decimales según el símbolo de operación indicado.
	 * 2.- Devolver el resultado.
	 */
	
	public static double operation(double num1, double num2, char symbol) {		// Función para números decimales
		
		double result = 0;
		
		if(symbol == '+') {
			result = num1 + num2;
			
		}else if(symbol == '-') {
			result = num1 - num2;
			
		}else if(symbol == '*') {
			result = num1 * num2;
			
		}else if(symbol == '/') {
			result = num1 / num2;
		}
		
		return result;
		
	}

}
