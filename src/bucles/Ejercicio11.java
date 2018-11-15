package bucles;
import java.util.Scanner;

public class Ejercicio11 {
	
/*
 * 1.- Pedir un número entero.
 * 2.- Sumar números a partir de uno hasta que la suma de dichos números exceda el número pedido.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, i = 0, result = 0;
		
		System.out.println("Introduce un número entero: ");
		num = scan.nextInt();
		scan.close();
		
		while(result <= num) {
			i++;
			result = result + i;
		}
		
		for(int j = 1; j<=i; j++) {
			if(j == i) {
				System.out.printf("%d = ", j);
			}else {
				System.out.printf("%d + ", j);
			}
		}
		
		System.out.println(result);
		System.out.println("El último número es = " + i);

	}

}
