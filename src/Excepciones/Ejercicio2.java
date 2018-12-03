package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 * 1.- Pedir dos números enteros, o dos números decimales y un operador.
	 * 2.- Realizar la operación.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean end;
		
		do {
			end = true;
			
			try {
				
				
				
			}catch(InputMismatchException e) {
				end = false;
			}
			
		}while(!end);
		
	}

}
