package bucles;
import java.util.Scanner;

public class Ejercicio22 {
	
	/*
	 * 1.- Pintar ajedrez.
	 * 2.- Preguntar al usuario una posición del tablero y pintar en él un alfil.
	 * 3.- Según la posición del alfil, pintar en rojo las casillas a donde podría ir dicho alfil.
	 * 4.- Preguntar al usuario si desea seguir con el programa.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String reset = "\u001B[0m", white = "\u001B[47m", black = "\u001B[40m", red = "\u001B[41m", alfil = "\u265F", end;
		int row, column;
		
		do {
			
			System.out.println("Indica la fila del tablero: ");
			row = scan.nextInt();
			
			System.out.println("Indica la columna del tablero: ");
			column = scan.nextInt();
			
			scan.nextLine();
			
			for(int i = 1; i <= 8; i++) {
				for(int j = 1; j <= 8; j++) {
					if(i % 2 != 0 && j % 2 != 0) {
						if(i == row && j == column) {
							System.out.print(white + " " + alfil + "  ");
						}else if(i + j == row + column || i - j == row - column){
							System.out.print(red + "   ");
						}else {
							System.out.print(white + "   ");

						}
						
					}else if(i % 2 != 0 && j % 2 == 0) {
						if(i == row && j == column) {
							System.out.print(black + " " + alfil + "  ");
						}else if(i + j == row + column || i - j == row - column){
							System.out.print(red + "   ");
						}else {
							System.out.print(black + "   ");

						}

					}else if(i % 2 == 0 && j % 2 != 0) {
						if(i == row && j == column) {
							System.out.print(black + " " + alfil + "  ");
						}else if(i + j == row + column || i - j == row - column){
							System.out.print(red + "   ");
						}else {
							System.out.print(black + "   ");
						}
						
					}else {
						if(i == row && j == column) {
							System.out.print(white + " " + alfil + "  ");
						}else if(i + j == row + column || i - j == row - column){
							System.out.print(red + "   ");
						}else {
							System.out.print(white + "   ");
						}
					}
				}
				System.out.println("");
			}
			
			System.out.println(reset + "¿Desea continuar?: ");
			end = scan.nextLine();
		
		}while(end.equals("si"));
		
		scan.close();
		
		System.out.println("Cerrando...");

	}

}
