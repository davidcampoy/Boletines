package ProgEstructurada;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int read;
		String resul;
		
		read = scan.nextInt();
		scan.close();
		
		if(read > 0) {
			resul = "positive";
		}else if(read < 0){
			resul = "negative";
		}else {
			resul = "zero";
		}
		
		System.out.println(resul);		

	}

}
