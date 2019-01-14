package arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	
	/*
	 * 1.- Pedir al usuario que rellene una tabla bidimensional.
	 * 1.1.- El usuario deberá indicar primero cuántas filas y columnas tendrá éste.
	 * 1.2.- Después, deberá rellenar la tabla con números enteros.
	 * 2.- Calcular la suma de cada fila y cada columna y mostrar cada resultado.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int table[][], row = 0, column = 0, i, j, count = 0, aid = 0;
		boolean end = true;
		
		do {			// Petición del número de filas
			
			try {
				
				System.out.println("Indica el número de filas: ");
				row = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
				
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		do {			// Petición del número de columnas
			
			try {
				
				System.out.println("Indica el número de columnas: ");
				column = scan.nextInt();
				
			}catch(InputMismatchException e) {
				end = false;
				
			}finally {
				scan.nextLine();
			}
			
		}while(!end);
		
		table = new int[row][column];	// Creación de la tabla
		
		for(i = 0; i < row; i++) {		// Rellenar la tabla
			aid = 0;
			
			for(j = 0; j < column; j++) {
				aid++;
				
				if(aid == 1) {
					System.out.println("Fila " + (i + 1));
				}
				
				do {
					end = true;
					
					try {
						
						System.out.printf("Rellena la columna %d: ", (j + 1));
						table[i][j] = scan.nextInt();
						
					}catch(InputMismatchException e) {
						end = false;
						System.out.println("Error, rellena la casilla con un valor válido.\n");
						
					}finally {
						scan.nextLine();
					}
					
				}while(!end);
				
			}
			
			System.out.println();
			
		}
		
		scan.close();
		
		for(i = 0; i < row; i++) {		// Suma de las filas
			
			for(j = 0; j < column; j++) {
				
				count += table[i][j];
				
			}
			
			System.out.printf("La suma de la fila %d es igual a %d.\n", (i + 1), count);
			
			count = 0;	// Resetear el contador para no añadir el último resultado a la siguiente fila
			
		}
		
		System.out.println();
		
		for(i = 0; i < column; i++) {	// Suma de las columnas
			
			for(j = 0; j < row; j++) {
				
				count += table[j][i];
				
			}
			
			System.out.printf("La suma de la columna %d es igual a %d.\n", (i + 1), count);
			
			count = 0;	// Resetear el contador para no añadir el último resultado a la siguiente columna
			
		}

	}

}
