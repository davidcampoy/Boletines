package proyectos;
import java.util.Scanner;

import proyectos.Teclado.Compare;

public class PruebasTeclado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean exit = false, end = true;
		byte numB, limitB;
		short numS, limitS;
		int numI, limitI, option = 0;
		long numL, limitL;
		float numF, limitF;
		double numD, limitD;
		char ch;
		String str;
		
		do {
			
			System.out.println("Elige una opción: \n\t 1.- Leer carácter \n\t 2.- Leer cadena \n\t 3.- Leer número \n\t 4.- Leer número (mayor / menor / igual) \n\t 5.- Leer número (rango) \n\t 6.- Booleano (dos opciones) \n\t 7.- Booleano (s / n) \n\t 8.- Salir (y cerrar teclado)");
			option = scan.nextInt();
			
			if(option == 1) { 			// Leer carácter
				
				System.out.println("Has elegido \"Leer carácter\"");
				
				ch = Teclado.readChar();
				System.out.println("En esta función se indicó el carácter " + "\"" + ch + "\"");
				
			}else if(option == 2) {		// Leer cadena
				
				System.out.println("Has elegido \"Leer cadena\"");
				
				str = Teclado.readString();
				System.out.println("En esta función se indicó la cadena " + "\"" + str + "\"");
				
			}else if(option == 3) {		// Leer número
				
				System.out.println("Has elegido \"Leer número\"");
				
				System.out.println("Elige el tipo de valor que desea introducir: \n\t 1.- Byte \n\t 2.- Short \n\t 3.- Int \n\t 4.- Long \n\t 5.- Float \n\t 6.- Double");
				option = scan.nextInt();
				
				if(option == 1) { 			// Byte
					
					System.out.println("Has elegido el tipo \"byte\"");
					
					numB = Teclado.readByte();
					System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
					
				}else if(option == 2) { 	// Short
					
					System.out.println("Has elegido el tipo \"short\"");
					
					numS = Teclado.readShort();
					System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
					
				}else if(option == 3) { 	// Int
					
					System.out.println("Has elegido el tipo \"int\"");
					
					numI = Teclado.readInt();
					System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
					
				}else if(option == 4) { 	// Long
					
					System.out.println("Has elegido el tipo \"long\"");
					
					numL = Teclado.readLong();
					System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
					
				}else if(option == 5) { 	// Float
					
					System.out.println("Has elegido el tipo \"float\"");
					
					numF = Teclado.readFloat();
					System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
					
				}else if(option == 6) { 	// Double
					
					System.out.println("Has elegido el tipo \"double\"");
					
					numD = Teclado.readDouble();
					System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
					
				}
				
				option = 0;
				
			}else if(option == 4) { 	// Leer número (mayor / menor / igual)
				
				System.out.println("Has elegido \"Leer número (mayor / menor / igual)\"");
				
				System.out.println("Elige el tipo de valor que desea introducir: \n\t 1.- Byte \n\t 2.- Short \n\t 3.- Int \n\t 4.- Long \n\t 5.- Float \n\t 6.- Double");
				option = scan.nextInt();
				
				if(option == 1) { 			// Byte
					
					option = 0;
					
					System.out.println("Has elegido el tipo \"byte\"");
					
					System.out.println("Indica el valor límite: ");
					limitB = scan.nextByte();
					
					System.out.println("Elige una de las opciones: \n\t 1.- Mayor o igual \n\t 2.- Menor o igual \n\t 3.- Mayor \n\t 4.- Menor");
					option = scan.nextInt();
					
					if(option == 1) { 			// Mayor o igual
						
						numB = Teclado.compNum(limitB, Compare.Mayor_o_igual);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
						
					}else if(option == 2) {		// Menor o igual
						
						numB = Teclado.compNum(limitB, Compare.Menor_o_igual);
	
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
												
					}else if(option == 3) { 	// Mayor
						
						numB = Teclado.compNum(limitB, Compare.Mayor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
						
					}else if(option == 4) { 	// Menor
						
						numB = Teclado.compNum(limitB, Compare.Menor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
						
					}
					
				}else if(option == 2) { 	// Short
					
					System.out.println("Has elegido el tipo \"short\"");
					
					// CONTINUAR AQUI!
										
				}else if(option == 3) { 	// Int
					
					System.out.println("Has elegido el tipo \"int\"");
					
				}else if(option == 4) { 	// Long
					
					System.out.println("Has elegido el tipo \"long\"");
					
				}else if(option == 5) { 	// Float
					
					System.out.println("Has elegido el tipo \"float\"");
										
				}else if(option == 6) { 	// Double
					
					System.out.println("Has elegido el tipo \"double\"");
										
				}
				
				option = 0;
				
			}
			
		}while(!exit);

	}

}
