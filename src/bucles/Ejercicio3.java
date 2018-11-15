package bucles;
import java.util.Scanner;

public class Ejercicio3 {
	
/*
 * 1.- Pedir 10 notas y contar cuántas de ellas son deficientes, insuficientes, aprobados, bien, notables y sobresalientes.
 * 2.- Mostrar resultados.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int note = 0, def = 0, ins = 0, apr = 0, bn = 0, not = 0, sobr = 0;
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Introduce una nota: ");
			note = scan.nextInt();
			
			if(note == 0 || note == 1 || note == 2) {
				def++;
			}else if(note == 3 || note == 4) {
				ins++;
			}else if(note == 5) {
				apr++;
			}else if(note == 6) {
				bn++;
			}else if(note == 7 || note == 8) {
				not++;
			}else if(note == 9 || note == 10) {
				sobr++;
			}
		}
		
		scan.close();
		
		System.out.printf("Deficientes: %d \nInsuficientes: %d \nAprobados: %d \nBien: %d \nNotables: %d \nSobresalientes: %d", def, ins, apr, bn, not, sobr);

	}

}
