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
	 * 3.- Cuando se añadan las palabras, terminar de rellenar la sopa con letras aleatorias (no incluir letras con acento).
	 * 
	 */
	public static String[][] crearSopaLetras() {
		
		String sopa[][];
		
		
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
	 * 	2.6.- En caso de no cumplir alguna de las restricciones, se deberá de avisar al usuario y tendrá que volver a introducir la palabra.
	 * 3.- Devolver la sopa con las letras incorporadas.
	 */
	public static String[][] peticionPalabra(String sopa[][]) {
		
		
		
		return sopa;
		
	}
	
	/*
	 * 1.- Añadir letras aleatorias en las celdas vacías de la sopa de letras actual.
	 * 	1.1.- Las letras pueden ser mayúsculas y minúsculas (se incluye la ñ, pero no los acentos)
	 * 2.- Devolver la sopa de letras completa.
	 */
	public static String[][] rellenar(String sopa[][]){
		
		
		
		return sopa;
		
	}
	
	/*
	 * 1.- Mostrar la última sopa de letras creada, enumerando las filas y columnas.
	 */
	public static void mostrarSopaLetras(String sopa[][]) {
		
		
		
	}
	
	/*
	 * 1.- Mostrar la última sopa de letras creada, enumerando filas y columnas.
	 * 2.- Cuando el usuario encuentre una palabra en la sopa, éste deberá de introducir la posición de inicio y la orientación de la palabra.
	 * 	2.1.- Si la palabra es correcta, se mostrará la palabra encontrada de color rojo y el usuario obtendrá 50 pts.
	 * 	2.2.- En caso contrario, se le restarán 25pts.
	 * 	2.2.- El número de puntos no puede ser un número negativo.
	 * 	2.2.- Cada vez que haga el intento de mostrar una palabra, tanto si es correcta como si no, se añadirá uno al número de intentos.
	 * 3.- Cuando encuentre todas las palabras, se le mostrará al usuario la puntuación y el número de intentos.
	 */
	public static void jugar(String sopa[][]) {
		
		
		
	}

}
