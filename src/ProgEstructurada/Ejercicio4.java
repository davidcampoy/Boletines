package ProgEstructurada;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int days;
		double km, resul;
		
		System.out.println("Introduce los kilómetro: ");
		km = scan.nextInt();
		
		System.out.println("Introduce los días de estancia: ");
		days = scan.nextInt();
		scan.close();
		
		if(km > 1000 && days > 7){
			resul = (km * 0.35) * 30 / 100;
		}else {
			resul = km * 0.35;
		}
		
		System.out.println(resul);

	}

}
