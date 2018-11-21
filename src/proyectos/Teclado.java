package proyectos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Pruebas de las funciones (Retirar las barras de la prueba que se quiera comprobar).
		
		
		//System.out.println(readChar());
		
		//System.out.println(readString());
		
		//System.out.println(readByte());
		
		//System.out.println(readShort());
		
		//System.out.println(readInt());
		
		//System.out.println(readLong());
		
		//System.out.println(readFloat());
		
		//System.out.println(readDouble());
		
	}
	
	public static void closeScan() { // Cerrar teclado
		scan.close();		
	}
	
	/*
	 * 1.- Pedir un carácter al usuario.
	 * 2.- Devolverlo.
	 */
	public static char readChar() {
				
		char character = ' ';
		String string;
		boolean end;
		
		do {
		
			System.out.println("Introduce un carácter: ");
			string = scan.nextLine();
			
			if(string.length() > 1) {
				System.out.println("Introduce solo un carácter.");
				end = false;
			}else {
				character = string.charAt(0);
				end = true;
			}
		
		}while(!end);
		
		return character;
		
	}
	
	/*
	 * 1.- Pedir una cadena al usuario.
	 * 2.- Devolver la cadena.
	 */
	public static String readString() {
		
		String chain;
		
		scan.nextLine();
		System.out.println("Escribe una cadena: ");
		chain = scan.nextLine();
		
		return chain;
		
	}
	
	/*
	 * 1.- Pedir un número comprendido entre -128 y 127.
	 * 2.- Devolver el número.
	 */
	
	public static byte readByte() {
		
		byte num = 0;
		boolean end = true;
		
		do {
			
			try {
		
				System.out.println("Escribe un número comprendido entre -128 y 127: ");
				num = scan.nextByte();
				
				end = true;
			
			}catch(InputMismatchException e) {
				
				end = false;
				
			}finally {
				scan.nextLine();
			}
		
		}while(!end);
		
		return num;
		
	}
	
	/*
	 * 1.- Pedir un número comprendido entre -32768 y 32767.
	 * 2.- Devolver el número.
	 */
	public static short readShort() {
		
		short num = 0;
		boolean end = true;
		
		do {
			
			try {
		
				System.out.println("Escribe un número comprendido entre -32768 y 32767: ");
				num = scan.nextShort();
				
				end = true;
			
			}catch(InputMismatchException e) {
				
				end = false;
				
			}finally {
				scan.nextLine();
			}
		
		}while(!end);
		
		return num;
		
	}
	
	/*
	 * 1.- Pedir un número comprendido entre -2.147.483.648 y 2.147.483.649.
	 * 2.- Devolver el número.
	 */
	public static int readInt() {
		
		int num = 0;
		boolean end = true;
		
		do {
			
			try {
		
				System.out.println("Escribe un número comprendido entre -2.147.483.648 y 2.147.483.649: ");
				num = scan.nextInt();
				
				end = true;
			
			}catch(InputMismatchException e) {
				
				end = false;
				
			}finally {
				scan.nextLine();
			}
		
		}while(!end);
		
		return num;
		
	}
	
	/*
	 * 1.- Pedir un número comprendido entre -9 * 10^18 y 9 * 10^18.
	 * 2.- Devolver el número.
	 */
	public static long readLong() {
		
		long num = 0;
		boolean end = true;
		
		do {
			
			try {
		
				System.out.println("Escribe un número comprendido entre -9 * 10^18 y 9 * 10^18: ");
				num = scan.nextLong();
				
				end = true;
			
			}catch(InputMismatchException e) {
				
				end = false;
				
			}finally {
				scan.nextLine();
			}
		
		}while(!end);
		
		return num;		
	}
	
	/*
	 * 1.- Pedir al usuario un número comprendido entre -3,4 * 10^38 y 3,4 * 10^38.
	 * 2.- Devolver el número.
	 */
	public static float readFloat() {
		
		float num = 0;
		boolean end = true;
		
		do {
			
			try {
		
				System.out.println("Escribe un número comprendido entre -3,4 * 10^38 y 3,4 * 10^38: ");
				num = scan.nextFloat();
				
				end = true;
			
			}catch(InputMismatchException e) {
				
				end = false;
				
			}finally {
				scan.nextLine();
			}
		
		}while(!end);
		
		return num;
	}
	
	/*
	 * 1.- Pedir al usuario un número comprendido entre -1,79 * 10^308 y 1,79 * 10^308.
	 * 2.- Devolver el número.
	 */
	public static double readDouble() {
		
		double num = 0;
		boolean end = true;
		
		do {
			
			try {
		
				System.out.println("Escribe un número comprendido entre -1,79 * 10^308 y 1,79 * 10^308: ");
				num = scan.nextDouble();
				
				end = true;
			
			}catch(InputMismatchException e) {
				
				end = false;
				
			}finally {
				scan.nextLine();
			}
		
		}while(!end);
		
		return num;
	}
	
}
