package bucles;
import java.util.Scanner;

public class Ejercicio20 {
	
	/*
	 * 1.- Pedir la base del triángulo al usuario.
	 * 2.- Pintar un triángulo con el número de líneas indicado por el usuario.
	 * 3.- En el centro de cada línea deberá pintarse el número que corresponde con la línea.
	 * 4.- Ambos lados de dicho número, deberán seguirse de los números inferiores a éste hasta el 1.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int base, num = 1, count = 1;
		
		System.out.println("Escribe la base del triángulo: ");
		base = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= base; i++) { // Filas
			
			for(int j = 1; j <= base-i; j++) { // Espacios
				System.out.print(" ");
			}
			
			for(int k = base; k > base-(i*2-1); k--) { // Asteriscos
				System.out.print(num);
				
				if(count < i) {  // Contador del número que se irá imprimiendo secuencialmente en cada línea.
					num++;
				}else {
					num--;
				}
				
				count ++;
				
			}
			
			count = 1; // Reseteo de ambos contadores.
			num = 1;
			
			System.out.println("");
			
		}

	}

}
