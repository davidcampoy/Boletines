package ProgEstructurada;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Primer nº: ");
		num1 = scan.nextInt();
		
		System.out.println("Segundo nº: ");
		num2 = scan.nextInt();
		
		System.out.println("Tercer nº: ");
		num3 = scan.nextInt();
		scan.close();
		
		if(num1 < num2 && num1 < num3) {
			System.out.print(num1);
			if(num2 < num3) {
				System.out.print(num2);
				System.out.print(num3);
			}else {
				System.out.print(num3);
				System.out.print(num2);
			}
		}else if(num2 < num1 && num2 < num3) {
			System.out.print(num2);
			if(num1 < num3) {
				System.out.print(num1);
				System.out.println(num3);
			}else {
				System.out.print(num3);
				System.out.print(num1);
			}
		}else if(num3 < num1 && num3 < num2){
			System.out.print(num3);
			if(num1 < num2) {
				System.out.print(num1);
				System.out.print(num2);
			}else {
				System.out.print(num2);
				System.out.print(num1);
			}
		}

	}

}
