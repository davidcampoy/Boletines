package ProgEstructurada;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String sentence;
		int random;
		
		System.out.println("Escribe cualquier cosa: ");
		sentence = scan.nextLine();
		scan.close();
		
		random = rand.nextInt(sentence.length()-1+1)+1;
		
		System.out.println(sentence.charAt(random) + " Posición: " + String.valueOf(random + 1));

	}

}
