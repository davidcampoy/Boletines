package proyectos;
import java.util.InputMismatchException;
import java.util.Scanner;

import proyectos.Teclado.Compare;
import proyectos.Teclado.Range;

public class PruebasTeclado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean exit = false, end = true, choose;
		byte numB, limitB = 0, minB = 0, maxB = 0;
		short numS, limitS = 0, minS = 0, maxS = 0;
		int numI, limitI = 0, minI = 0, maxI = 0, option = 0;
		long numL, limitL = 0, minL = 0, maxL = 0;
		float numF, limitF = 0, minF = 0, maxF = 0;
		double numD, limitD = 0, minD = 0, maxD = 0;
		char ch;
		String str, str2, str3;
		
		do {
			
			do {
				end = true;
				
				try {
			
					System.out.println("Elige una opción: \n\t 1.- Leer carácter \n\t 2.- Leer cadena \n\t 3.- Leer número \n\t 4.- Leer número (mayor / menor / igual) \n\t 5.- Leer número (rango) \n\t 6.- Booleano (dos opciones) \n\t 7.- Booleano (s / n) \n\t 8.- Salir (y cerrar teclado)");
					option = scan.nextInt();
				
				}catch(InputMismatchException e) {
					end = false;
					System.out.println("Error");
				}finally {
					scan.nextLine();
				}
			
			}while(!end || option < 1 || option > 8);
			
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
				
				do {
					end = true;
					
					try {
										
						System.out.println("Elige el tipo de valor que desea introducir: \n\t 1.- Byte \n\t 2.- Short \n\t 3.- Int \n\t 4.- Long \n\t 5.- Float \n\t 6.- Double");
						option = scan.nextInt();
					
					}catch(InputMismatchException e) {
						end = false;
						System.out.println("Error");
					}finally {
						scan.nextLine();
					}
				
				}while(!end || option < 1 || option > 6);
				
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
				
				do {
					end = true;
					
					try {
				
					System.out.println("Elige el tipo de valor que desea introducir: \n\t 1.- Byte \n\t 2.- Short \n\t 3.- Int \n\t 4.- Long \n\t 5.- Float \n\t 6.- Double");
					option = scan.nextInt();
				
					}catch(InputMismatchException e) {
						end = false;
						System.out.println("Error");
					}finally {
						scan.nextLine();
					}
					
				}while(!end || option < 1 || option > 6);
					
				if(option == 1) { 			// Byte
					
					option = 0;
					
					System.out.println("Has elegido el tipo \"byte\"");
					
					do {
						end = true;
						
						try {
							
							System.out.println("Indica el valor límite: ");
							limitB = scan.nextByte();
							
						}catch(InputMismatchException e){
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {
						end = true;
						
						try {
							
							System.out.println("Elige una de las opciones: \n\t 1.- Mayor o igual \n\t 2.- Menor o igual \n\t 3.- Mayor \n\t 4.- Menor");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
										
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
					
					do {
						end = true;
						
						try {
							
							System.out.println("Indica el valor límite: ");
							limitS = scan.nextShort();
							
						}catch(InputMismatchException e){
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {
						end = true;
						
						try {
							
							System.out.println("Elige una de las opciones: \n\t 1.- Mayor o igual \n\t 2.- Menor o igual \n\t 3.- Mayor \n\t 4.- Menor");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
										
					if(option == 1) { 			// Mayor o igual
						
						numS = Teclado.compNum(limitS, Compare.Mayor_o_igual);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
						
					}else if(option == 2) {		// Menor o igual
						
						numS = Teclado.compNum(limitS, Compare.Menor_o_igual);
	
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
												
					}else if(option == 3) { 	// Mayor
						
						numS = Teclado.compNum(limitS, Compare.Mayor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
						
					}else if(option == 4) { 	// Menor
						
						numS = Teclado.compNum(limitS, Compare.Menor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
						
					}
										
				}else if(option == 3) { 	// Int
					
					System.out.println("Has elegido el tipo \"int\"");
					
					do {
						end = true;
						
						try {
							
							System.out.println("Indica el valor límite: ");
							limitI = scan.nextInt();
							
						}catch(InputMismatchException e){
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {
						end = true;
						
						try {
							
							System.out.println("Elige una de las opciones: \n\t 1.- Mayor o igual \n\t 2.- Menor o igual \n\t 3.- Mayor \n\t 4.- Menor");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
										
					if(option == 1) { 			// Mayor o igual
						
						numI = Teclado.compNum(limitI, Compare.Mayor_o_igual);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
						
					}else if(option == 2) {		// Menor o igual
						
						numI = Teclado.compNum(limitI, Compare.Menor_o_igual);
	
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
												
					}else if(option == 3) { 	// Mayor
						
						numI = Teclado.compNum(limitI, Compare.Mayor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
						
					}else if(option == 4) { 	// Menor
						
						numI = Teclado.compNum(limitI, Compare.Menor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
						
					}
					
				}else if(option == 4) { 	// Long
					
					System.out.println("Has elegido el tipo \"long\"");
					
					do {
						end = true;
						
						try {
							
							System.out.println("Indica el valor límite: ");
							limitL = scan.nextLong();
							
						}catch(InputMismatchException e){
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {
						end = true;
						
						try {
							
							System.out.println("Elige una de las opciones: \n\t 1.- Mayor o igual \n\t 2.- Menor o igual \n\t 3.- Mayor \n\t 4.- Menor");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
										
					if(option == 1) { 			// Mayor o igual
						
						numL = Teclado.compNum(limitL, Compare.Mayor_o_igual);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
						
					}else if(option == 2) {		// Menor o igual
						
						numL = Teclado.compNum(limitL, Compare.Menor_o_igual);
	
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
												
					}else if(option == 3) { 	// Mayor
						
						numL = Teclado.compNum(limitL, Compare.Mayor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
						
					}else if(option == 4) { 	// Menor
						
						numL = Teclado.compNum(limitL, Compare.Menor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
						
					}
					
				}else if(option == 5) { 	// Float
					
					System.out.println("Has elegido el tipo \"float\"");
					
					do {
						end = true;
						
						try {
							
							System.out.println("Indica el valor límite: ");
							limitF = scan.nextFloat();
							
						}catch(InputMismatchException e){
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {
						end = true;
						
						try {
							
							System.out.println("Elige una de las opciones: \n\t 1.- Mayor o igual \n\t 2.- Menor o igual \n\t 3.- Mayor \n\t 4.- Menor");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
										
					if(option == 1) { 			// Mayor o igual
						
						numF = Teclado.compNum(limitF, Compare.Mayor_o_igual);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
						
					}else if(option == 2) {		// Menor o igual
						
						numF = Teclado.compNum(limitF, Compare.Menor_o_igual);
	
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
												
					}else if(option == 3) { 	// Mayor
						
						numF = Teclado.compNum(limitF, Compare.Mayor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
						
					}else if(option == 4) { 	// Menor
						
						numF = Teclado.compNum(limitF, Compare.Menor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
						
					}
										
				}else if(option == 6) { 	// Double
					
					System.out.println("Has elegido el tipo \"double\"");
					
					do {
						end = true;
						
						try {
							
							System.out.println("Indica el valor límite: ");
							limitD = scan.nextDouble();
							
						}catch(InputMismatchException e){
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {
						end = true;
						
						try {
							
							System.out.println("Elige una de las opciones: \n\t 1.- Mayor o igual \n\t 2.- Menor o igual \n\t 3.- Mayor \n\t 4.- Menor");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
										
					if(option == 1) { 			// Mayor o igual
						
						numD = Teclado.compNum(limitD, Compare.Mayor_o_igual);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
						
					}else if(option == 2) {		// Menor o igual
						
						numD = Teclado.compNum(limitD, Compare.Menor_o_igual);
	
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
												
					}else if(option == 3) { 	// Mayor
						
						numD = Teclado.compNum(limitD, Compare.Mayor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
						
					}else if(option == 4) { 	// Menor
						
						numD = Teclado.compNum(limitD, Compare.Menor);
						
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
						
					}
										
				}
				
				option = 0;
				
			}else if(option == 5) {
				
				System.out.println("Has elegido \"Leer número (rango)\"");
				
				do {
					end = true;
					
					try {
						
						System.out.println("Elige el tipo de valor que desea introducir: \n\t 1.- Byte \n\t 2.- Short \n\t 3.- Int \n\t 4.- Long \n\t 5.- Float \n\t 6.- Double");
						option = scan.nextInt();
						
					}catch(InputMismatchException e) {
						end = false;
						System.out.println("Error");
					}finally {
						scan.nextLine();
					}
					
				}while(!end || option < 1 || option > 6);
				
				if(option == 1) { 			// Byte
					
					System.out.println("Has elegido el tipo \"byte\"");
					
					do {						// Indicar número mínimo
						end = true;
						
						try {
							
							System.out.println("Indica el número mínimo del rango: ");
							minB = scan.nextByte();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar número máximo
						end = true;
						
						try {
							
							System.out.println("Indica el número máximo del rango: ");
							maxB = scan.nextByte();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar inclusión del mínimo y máximo
						end = true;
						
						try {
							
							System.out.println("Indica la inclusión de los números mínimo y máximo: \n\t 1.- Ambos incluidos \n\t 2.- Ambos excluidos \n\t 3.- Mínimo incluido \n\t 4.- Máximo incluido");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
					
					if(option == 1) {			// Ambos incluidos
						
						numB = Teclado.rangNum(minB, maxB, Range.BothIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
						
					}else if(option == 2) {
						
						numB = Teclado.rangNum(minB, maxB, Range.BothExcluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
						
					}else if(option == 3) {
						
						numB = Teclado.rangNum(minB, maxB, Range.MinIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
						
					}else if(option == 4) {
						
						numB = Teclado.rangNum(minB, maxB, Range.MaxIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numB + "\"");
						
					}
					
				}else if(option == 2) { 	// Short
					
					System.out.println("Has elegido el tipo \"short\"");
					
					do {						// Indicar número mínimo
						end = true;
						
						try {
							
							System.out.println("Indica el número mínimo del rango: ");
							minS = scan.nextShort();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar número máximo
						end = true;
						
						try {
							
							System.out.println("Indica el número máximo del rango: ");
							maxS = scan.nextShort();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar inclusión del mínimo y máximo
						end = true;
						
						try {
							
							System.out.println("Indica la inclusión de los números mínimo y máximo: \n\t 1.- Ambos incluidos \n\t 2.- Ambos excluidos \n\t 3.- Mínimo incluido \n\t 4.- Máximo incluido");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
					
					if(option == 1) {			// Ambos incluidos
						
						numS = Teclado.rangNum(minS, maxS, Range.BothIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + minS + "\"");
						
					}else if(option == 2) {		// Ambos excluidos
						
						numS = Teclado.rangNum(minS, maxS, Range.BothExcluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
						
					}else if(option == 3) {		// Mínimo incluido
						
						numS = Teclado.rangNum(minS, maxS, Range.MinIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
						
					}else if(option == 4) {		// Máximo incluido
						
						numS = Teclado.rangNum(minS, maxS, Range.MaxIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numS + "\"");
						
					}
					
				}else if(option == 3) { 	// Int
					
					System.out.println("Has elegido el tipo \"int\"");
					
					do {						// Indicar número mínimo
						end = true;
						
						try {
							
							System.out.println("Indica el número mínimo del rango: ");
							minI = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar número máximo
						end = true;
						
						try {
							
							System.out.println("Indica el número máximo del rango: ");
							maxI = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar inclusión del mínimo y máximo
						end = true;
						
						try {
							
							System.out.println("Indica la inclusión de los números mínimo y máximo: \n\t 1.- Ambos incluidos \n\t 2.- Ambos excluidos \n\t 3.- Mínimo incluido \n\t 4.- Máximo incluido");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
					
					if(option == 1) {			// Ambos incluidos
						
						numI = Teclado.rangNum(minI, maxI, Range.BothIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
						
					}else if(option == 2) {		// Ambos excluidos
						
						numI = Teclado.rangNum(minI, maxI, Range.BothExcluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
						
					}else if(option == 3) {		// Mínimo incluido
						
						numI = Teclado.rangNum(minI, maxI, Range.MinIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
						
					}else if(option == 4) {		// Máximo incluido
						
						numI = Teclado.rangNum(minI, maxI, Range.MaxIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numI + "\"");
						
					}
					
				}else if(option == 4) { 	// Long
					
					System.out.println("Has elegido el tipo \"long\"");
					
					do {						// Indicar número mínimo
						end = true;
						
						try {
							
							System.out.println("Indica el número mínimo del rango: ");
							minL = scan.nextLong();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar número máximo
						end = true;
						
						try {
							
							System.out.println("Indica el número máximo del rango: ");
							maxL = scan.nextLong();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar inclusión del mínimo y máximo
						end = true;
						
						try {
							
							System.out.println("Indica la inclusión de los números mínimo y máximo: \n\t 1.- Ambos incluidos \n\t 2.- Ambos excluidos \n\t 3.- Mínimo incluido \n\t 4.- Máximo incluido");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
					
					if(option == 1) {			// Ambos incluidos
						
						numL = Teclado.rangNum(minL, maxL, Range.BothIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
						
					}else if(option == 2) {		// Ambos excluidos
						
						numL = Teclado.rangNum(minL, maxL, Range.BothExcluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
						
					}else if(option == 3) {		// Mínimo incluido
						
						numL = Teclado.rangNum(minL, maxL, Range.MinIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
						
					}else if(option == 4) {		// Máximo incluido
						
						numL = Teclado.rangNum(minL, maxL, Range.MaxIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numL + "\"");
						
					}
					
				}else if(option == 5) { 	// Float
					
					System.out.println("Has elegido el tipo \"float\"");
					
					do {						// Indicar número mínimo
						end = true;
						
						try {
							
							System.out.println("Indica el número mínimo del rango: ");
							minF = scan.nextFloat();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar número máximo
						end = true;
						
						try {
							
							System.out.println("Indica el número máximo del rango: ");
							maxF = scan.nextFloat();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar inclusión del mínimo y máximo
						end = true;
						
						try {
							
							System.out.println("Indica la inclusión de los números mínimo y máximo: \n\t 1.- Ambos incluidos \n\t 2.- Ambos excluidos \n\t 3.- Mínimo incluido \n\t 4.- Máximo incluido");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
					
					if(option == 1) {			// Ambos incluidos
						
						numF = Teclado.rangNum(minF, maxF, Range.BothIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
						
					}else if(option == 2) {		// Ambos excluidos
						
						numF = Teclado.rangNum(minF, maxF, Range.BothExcluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
						
					}else if(option == 3) {		// Mínimo incluido
						
						numF = Teclado.rangNum(minF, maxF, Range.MinIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
						
					}else if(option == 4) {		// Máximo incluido
						
						numF = Teclado.rangNum(minF, maxF, Range.MaxIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numF + "\"");
						
					}
					
				}else if(option == 6) { 	// Double
					
					System.out.println("Has elegido el tipo \"double\"");
					
					do {						// Indicar número mínimo
						end = true;
						
						try {
							
							System.out.println("Indica el número mínimo del rango: ");
							minD = scan.nextDouble();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar número máximo
						end = true;
						
						try {
							
							System.out.println("Indica el número máximo del rango: ");
							maxD = scan.nextDouble();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end);
					
					do {						// Indicar inclusión del mínimo y máximo
						end = true;
						
						try {
							
							System.out.println("Indica la inclusión de los números mínimo y máximo: \n\t 1.- Ambos incluidos \n\t 2.- Ambos excluidos \n\t 3.- Mínimo incluido \n\t 4.- Máximo incluido");
							option = scan.nextInt();
							
						}catch(InputMismatchException e) {
							end = false;
							System.out.println("Error.");
						}finally {
							scan.nextLine();
						}
						
					}while(!end || option < 1 || option > 4);
					
					if(option == 1) {			// Ambos incluidos
						
						numD = Teclado.rangNum(minD, maxD, Range.BothIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
						
					}else if(option == 2) {		// Ambos excluidos
						
						numD = Teclado.rangNum(minD, maxD, Range.BothExcluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
						
					}else if(option == 3) {		// Mínimo incluido
						
						numD = Teclado.rangNum(minD, maxD, Range.MinIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
						
					}else if(option == 4) {		// Máximo incluido
						
						numD = Teclado.rangNum(minD, maxD, Range.MaxIncluded);
						System.out.println("El valor indicado en ésta función ha sido " + "\"" + numD + "\"");
						
					}
					
				}
				
				option = 0;
				
			}else if(option == 6) {		// Booleano  (dos opciones)
				
				System.out.println("Has elegido \"Booleano (dos opciones)\"");
				
				System.out.println("Indica el mensaje: ");
				str = scan.nextLine();
				
				System.out.println("Indica la primera opción: ");
				str2 = scan.nextLine();
				
				System.out.println("Indica la segunda opción: ");
				str3 = scan.nextLine();
				
				choose = Teclado.choose(str, str2, str3);
				
				System.out.println("El valor indicado en ésta función ha sido " + "\"" + choose + "\"");
				
			}else if(option == 7) {		// Booleano  (s / n)
				
				System.out.println("Has elegido \"Booleano (s / n)\"");
				
				System.out.println("Indica el mensaje: ");
				str = scan.nextLine();
				
				choose = Teclado.choose(str);
				
				System.out.println("El valor indicado en ésta función ha sido " + "\"" + choose + "\"");
				
			}else if(option == 8) {		//Cerrar menú
				
				exit = true;
				
			}
			
		}while(!exit);
		
		Teclado.closeScan();
		System.out.println("Cerrando menú...");

	}

}
