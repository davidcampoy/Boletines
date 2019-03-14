package arrays;

import proyectos.Teclado;
import proyectos.Teclado.Compare;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int table[][] = new int[3][3], aid[][] = new int[3][3];
		int i, j, k, m;
		boolean equals = true;
		
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++) {
				
				System.out.println("Escribe un número mayor a 0 para esta casilla: ");
				table[i][j] = Teclado.compNum(0, Compare.Mayor);
				
				for(k = 0; k < 3; k++) {
					for(m = 0; m < 3; m++) {
						
						System.out.print(table[k][m]);
						System.out.print(" ");
						
					}
					System.out.println();
				}
				
			}
		}
		
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++) {
				aid[j][i] = table[i][j];
			}
		}
		
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++) {
				if(table[i][j] != aid[i][j]) {
					equals = false;
				}
			}
		}
		
		if(equals) {
			System.out.println("La tabla es simétrica.");
		}else {
			System.out.println("La tabla no es simétrica.");
		}

	}

}
