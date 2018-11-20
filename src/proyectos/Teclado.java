package proyectos;
import java.util.Scanner;

public class Teclado {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(readCharacter());
		
		System.out.println(readChain());
		
	}
	
	public static void closeScan() { // Cerrar teclado
		scan.close();		
	}
	
	/*
	 * 1.- Pedir un carácter al usuario.
	 * 2.- Devolverlo.
	 */
	
	public static char readCharacter() {
				
		char character;
		
		System.out.println("Introduce un carácter: ");
		character = scan.next().charAt(0);
		
		return character;
		
	}
	
	/*
	 * 1.- Pedir una cadena al usuario.
	 * 2.- Devolver la cadena.
	 */
	
	public static String readChain() {
		
		String chain;
		
		System.out.println("Escribe una cadena: ");
		chain = scan.nextLine();
		
		return chain;
		
	}

}
