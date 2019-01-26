package proyecto2;
import java.util.Random;

import proyectos.Teclado;
import proyectos.Teclado.Compare;
import proyectos.Teclado.Range;

public class SopaDeLetras {
	
	static Random rand = new Random();
	public static String palabras[];

	public static void main(String[] args) {
		
		int option;
		boolean exit = false, create = false;
		char sopaLetras[][] = null;
		
		do {
			
			System.out.println("Elige una opción: \n\t 1.- Crear sopa de letras.\n\t 2.- Mostrar sopa de letras.\n\t 3.- Jugar a la sopa de letras.\n\t 4.- Salir.");
			option = Teclado.rangNum(1, 4, Teclado.Range.BothIncluded);
			
			if(option == 1) {				// Crear
				
				sopaLetras = crearSopaLetras();
				create = true;
				
			}else if(option == 2) {			// Mostrar
				if(create == false) {
					System.out.println("No hay ninguna sopa de letras creada. Use la opción \"Crear sopa de letras\" para crear una.\n");
				}else {
					mostrarSopaLetras(sopaLetras);
				}
				
			}else if(option == 3) {			// Jugar
				
				if(create == false) {
					System.out.println("No hay ninguna sopa de letras creada. Use la opción \"Crear sopa de letras\" para crear una.\n");
				}else {
					jugar(sopaLetras);
				}				
				
			}else if(option == 4){			// Salir
				
				System.out.println("Cerrando sopa de letras...");
				exit = true;
				
			}
			
		}while(!exit);

	}
	
	/*
	 * 1.- Pedir al usuario el tamaño de la sopa de letras, éste debe ser cuadrado (debe tener el mismo número de filas y de columnas).
	 * 2.- Una vez creada la sopa de letras, el usuario deberá de añadir palabras dentro de la sopa, indicando la posición en la sopa y la orientación de la palabra.
	 * 3.- Cuando se añadan las palabras, terminar de rellenar la sopa con letras aleatorias (no incluir letras con acento).
	 */
	public static char[][] crearSopaLetras() {
		
		char sopa[][];
		int size;

		System.out.println("Indica el tamaño de la sopa de letra (mínimo 10): ");
		size = Teclado.compNum(10, Compare.Mayor_o_igual);
		
		sopa = new char[size][size];
		
		sopa = peticionPalabra(sopa, size);
		
		return sopa;
		
	}
	
	/*
	 * 1.- Pedir al usuario el número de palabras que desea añadir a la sopa de letras (mínimo 4, máximo 10)
	 * 2.- El usuario deberá indicar las palabras a añadir dentro de la sopa de letras.
	 * 	2.1.- Las palabras no deben tener una longitud mayor al tamaño de la sopa.
	 * 	2.2.- Deberán empezar en mayúscula y seguirse de al menos una letra minúscula.
	 * 	2.3.- En caso de ser compuesta, no deberán incluirse espacios, en su lugar, cada palabra deberá empezar por mayúscula sin espacio alguno.
	 * 	2.4.- La posición se indicará mediante fila y columna. Deberá respetarse el tamaño de la sopa, en caso contrario, se volverá a pedir la posición.
	 * 	2.5.- Las opciones de orientación posibles serán de derecha a izquierda y viceversa, de arriba hacia abajo y viceversa, y en diagonal en todos los sentidos posibles(arriba-izquierda, arriba-derecha, abajo-izquierda, abajo-derecha).
	 * 	2.7.- Se comprobará además que, en la posición en la que se indique la palabra, coincida con otra palabra, las letras que coincidan deben ser la misma (diferenciando mayúsculas de minúsculas). Si no coincide, no se introducirá la palabra.
	 * 	2.8.- En caso de no cumplir alguna de las restricciones, se deberá de avisar al usuario y tendrá que volver a introducir la palabra.
	 * 3.- Devolver la sopa con las letras incorporadas.
	 */
	public static char[][] peticionPalabra(char sopa[][], int size) {
		
		int wNum, row, column, orient, aid = 0, i, j, m, k;
		String word;
		boolean exit = true;
		
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++) {
				sopa[i][j] = ' ';
			}
		}
		
		System.out.println("¿De cuántas palabras dispondrá la sopa de letras? (Mín 4, máx 10): ");
		wNum = Teclado.rangNum(4, 10, Range.BothIncluded);
		
		palabras = new String[wNum];
		
		for(i = 0; i < wNum; i++) {
			
			do {
				exit = true;
				aid = 0;
				
				System.out.println("Indica una palabra: ");							// Pedir la palabra
				word = Teclado.readString();
				
				palabras[i] = word;
				
				System.out.println("Indica la fila: ");								// Pedir la fila
				row = Teclado.rangNum(1, size, Teclado.Range.BothIncluded) - 1;
				
				System.out.println("Indica la columna: ");
				column = Teclado.rangNum(1, size, Teclado.Range.BothIncluded) - 1;				// Pedir la columna
				
				System.out.println("\n 1.- De izquierda a derecha\n 2.- De derecha a izquierda\n 3.- De arriba hacia abajo\n 4.- De abajo hacia arriba\n 5.- Diagonal arriba-izquierda\n 6.- Diagonal arriba-derecha\n 7.- Diagonal abajo-izquierda\n 8.- Diagonal abajo-derecha");
				System.out.println("Indica la orientación de la palabra: ");		// Pedir la orientación de la palabra
				orient = Teclado.rangNum(1, 8, Range.BothIncluded);
				
				if(word.length() <= size) {
					
					if(word.matches("[A-ZÑ]{1}[a-zñ]+([A-ZÑ]{1}[a-zñ]*)*") == true) {
						
						if(orient == 1) {				// De izquierda a derecha
							if(column + word.length() <= size) {
								
								for(j = column, k = 0; k < word.length(); j++, k++) {		// Bucle para comprobar si hay palabras que se cruzan
									if(sopa[row][j] == ' ' || sopa[row][j] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									for(j = column, k = 0; k < word.length(); j++, k++) {	// Bucle para añadir la palabra
										sopa[row][j] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								exit = false;
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
							}
							
						}else if(orient == 2) {			// De derecha a izquierda
							if(column - word.length() >= -1) {
								
								for(j = column, k = 0; k < word.length(); j--, k++) {
									if(sopa[row][j] == ' ' || sopa[row][j] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									
									for(j = column, k = 0; k < word.length(); j--, k++) {
										sopa[row][j] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
								exit = false;
							}
							
						}else if(orient == 3) {			// De arriba hacia abajo
							if(row + word.length() <= size) {
								
								for(j = row, k = 0; k < word.length(); j++, k++) {
									if(sopa[j][column] == ' ' || sopa[j][column] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									
									for(j = row, k = 0; k < word.length(); j++, k++) {
										sopa[j][column] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
								exit = false;
							}
							
						}else if(orient == 4) {			// De abajo hacia arriba
							if(row - word.length() >= -1) {
								
								for(j = row, k = 0; k < word.length(); j--, k++) {
									if(sopa[j][column] == ' ' || sopa[j][column] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									
									for(j = row, k = 0; k < word.length(); j--, k++) {
										sopa[j][column] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
								exit = false;
							}
							
						}else if(orient == 5) {			// Diagonal arriba-izquierda
							if(row - word.length() >= -1 && column - word.length() >= -1) {
								
								for(j = row, m = column, k = 0; k < word.length(); j--, m--, k++) {
									if(sopa[j][m] == ' ' || sopa[j][m] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									
									for(j = row, m = column, k = 0; k < word.length(); j--, m--, k++) {
										sopa[j][m] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
								exit = false;
							}
							
						}else if(orient == 6) {			// Diagonal arriba-derecha
							if(row - word.length() >= -1 && column + word.length() <= size) {
								
								for(j = row, m = column, k = 0; k < word.length(); j--, m++, k++) {
									if(sopa[j][m] == ' ' || sopa[j][m] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									
									for(j = row, m = column, k = 0; k < word.length(); j--, m++, k++) {
										sopa[j][m] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
								exit = false;
							}
							
						}else if(orient == 7) {			// Diagonal abajo-izquierda
							if(row + word.length() <= size && column - word.length() >= -1) {
								
								for(j = row, m  = column, k = 0; k < word.length(); j++, m--, k++) {
									if(sopa[j][m] == ' ' || sopa[j][m] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									
									for(j = row, m  = column, k = 0; k < word.length(); j++, m--, k++) {
										sopa[j][m] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
								exit = false;
							}
							
						}else if(orient == 8) {			// Diagonal abajo-derecha
							if(row + word.length() <= size && column + word.length() <= size) {
								
								for(j = row, m = column, k = 0; k < word.length(); j++, m++, k++) {
									if(sopa[j][m] == ' ' || sopa[j][m] == word.charAt(k)) {
										aid++;
									}
								}
								
								if(aid == word.length()) {
									
									for(j = row, m = column, k = 0; k < word.length(); j++, m++, k++) {
										sopa[j][m] = word.charAt(k);
									}
									
								}else {
									exit = false;
									System.out.println("La palabra coincide con otra con la cuál no comparte la misma letra en la intersección.");
								}
								
							}else {
								System.out.println("La palabra sobrepasa el tamaño de la sopa de letras.");
								exit = false;
							}
							
						}
						
					}else {
						exit = false;
						System.out.println("La palabra no tiene una sintaxis válida.");
					}
					
				}else {
					exit = false;
					System.out.println("La longitud de la palabra no puede ser mayor al tamaño de la sopa de letras.");
				}
				
			}while(!exit);
			
			System.out.println();
			
			for(j = 0; j < size; j++) {							// Mostrar la sopa de letras con la palabra actual añadida
				System.out.print((j + 1) + "\t");
				for(k = 0; k < size; k++) {
					
					System.out.print(" " + sopa[j][k] + " |");
					
				}
				System.out.println();
			}
			System.out.print("\t");
			for(j= 0; j < size; j++) {							// Números indicativos de las filas y columnas de la sopa
				if(j < 9) {
					System.out.print(" " + (j + 1) + "  ");
				}else {
					System.out.print(" " + (j + 1) + " ");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("Añadiendo letras aleatorias...");
		
		//sopa = rellenar(sopa, size);					// Forma iterativa
		
		sopa = rellenarR(sopa, size, 0, 0);				// Forma recursiva
		
		for(j = 0; j < size; j++) {							// Mostrar la sopa de letras completa
			System.out.print((j + 1) + "\t");
			for(k = 0; k < size; k++) {
				
				System.out.print(" " + sopa[j][k] + " |");
				
			}
			System.out.println();
		}
		System.out.print("\t");
		for(j= 0; j < size; j++) {							// Números indicativos de las filas y columnas de la sopa
			if(j < 9) {
				System.out.print(" " + (j + 1) + "  ");
			}else {
				System.out.print(" " + (j + 1) + " ");
			}
		}
		
		System.out.println();
		
		return sopa;
		
	}
	
	/*
	 * 1.- Añadir letras aleatorias en las celdas vacías de la sopa de letras actual.
	 * 	1.1.- Las letras pueden ser mayúsculas y minúsculas (se incluye la ñ, pero no los acentos)
	 * 2.- Devolver la sopa de letras completa.
	 */
	public static char[][] rellenar(char sopa[][], int size){			// Versión iterativa
		
		int i, j, aid;
		String words = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		for(i = 0; i < sopa.length; i++) {
			for(j = 0; j < sopa.length; j++) {
				
				if(sopa[i][j] == ' ') {
					aid = rand.nextInt(53 - 0 + 1) + 0;
					sopa[i][j] = words.charAt(aid);
				}
				
			}
		}
		
		return sopa;
		
	}
	
	public static char[][] rellenarR(char sopa[][], int size, int row, int column){
		
		int aid;
		String words = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		if(sopa[row][column] == ' ') {
			
			aid = rand.nextInt(53 - 0 + 1) + 0;
			sopa[row][column] = words.charAt(aid);
			
		}
		
		if(row == size - 1) {
			
			if(column == size - 1) {
				
				return sopa;
				
			}else {
				
				return rellenarR(sopa, size, row, column + 1);
				
			}
			
		}else if(column == size - 1) {
			
			return rellenarR(sopa, size, row + 1, 0);
			
		}else {
			
			return rellenarR(sopa, size, row, column + 1);
			
		}
		
	}
	
	/*
	 * 1.- Mostrar la última sopa de letras creada, enumerando las filas y columnas.
	 */
	public static void mostrarSopaLetras(char sopa[][]) {
		
		int j, k;
		
		for(j = 0; j < sopa.length; j++) {							// Mostrar la sopa de letras con la palabra actual añadida
			System.out.print((j + 1) + "\t");
			for(k = 0; k < sopa.length; k++) {
				
				System.out.print(" " + sopa[j][k] + " |");
				
			}
			System.out.println();
		}
		System.out.print("\t");
		for(j= 0; j < sopa.length; j++) {							// Números indicativos de las filas y columnas de la sopa
			if(j < 9) {
				System.out.print(" " + (j + 1) + "  ");
			}else {
				System.out.print(" " + (j + 1) + " ");
			}
		}
		
		System.out.println();
		
	}
	
	/*
	 * 1.- Mostrar la última sopa de letras creada, enumerando filas y columnas.
	 * 2.- Cuando el usuario encuentre una palabra en la sopa, éste deberá de introducir la posición de inicio y la orientación de la palabra.
	 * 	2.1.- Si la palabra es correcta, se mostrará la palabra encontrada de color rojo y el usuario obtendrá 50 pts.
	 * 	2.2.- En caso contrario, se le restarán 25pts.
	 * 	2.3.- Al completar la sopa, en caso de que la puntuación sea un número negativo, éste pasará a cero.
	 * 	2.4.- Cada vez que haga el intento de mostrar una palabra, tanto si es correcta como si no, se añadirá uno al número de intentos.
	 * 3.- Cuando encuentre todas las palabras, se le mostrará al usuario la puntuación y el número de intentos.
	 */
	public static void jugar(char sopa[][]) {
		
		boolean end = false;
		int pts = 0, tries = 0, i, j, k, row, column, orient;
		String sopaLetras[][] = new String[sopa.length][sopa.length];
		
		for(i = 0; i < sopa.length; i++) {			// Pasar la sopa de letras de tipo char a un array de tipo String para poder colorear las letras.
			for(j = 0; j < sopa.length; j++) {
				
				sopaLetras[i][j] = String.valueOf(sopa[i][j]);
				
			}
		}
		
		do {
		
			for(i = 0; i < sopaLetras.length; i++) {							// Mostrar la sopa de letras completa
				System.out.print((i + 1) + "\t");
				for(j = 0; j < sopaLetras.length; j++) {
					
					System.out.print(" " + sopaLetras[i][j] + " |");
					
				}
				System.out.println();
			}
			System.out.print("\t");
			for(i = 0; i < sopaLetras.length; i++) {							// Números indicativos de las filas y columnas de la sopa
				if(i < 9) {
					System.out.print(" " + (i + 1) + "  ");
				}else {
					System.out.print(" " + (i + 1) + " ");
				}
			}
			
			System.out.println();
			
			System.out.println("Indica la fila de la palabra que has encontrado: ");
			row = Teclado.rangNum(1, sopaLetras.length, Teclado.Range.BothIncluded);
			
			System.out.println("Indica la columna de la palabra que has encontrado: ");
			column = Teclado.rangNum(1, sopaLetras.length, Teclado.Range.BothIncluded);
			
			System.out.println("\n 1.- De izquierda a derecha\n 2.- De derecha a izquierda\n 3.- De arriba hacia abajo\n 4.- De abajo hacia arriba\n 5.- Diagonal arriba-izquierda\n 6.- Diagonal arriba-derecha\n 7.- Diagonal abajo-izquierda\n 8.- Diagonal abajo-derecha");
			System.out.println("Indica la orientación de la palabra: ");		// Pedir la orientación de la palabra
			orient = Teclado.rangNum(1, 8, Range.BothIncluded);
			
			if(orient == 1) {
				//for()
				
			}else if(orient == 2) {
				
			}else if(orient == 3) {
				
			}else if(orient == 4) {
				
			}else if(orient == 5) {
				
			}else if(orient == 6) {
				
			}else if(orient == 7) {
				
			}else if(orient == 8) {
				
			}
		
		}while(!end);
		
	}
	
}
