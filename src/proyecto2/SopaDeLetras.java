package proyecto2;
import java.util.Scanner;

import proyectos.Teclado;

public class SopaDeLetras {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int option;
		boolean exit = false;
		String SopaLetras[][];
		
		do {
			
			System.out.println("Elige una opción: \n\t 1.- Crear sopa de letras.\n\t 2.- Mostrar sopa de letras.\n\t 3.- Jugar a la sopa de letras.\n\t 4.- Salir.");
			option = Teclado.rangNum(1, 4, Teclado.Range.BothIncluded);
			
			if(option == 1) {				// Crear
				
				SopaLetras = crearSopaLetras();
				
			}else if(option == 2) {			// Mostrar
				
				
				
			}else if(option == 3) {			// Jugar
				
				
				
			}else if(option == 4){			// Salir
				
				System.out.println("Cerrando sopa de letras...");
				exit = true;
				
			}
			
		}while(!exit);

	}
	
	/*
	 * 1.- Pedir al usuario el tamaño de la sopa de letras, éste debe ser cuadrado (debe tener el mismo número de filas y de columnas).
	 * 2.- Una vez creada la sopa de letras, el usuario deberá de añadir palabras dentro de la sopa, indicando la posición en la sopa y la orientación de la palabra.
	 * 2.1.- Las palabras no deben tener una longitud mayor al tamaño de la sopa.
	 * 2.2.- Deberán empezar en mayúscula y seguirse de al menos una letra minúscula.
	 * 2.3.- En caso de ser compuesta, no deberán incluirse espacios, en su lugar, cada palabra deberá empezar por mayúscula sin espacio alguno.
	 * 2.4.- La posición se indicará mediante fila y columna. Deberá respetarse el tamaño de la sopa, en caso contrario, se volverá a pedir la posición.
	 * 2.5.- Las opciones de orientación posibles serán de derecha a izquierda y viceversa, de arriba hacia abajo y viceversa, y en diagonal en todos los sentidos posibles(arriba-izquierda, arriba-derecha, abajo-izquierda, abajo-derecha).
	 * 2.6.- En caso de no cumplir alguna de las restricciones, se deberá de avisar al usuario y tendrá que volver a introducir la palabra.
	 * 3.- Cuando se añadan las palabras, terminar de rellenar la sopa con letras aleatorias (no incluir letras con acento).
	 * 
	 */
	public static String[][] crearSopaLetras() {
		
		String sopa[][];
		
		
		return sopa;
		
	}

}
