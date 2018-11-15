package ProgEstructurada;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		String resul;
		
		System.out.println("Primer número: ");
		num1 = scan.nextInt();
		
		System.out.println("Segundo número: ");
		num2 = scan.nextInt();
		
		System.out.println("Trecer número: ");
		num3 = scan.nextInt();
		scan.close();
		
		if(num1 == num2 && num1 == num3) {
			resul = "Los tres números son iguales.";
		}else if(num1 == num3) {
			resul = "Son iguales el primer y el tercer número.";
		}else if(num2 == num3) {
			resul = "Son iguales el segundo y tercer número.";
		}else {
			resul = "Ninguno de los números son iguales.";
		}
		
		System.out.println(resul);

	}

}
