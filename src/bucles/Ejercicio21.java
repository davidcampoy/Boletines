package bucles;

public class Ejercicio21 {
	
	/*
	 * 1.- Pintar un cuadrado 8x8.
	 * 1.1.- Si la línea es impar, las columnas impares serán blancas y las pares negras.
	 * 1.2.- En las líneas pares, las columnas impares serán negras y las pares blancas.
	 */

	public static void main(String[] args) {
		
		String white = "\u001B[47m", black = "\u001B[40m";
		
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= 8; j++) {
				if(i % 2 != 0 && j % 2 != 0) {
					System.out.print(white + "  ");
				}else if(i % 2 != 0 && j % 2 == 0) {
					System.out.print(black + "  ");
				}else if(i % 2 == 0 && j % 2 != 0) {
					System.out.print(black + "  ");
				}else {
					System.out.print(white + "  ");
				}
			}
			System.out.println("");
		}

	}

}
