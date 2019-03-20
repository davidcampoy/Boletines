package arrays;

import proyectos.Teclado;
import proyectos.Teclado.Compare;

public class Ejercicio11 {
	
	/*
	 * 1.- Crear una lista con filas y columnas y pedir al usuario que la rellene con números enteros.
	 * 2.- Comprobar si existe alguna fila idéntica a alguna columna y viceversa. En caso de encontrase alguna, indicar el número de filas y de columnas que son iguales.
	 */

	public static void main(String[] args) {
		
		int list[][] = new int [3][3];
		int num, i, j, k, m, count = 0;
		boolean noCoincidences = true;
		
		for(i = 0; i < list.length; i++) {					// Rellenar tabla
			for(j = 0; j < list.length; j++) {
				
				System.out.printf("Fila %d Columna %d, Indica un número entero: ", i+1, j+1);
				num = Teclado.compNum(0, Compare.Mayor_o_igual);
				
				list[i][j] = num;
				
				for(k = 0; k < list.length; k++) {
					for(m = 0; m < list.length; m++) {
						
						System.out.print(list[k][m]);
						System.out.print(" ");
						
					}
					System.out.println();
				}
				
			}
		}
		
		for(i = 0; i < list.length; i++) {					// Comprobar si existen similitudes entre filas y columnas
			
			for(j = 0; j < list.length; j++) {
				count = 0;
				
				for(k = 0; k < list.length; k++) {
					
					if(list[i][k] == list[k][j]) {
						count++;
					}
				}
				
				if(count == 3) {
					System.out.printf("La fila %d es similar a la columna %d.\n", i+1, j+1);
					noCoincidences = false;
				}
				
			}
			
		}
		
		if(noCoincidences) {
			System.out.println("Sin coincidencias.");
		}

	}

}
