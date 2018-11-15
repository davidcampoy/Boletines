package bucles;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio13 {
	
	/*
	 * 1.- Pedir al usuario el número máximo y mínimo, además del número de intentos.
	 * 2.- Sacar un número aleatorio entre ese rango, pero no mostrarlo al usuario.
	 * 3.- Pedir al usuario que introduzca un número entre el rango indicado.
	 * 4.- Si el número no coincide con el número generado, se le seguirá pidiendo al usuario que introduzca un número, restando un intento cada vez.
	 * 5.- El programa terminará cuando el usuario acierte el número o cuando acabe el número de intentos.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int max , min , tries , num , usernum = 0;
		
		System.out.println("Introduce el mínimo: ");
		min = scan.nextInt();
		
		System.out.println("Introduce el máximo: ");
		max = scan.nextInt();
		
		System.out.println("Introduce el número de intentos: ");
		tries = scan.nextInt();
		
		num = rand.nextInt(max - min + 1) + min;
		
		do{
			System.out.println("Prueba suerte: ");
			usernum = scan.nextInt();
			
			tries--;
			
			
		}while(usernum != num && tries > 0);
		
		scan.close();
		
		if(tries == 0) {
			System.out.println("Se acabaron los intentos.");
		}else {
			System.out.println("Enhorabuena, has acertado el número!");
		}

	}

}
