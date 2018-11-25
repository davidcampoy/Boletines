package proyectos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	
	static Scanner scan = new Scanner(System.in);
	
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
			
			if(string.length() > 1) { // En caso de introducir varios caracteres se repite la función.
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
		
				System.out.println("Escribe un número: ");
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
		
				System.out.println("Escribe un número: ");
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
		
				System.out.println("Escribe un número: ");
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
		
				System.out.println("Escribe un número: ");
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
		
				System.out.println("Escribe un número decimal: ");
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
		
				System.out.println("Escribe un número decimal: ");
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
	
	// Opciones para las funciones compNum
	public enum Compare{
		Mayor_o_igual, Menor_o_igual, Mayor, Menor;
	}
	
	/*
	 * 1.- Indicarle un valor al usuario.
	 * 2.- Pedirle al usuario un número mayor / menor o igual al número que se le indicó primero (según se le indique).
	 * 3.- Devolver el valor.
	 */
	public static byte compNum(byte limit, Compare operator) {
		
		byte num = 0;
		boolean end = true;
		
		do {
			end = true;
			
			try {
				if(operator == Compare.Mayor_o_igual) {
					do {
						System.out.println("Indica un número mayor o igual a " + limit + ": ");
						num = scan.nextByte();
					}while(num < limit);
					
				}else if(operator == Compare.Menor_o_igual) {
					do {
						System.out.println("Indica un número menor o igual a " + limit + ": ");
						num = scan.nextByte();
					}while(num > limit);
					
				}else if(operator == Compare.Mayor) {
					do {
						System.out.println("Indica un número mayor a " + limit + ": ");
						num = scan.nextByte();
					}while(num <= limit);
					
				}else if(operator == Compare.Menor) {
					do {
						System.out.println("Indica un número menor a " + limit + ": ");
						num = scan.nextByte();
					}while(num >= limit);
					
				}
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		return num;
		
	}
	
	/*
	 * 1.- Indicarle un valor al usuario.
	 * 2.- Pedirle al usuario un número mayor / menor o igual al número que se le indicó primero (según se le indique).
	 * 3.- Devolver el valor.
	 */
	public static short compNum(short limit, Compare operator) {
		
		short num = 0;
		boolean end = true;
		
		do {
			end = true;
			
			try {
				if(operator == Compare.Mayor_o_igual) {
					do {
						System.out.println("Indica un número mayor o igual a " + limit + ": ");
						num = scan.nextShort();
					}while(num < limit);
					
				}else if(operator == Compare.Menor_o_igual) {
					do {
						System.out.println("Indica un número menor o igual a " + limit + ": ");
						num = scan.nextShort();
					}while(num > limit);
					
				}else if(operator == Compare.Mayor) {
					do {
						System.out.println("Indica un número mayor a " + limit + ": ");
						num = scan.nextShort();
					}while(num <= limit);
					
				}else if(operator == Compare.Menor) {
					do {
						System.out.println("Indica un número menor a " + limit + ": ");
						num = scan.nextShort();
					}while(num >= limit);
					
				}
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		return num;
		
	}
	
	/*
	 * 1.- Indicarle un valor al usuario.
	 * 2.- Pedirle al usuario un número mayor / menor o igual al número que se le indicó primero (según se le indique).
	 * 3.- Devolver el valor.
	 */
	public static int compNum(int limit, Compare operator) {
		
		int num = 0;
		boolean end = true;
		
		do {
			end = true;
			
			try {
				if(operator == Compare.Mayor_o_igual) {
					do {
						System.out.println("Indica un número mayor o igual a " + limit + ": ");
						num = scan.nextInt();
					}while(num < limit);
					
				}else if(operator == Compare.Menor_o_igual) {
					do {
						System.out.println("Indica un número menor o igual a " + limit + ": ");
						num = scan.nextInt();
					}while(num > limit);
					
				}else if(operator == Compare.Mayor) {
					do {
						System.out.println("Indica un número mayor a " + limit + ": ");
						num = scan.nextInt();
					}while(num <= limit);
					
				}else if(operator == Compare.Menor) {
					do {
						System.out.println("Indica un número menor a " + limit + ": ");
						num = scan.nextInt();
					}while(num >= limit);
					
				}
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		return num;
		
	}
	
	/*
	 * 1.- Indicarle un valor al usuario.
	 * 2.- Pedirle al usuario un número mayor / menor o igual al número que se le indicó primero (según se le indique).
	 * 3.- Devolver el valor.
	 */
	public static long compNum(long limit, Compare operator) {
		
		long num = 0;
		boolean end = true;
		
		do {
			end = true;
			
			try {
				if(operator == Compare.Mayor_o_igual) {
					do {
						System.out.println("Indica un número mayor o igual a " + limit + ": ");
						num = scan.nextLong();
					}while(num < limit);
					
				}else if(operator == Compare.Menor_o_igual) {
					do {
						System.out.println("Indica un número menor o igual a " + limit + ": ");
						num = scan.nextLong();
					}while(num > limit);
					
				}else if(operator == Compare.Mayor) {
					do {
						System.out.println("Indica un número mayor a " + limit + ": ");
						num = scan.nextLong();
					}while(num <= limit);
					
				}else if(operator == Compare.Menor) {
					do {
						System.out.println("Indica un número menor a " + limit + ": ");
						num = scan.nextLong();
					}while(num >= limit);
					
				}
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		return num;
		
	}

	/*
	 * 1.- Indicarle un valor al usuario.
	 * 2.- Pedirle al usuario un número mayor / menor o igual al número que se le indicó primero (según se le indique).
	 * 3.- Devolver el valor.
	 */
	public static float compNum(float limit, Compare operator) {
		
		float num = 0;
		boolean end = true;
		
		do {
			end = true;
			
			try {
				if(operator == Compare.Mayor_o_igual) {
					do {
						System.out.println("Indica un número mayor o igual a " + limit + ": ");
						num = scan.nextFloat();
					}while(num < limit);
					
				}else if(operator == Compare.Menor_o_igual) {
					do {
						System.out.println("Indica un número menor o igual a " + limit + ": ");
						num = scan.nextFloat();
					}while(num > limit);
					
				}else if(operator == Compare.Mayor) {
					do {
						System.out.println("Indica un número mayor a " + limit + ": ");
						num = scan.nextFloat();
					}while(num <= limit);
					
				}else if(operator == Compare.Menor) {
					do {
						System.out.println("Indica un número menor a " + limit + ": ");
						num = scan.nextFloat();
					}while(num >= limit);
					
				}
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		return num;
		
	}

	/*
	 * 1.- Indicarle un valor al usuario.
	 * 2.- Pedirle al usuario un número mayor / menor o igual al número que se le indicó primero (según se le indique).
	 * 3.- Devolver el valor.
	 */
	public static double compNum(double limit, Compare operator) {
		
		double num = 0;
		boolean end = true;
		
		do {
			end = true;
			
			try {
				if(operator == Compare.Mayor_o_igual) {
					do {
						System.out.println("Indica un número mayor o igual a " + limit + ": ");
						num = scan.nextDouble();
					}while(num < limit);
					
				}else if(operator == Compare.Menor_o_igual) {
					do {
						System.out.println("Indica un número menor o igual a " + limit + ": ");
						num = scan.nextDouble();
					}while(num > limit);
					
				}else if(operator == Compare.Mayor) {
					do {
						System.out.println("Indica un número mayor a " + limit + ": ");
						num = scan.nextDouble();
					}while(num <= limit);
					
				}else if(operator == Compare.Menor) {
					do {
						System.out.println("Indica un número menor a " + limit + ": ");
						num = scan.nextDouble();
					}while(num >= limit);
					
				}
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		return num;
		
	}
	
	// Opciones para las funciones rangNum
	public enum Range{
		BothIncluded, BothExcluded, MinIncluded, MaxIncluded
	}
	
	/*
	 * 1.- Indicar un número mínimo y máximo.
	 * 2.- Pedir al usuario un número comprendido entre esos números mínimo y máximo.
	 * 	2.1.- Si el mínimo es mayor al máximo, se avisará al usuario mediante una excepción.
	 * 	2.2.- Si el mínimo es menor o igual al máximo, se seguirá con la petición.
	 * 3.- Devolver el valor.
	 */
	public static byte rangNum(byte min, byte max, Range option) {
		
		byte num = 0;
		boolean end = true;
		
		if(min > max) { // Mostrar excepción.
			throw new IllegalArgumentException("Error, el número mínimo no puede ser mayor que el máximo.");
		}else {
			do {
				end = true;
				try {
					if(option == Range.BothIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos incluidos)" + ":");
							num = scan.nextByte();
						}while(num < min || num > max);
					}else if(option == Range.BothExcluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos excluidos)" + ":");
							num = scan.nextByte();
						}while(num <= min || num >= max);
					}else if(option == Range.MinIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (mínimo incluido)" + ":");
							num = scan.nextByte();
						}while(num < min || num >= max);
					}else if(option == Range.MaxIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (máximo incluido)" + ":");
							num = scan.nextByte();
						}while(num <= min || num > max);
					}
				}catch(InputMismatchException e) {
					end = false;
				}finally {
					scan.nextLine();
				}
			}while(!end);
		}
		return num;
	}
	
	/*
	 * 1.- Indicar un número mínimo y máximo.
	 * 2.- Pedir al usuario un número comprendido entre esos números mínimo y máximo.
	 * 	2.1.- Si el mínimo es mayor al máximo, se avisará al usuario mediante una excepción.
	 * 	2.2.- Si el mínimo es menor o igual al máximo, se seguirá con la petición.
	 * 3.- Devolver el valor.
	 */
	public static short rangNum(short min, short max, Range option) {
		
		short num = 0;
		boolean end = true;
		
		if(min > max) { // Mostrar excepción.
			throw new IllegalArgumentException("Error, el número mínimo no puede ser mayor que el máximo.");
		}else {
			do {
				end = true;
				try {
					if(option == Range.BothIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos incluidos)" + ":");
							num = scan.nextShort();
						}while(num < min || num > max);
					}else if(option == Range.BothExcluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos excluidos)" + ":");
							num = scan.nextShort();
						}while(num <= min || num >= max);
					}else if(option == Range.MinIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (mínimo incluido)" + ":");
							num = scan.nextShort();
						}while(num < min || num >= max);
					}else if(option == Range.MaxIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (máximo incluido)" + ":");
							num = scan.nextShort();
						}while(num <= min || num > max);
					}
				}catch(InputMismatchException e) {
					end = false;
				}finally {
					scan.nextLine();
				}
			}while(!end);
		}
		return num;
	}
	
	/*
	 * 1.- Indicar un número mínimo y máximo.
	 * 2.- Pedir al usuario un número comprendido entre esos números mínimo y máximo.
	 * 	2.1.- Si el mínimo es mayor al máximo, se avisará al usuario mediante una excepción.
	 * 	2.2.- Si el mínimo es menor o igual al máximo, se seguirá con la petición.
	 * 3.- Devolver el valor.
	 */
	public static int rangNum(int min, int max, Range option) {
		
		int num = 0;
		boolean end = true;
		
		if(min > max) { // Mostrar excepción.
			throw new IllegalArgumentException("Error, el número mínimo no puede ser mayor que el máximo.");
		}else {
			do {
				end = true;
				try {
					if(option == Range.BothIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos incluidos)" + ":");
							num = scan.nextInt();
						}while(num < min || num > max);
					}else if(option == Range.BothExcluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos excluidos)" + ":");
							num = scan.nextInt();
						}while(num <= min || num >= max);
					}else if(option == Range.MinIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (mínimo incluido)" + ":");
							num = scan.nextInt();
						}while(num < min || num >= max);
					}else if(option == Range.MaxIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (máximo incluido)" + ":");
							num = scan.nextInt();
						}while(num <= min || num > max);
					}
				}catch(InputMismatchException e) {
					end = false;
				}finally {
					scan.nextLine();
				}
			}while(!end);
		}
		return num;
	}
	
	/*
	 * 1.- Indicar un número mínimo y máximo.
	 * 2.- Pedir al usuario un número comprendido entre esos números mínimo y máximo.
	 * 	2.1.- Si el mínimo es mayor al máximo, se avisará al usuario mediante una excepción.
	 * 	2.2.- Si el mínimo es menor o igual al máximo, se seguirá con la petición.
	 * 3.- Devolver el valor.
	 */
	public static long rangNum(long min, long max, Range option) {
		
		long num = 0;
		boolean end = true;
		
		if(min > max) { // Mostrar excepción.
			throw new IllegalArgumentException("Error, el número mínimo no puede ser mayor que el máximo.");
		}else {
			do {
				end = true;
				try {
					if(option == Range.BothIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos incluidos)" + ":");
							num = scan.nextLong();
						}while(num < min || num > max);
					}else if(option == Range.BothExcluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos excluidos)" + ":");
							num = scan.nextLong();
						}while(num <= min || num >= max);
					}else if(option == Range.MinIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (mínimo incluido)" + ":");
							num = scan.nextLong();
						}while(num < min || num >= max);
					}else if(option == Range.MaxIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (máximo incluido)" + ":");
							num = scan.nextLong();
						}while(num <= min || num > max);
					}
				}catch(InputMismatchException e) {
					end = false;
				}finally {
					scan.nextLine();
				}
			}while(!end);
		}
		return num;
	}

	/*
	 * 1.- Indicar un número mínimo y máximo.
	 * 2.- Pedir al usuario un número comprendido entre esos números mínimo y máximo.
	 * 	2.1.- Si el mínimo es mayor al máximo, se avisará al usuario mediante una excepción.
	 * 	2.2.- Si el mínimo es menor o igual al máximo, se seguirá con la petición.
	 * 3.- Devolver el valor.
	 */
	public static float rangNum(float min, float max, Range option) {
		
		float num = 0;
		boolean end = true;
		
		if(min > max) { // Mostrar excepción.
			throw new IllegalArgumentException("Error, el número mínimo no puede ser mayor que el máximo.");
		}else {
			do {
				end = true;
				try {
					if(option == Range.BothIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos incluidos)" + ":");
							num = scan.nextFloat();
						}while(num < min || num > max);
					}else if(option == Range.BothExcluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos excluidos)" + ":");
							num = scan.nextFloat();
						}while(num <= min || num >= max);
					}else if(option == Range.MinIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (mínimo incluido)" + ":");
							num = scan.nextFloat();
						}while(num < min || num >= max);
					}else if(option == Range.MaxIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (máximo incluido)" + ":");
							num = scan.nextFloat();
						}while(num <= min || num > max);
					}
				}catch(InputMismatchException e) {
					end = false;
				}finally {
					scan.nextLine();
				}
			}while(!end);
		}
		return num;
	}

	/*
	 * 1.- Indicar un número mínimo y máximo.
	 * 2.- Pedir al usuario un número comprendido entre esos números mínimo y máximo.
	 * 	2.1.- Si el mínimo es mayor al máximo, se avisará al usuario mediante una excepción.
	 * 	2.2.- Si el mínimo es menor o igual al máximo, se seguirá con la petición.
	 * 3.- Devolver el valor.
	 */
	public static double rangNum(double min, double max, Range option) {
		
		double num = 0;
		boolean end = true;
		
		if(min > max) { // Mostrar excepción.
			throw new IllegalArgumentException("Error, el número mínimo no puede ser mayor que el máximo.");
		}else {
			do {
				end = true;
				try {
					if(option == Range.BothIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos incluidos)" + ":");
							num = scan.nextDouble();
						}while(num < min || num > max);
					}else if(option == Range.BothExcluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (ambos excluidos)" + ":");
							num = scan.nextDouble();
						}while(num <= min || num >= max);
					}else if(option == Range.MinIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (mínimo incluido)" + ":");
							num = scan.nextDouble();
						}while(num < min || num >= max);
					}else if(option == Range.MaxIncluded) {
						do {
							System.out.println("Introduce un número comprendido entre " + min + " y " + max + " (máximo incluido)" + ":");
							num = scan.nextDouble();
						}while(num <= min || num > max);
					}
				}catch(InputMismatchException e) {
					end = false;
				}finally {
					scan.nextLine();
				}
			}while(!end);
		}
		return num;
	}

	/*
	 * 1.- Mostrar tres mensajes al usuario.
	 * 1.1.- EL primer mensaje será una pregunta o una petición.
	 * 1.2.- Los demás mensajes serán las opciones uno y dos respectivamente.
	 * 2.- El usuario deberá elegir la opción uno o dos indicando su número correspondiente.
	 * 3.- Devolver true en caso de elegir la primera opción, y false en caso de la segunda.
	 */
	public static boolean choose(String msg1, String msg2, String msg3) {
		
		boolean option = false, end = true;
		int numOption = 0;
		
		do {
			end = true;
			
			try {
				do {
					System.out.println(msg1 + "\n\t1.-" + msg2 + "\n\t2.-" + msg3);
					numOption = scan.nextInt();
				}while(numOption < 1 || numOption > 2);
				
			}catch(InputMismatchException e) {
				end = false;
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		if(numOption == 1) {
			option = true;
			
		}else if(numOption == 2) {
			option = false;
		}
		
		return option;
		
	}

	/*
	 * 1.- Mostrar un mensaje al usuario.
	 * 2.- El usuario deberá indicar "si" o "no".
	 * 3.- Devolver true en caso de indicar "si", y false en caso de indicar "no".
	 */
	public static boolean choose(String msg) {
		
		boolean option = false, end = true;
		String answer;
		
		do {
			
			end = true;
			
			System.out.println(msg + "(s / n)");
			answer = scan.nextLine();
			
			if(answer.equals("s")) {
				option = true;
			}else if(answer.equals("S")) {
				option = true;
			}else if(answer.equals("n")) {
				option = false;
			}else if(answer.equals("N")) {
				option = false;
			}else {
				end = false;
			}
			
		}while(!end);
		
		return option;
		
	}
}
