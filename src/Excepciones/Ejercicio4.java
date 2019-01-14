package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 * 1.- Pedir un número entero.
	 * 2.- Descomponer dicho número en sus factores (dichos factores deben ser números primos)
	 * 3.- Mostrar los factores.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean end = true, prime = false;
		int num = 0;
		
		do {
			end = true;
			
			try {
				
				System.out.println("Indica un número entero: ");
				num = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		for(int i = 2; i <= num; i++) {
			
			prime = Ejercicio3.prime(i);
			
			if(prime == true) {
				while(num % i == 0) {
					System.out.print(i);
					num = num / i;
					
					if(i <= num) {
						System.out.print(" * ");
					}
					
				}
						
			}
				
		}
		
		scan.close();
		
	}
		
}
