package Excepciones;

public class Ejercicio3 {
	
	/*
	 * 1.- Mostrar todos los números primos comprendidos entre 1 y 10.000
	 */

	public static void main(String[] args) {
		
		boolean isPrime;
		
		for(int i = 1; i<=10000; i++) {
			
			isPrime = prime(i);
			
			if(isPrime == true) {
				System.out.println(i);
			}
			
		}

	}
	
	/*
	 * 1.- Comprobar si un número es primo o no.
	 */
	
	public static boolean prime(int num) {
		
		boolean result = false;
		int count = 0;
		
		for(int i = 1; i<= num; i++) {
			
			if(num % i == 0) { // Si el resto es cero, sumar 1 al contador.
				count++;
			}
		}
		
		if(count == 2) { // Si el contador equivale a 2 (resto cero en la división entre 1 y sí mismo), devolverá true porque significará que el número es primo.
			result = true;
		}
		
		return result;
		
	}

}
