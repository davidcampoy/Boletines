package ProgEstructurada;
import java.util.Random;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int i = rand.nextInt(13)+1, x = rand.nextInt(4)+1;
		String card, stick = "";
		
		if(i == 1) {
			card = "As";
		}else if(i == 11) {
			card = "Jota";
		}else if(i == 12) {
			card = "Reina";
		}else if(i == 13) {
			card = "Rey";
		}else {
			card = String.valueOf(i);
		}
		
		switch(x) {
		case 1:
			stick = "\u2660";
			break;
		case 2:
			stick = "\u2663";
			break;
		case 3:
			stick = "\u2665";
			break;
		case 4:
			stick = "\u2666";
			break;
		}
		
		System.out.println(card + stick);

	}

}
