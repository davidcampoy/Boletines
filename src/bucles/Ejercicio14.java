package bucles;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio14 {
	
	/*
	 * 1.- Pedir al usuario el número mínimo, máximo, los intentos y el número para acertar.
	 * 2.- Hacer que el programa saque números aleatorios hasta que dé con el indicado por el usuario, o se acaben los intentos.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int min, max, tries, num, pcnum = 0;
		
		System.out.println("Introduce el mínimo: ");
		min = scan.nextInt();
		
		System.out.println("Introduce el máximo: ");
		max = scan.nextInt();
		
		System.out.println("Introduce los intentos: ");
		tries = scan.nextInt();
		
		System.out.println("Introduce el número ganador: ");
		num = scan.nextInt();
		
		do {
			
			pcnum = rand.nextInt(max - min + 1) + 1;			
			System.out.println(pcnum);
			
			tries--;
			
		}while(pcnum != num && tries > 0);
		
		scan.close();
		
		if(tries == 0) {
			System.out.println("Se acabaron los intentos.");
		}else {
			System.out.println("El programa acertó tu número.");
		}

	}

}
