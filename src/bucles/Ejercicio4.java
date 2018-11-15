package bucles;
import java.util.Random;

public class Ejercicio4 {
	
// Mostrar 20 lanzamientos de un dado de 6 caras.

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(rand.nextInt(6)+1);
		}

	}

}
