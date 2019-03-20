package arrays;

import proyectos.Teclado;
import proyectos.Teclado.Compare;

public class Ejercicio10 {
	
	/*
	 * 1.- Pedir al usuario números comprendidos entre 0 y 9, en el momento en el que el usuario quiera dejar de introducir números, éste deberá introducir un número negativo para parar la lectura.
	 * 2.- Realizar un histograma de los números que ha introducido el usuario.
	 */

	public static void main(String[] args) {
		
		String histograma[][];
		int nums[] = new int[10], num;
		int maxNum = 0;
		int i, j, k;
		
		do {				// Petición de los números
			
			System.out.print("Introduce un número (entre 0 y 9): ");
			num = Teclado.compNum(9, Compare.Menor_o_igual);
			
			if(num >= 0) {
				nums[num]++;
			}
			
			System.out.println();
			
		}while(num >= 0);
		
		for(i = 0; i < nums.length; i++) {		// Buscar el mayor número repetido
			
			if(nums[i] > maxNum) {
				maxNum = nums[i];
			}
			
		}
		
		histograma = new String[maxNum][10];		// Inicializar el histograma con tantas filas como el mayor número repetido y 10 columnas
		
		for(i = 0, k = maxNum; i < maxNum; i++, k--) {		// Colocar asteriscos en las posiciones correctas
			for(j = 0; j < 10; j++) {
				
				if(nums[j] == k) {
					histograma[i][j] = "* ";
					nums[j]--;
				}else {
					histograma[i][j] = "  ";
				}
				
			}
		}
		
		for(i = 0; i < maxNum; i++) {				// Mostrar histograma
			for(j = 0; j < 10; j++) {
				
				System.out.print(histograma[i][j]);
				
			}
			System.out.println();
		}
		
		for(i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

	}

}
