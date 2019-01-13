package arrays;

public class Ejercicio7 {
	
	/*
	 * 1.- Mostrar una lista tridimensional (fila, columna, profundidad) de números enteros.
	 * 2.- Mostrar de esa lista cuál es el número mayor y en qué posición se encuentra.
	 */

	public static void main(String[] args) {
		
		double list[][][] = {{{7.74, 4.67, 5.25}, {1.02, 8.13, 6.98}}, {{4.58, 9.47, 7.36}, {5.21, 7.48, 5.76}}, {{6.36, 2.54, 3.35}, {4.89, 1.81, 3.54}}};
		double num = 0;
		int i, j, k, table = 0, row = 0, column = 0;
		
		// Mostrar la lista completa
		for(i = 0; i < 3; i++) {			// Nº de tabla
			System.out.println("Tabla " + (i + 1));
			
			for(j = 0; j < 2; j++) {		// Nº de fila
				
				for(k = 0; k < 3; k++) {	// Nº de columna
					
					System.out.print(list[i][j][k]);
					System.out.print("  ");
					
				}
				
				System.out.println();
				
			}
			
			System.out.println();
			
		}
		
		// Buscar el número más alto
		for(i = 0; i < 3; i++) {			// Nº de tabla
			
			for(j = 0; j < 2; j++) {		// Nº de fila
				
				for(k = 0; k < 3; k++) {	// Nº de columna
					
					if(list[i][j][k] > num) {
						
						num = list[i][j][k];
						table = i;
						row = j;
						column = k;
						
					}
					
				}
				
			}
			
		}
		
		System.out.printf("El mayor número de la lista es el %.2f, se encuentra en la tabla %d, fila %d y columna %d", num, (table + 1), (row + 1), (column + 1));

	}

}
