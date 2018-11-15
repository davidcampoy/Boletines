package bucles;
import java.util.Scanner;

public class Ejercicio6 {
	
/*
 * 1.- Pedir un número del uno al cinco al usuario.
 * 2.- Según el número indicado, seleccionar suma, resta, multiplicación o división.
 * 3.- Pedir dos números enteros y calcular según la opción indicada.
 * 4.- Repetir la petición de la opción hasta que el usuario quiera salir, para ello el usuario deberá indicar la opción 5.
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, result = 0, select = 0;
		
		do {
			
			System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir\nElige una de las opciones: ");
			select = scan.nextInt();
			
			if(select == 1) {
				System.out.println("Ha seleccionado suma");
				
				System.out.println("Indica el primer número: ");
				num1 = scan.nextInt();
				
				System.out.println("Indica el segundo número: ");
				num2 = scan.nextInt();
				
				result = num1 + num2;
				
				System.out.printf("%d + %d = %d\n\n", num1, num2, result);
				
			}else if(select == 2) {
				System.out.println("Ha seleccionado resta");
				
				System.out.println("Indica el primer número: ");
				num1 = scan.nextInt();
				
				System.out.println("Indica el segundo número: ");
				num2 = scan.nextInt();
				
				result = num1 - num2;
				
				System.out.printf("%d - %d = %d\n\n", num1, num2, result);
			}else if(select == 3) {
				System.out.println("Ha seleccionado multiplicación");
				
				System.out.println("Indica el primer número: ");
				num1 = scan.nextInt();
				
				System.out.println("Indica el segundo número: ");
				num2 = scan.nextInt();
				
				result = num1 * num2;
				
				System.out.printf("%d * %d = %d\n\n", num1, num2, result);
			}else if(select == 4) {
				System.out.println("Ha seleccionado división");
				
				System.out.println("Indica el primer número: ");
				num1 = scan.nextInt();
				
				System.out.println("Indica el segundo número: ");
				num2 = scan.nextInt();
				
				result = num1 / num2;
				
				System.out.printf("%d / %d = %d\n\n", num1, num2, result);
			}
			
		}while(select != 5);
		
		scan.close();
		
		System.out.println("\n\nCerrando...");

	}

}
