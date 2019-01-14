package Excepciones;

public class Ejercicio5 {
	
	/*
	 * 1.- Recorrer todos los números desde el 1 al 10.000.
	 * 2.- Mostrar solo los que son perfectos y sus divisores.
	 */

	public static void main(String[] args) {
		
		boolean isPerfect = false;
		
		for(int i = 1; i <= 10000; i++) {
			
			isPerfect = perfect(i);
			
			if(isPerfect == true) {
				System.out.print(i + " = ");
				factors(i, isPerfect);
			}
			
		}

	}
	
	/*
	 * 1.- Comprueba si un número indicado es perfecto o no.
	 * 1.1.- Se sacarán todos los divisores de dicho número.
	 * 1.2.- Se sumarán todos los divisores y se comprobarán si da como resultado el número indicado.
	 * 2.- Devolver verdadero en caso de que la suma de el número indicado como resultado, y falso en caso contrario.
	 */
	
	public static boolean perfect(int num) {
		
		boolean result = false;
		
		int count = 0;
		
		for(int i = 1; i < num; i++) {
			
			if(num % i == 0) {
				count += i;
			}
			
		}
		
		if(count == num) {
			result = true;
		}
		
		return result;
		
	}
	
	/*
	 * 1.- Mostrar todos los divisores de un número perfecto.
	 */
	
	public static void factors(int num, boolean isPerfect) {
		
		int count = 0;
		
		if(isPerfect == true) {
			
			for(int i = 1; i < num; i++) {
				
				if(num % i == 0) {
					System.out.print(i);
					count += i;
					
					if(count != num) {
						System.out.print(" + ");
					}
					
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}
