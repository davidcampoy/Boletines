package ProgEstructurada;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		String resul;
		
		System.out.println("Primer número: ");
		num1 = scan.nextInt();
		
		System.out.println("Segundo número");
		num2 = scan.nextInt();
		scan.close();
		
		if(num1 % num2 == 0) {
			resul = "Es múltiplo";
		}else {
			resul = "No es múltiplo";
		}
		
		System.out.println(resul);

	}

}
