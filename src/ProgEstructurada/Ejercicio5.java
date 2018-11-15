package ProgEstructurada;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean party;
		String work;
		double hour, resul = 0, day = 3, night = 4.80;
		
		System.out.println("Jornada diurna(d) o nocturna (n): ");
		work = scan.nextLine();
		
		System.out.println("¿Festivo?: ");
		party = scan.nextBoolean();
		
		System.out.println("Nº horas trabajadas: ");
		hour = scan.nextDouble();
		scan.close();
		
		if(party == true) {
			day = day + 1.20;
			night = night + 1.80;
		}
		
		switch(work){
			case "d":
				resul = hour * day;
				break;
			case "n":
				resul = hour * night;
				break;
		}
		
		System.out.println("Le pertenece la siguiente cantidad: " + resul);

	}

}
